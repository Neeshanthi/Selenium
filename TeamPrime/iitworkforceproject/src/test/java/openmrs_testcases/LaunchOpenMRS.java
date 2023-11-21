package openmrs_testcases;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import prime_assignments.IntegrateExcelWithDP;



public class LaunchOpenMRS {

	WebDriver driver;
	
	@BeforeClass
	public void launchBrowser() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://demo.openmrs.org/openmrs/login.htm");
	System.out.println("Page title is: " + driver.getTitle());
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	}
	
	@DataProvider(name="loginData")
	public String[][] feedDP() throws Exception
	{
		String mydata[][] = IntegrateExcelWithDP.getExcelData();
		return mydata;
	}
	
	@Test(dataProvider="loginData")
	public void Login(String uname, String pwd) throws Exception {


		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("Inpatient Ward")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(1000);
		boolean result =driver.findElement(By.xpath("//h4[normalize-space()='Logged in as Super User (admin) at Inpatient Ward.']")).
				isDisplayed();
		driver.findElement(By.partialLinkText("Logout")).click();
		Assert.assertTrue(result);

	}
	
	@AfterClass
	public void closeBrowser() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}

}
