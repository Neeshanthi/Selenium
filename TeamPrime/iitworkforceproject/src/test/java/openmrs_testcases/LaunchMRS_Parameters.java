package openmrs_testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LaunchMRS_Parameters {
	
	WebDriver driver;
	
	@Parameters({"browser", "url"})
	@Test(priority=1)
	public void openurltest(String browser, String url) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		}
		
		//To fetch the url from the xml
		driver.get(url);
		String name = driver.getCurrentUrl();
		//verify that current url contains openmrs
		Assert.assertTrue(name.contains("openmrs"));
				
	}
	
	@Parameters({"username", "password"})
	@Test(priority=2)
	public void userDetails(String username, String password) throws InterruptedException {
		
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.id("Inpatient Ward")).click();
		
		driver.findElement(By.id("loginButton")).click();
		
	}
	

}
