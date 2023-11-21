package openmrs_testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchDynamicStocks {

	@Test
	public void FetchStockNames() {

		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		System.out.println("This is the page title: " + driver.getTitle());

		String StockDetails[] = { "Intellect Design", "Supriya Lifescience", "Glenmark Pharma", "Polycab India",
				"Astrazeneca" };
		for (int i = 0; i < StockDetails.length; i++) 
		{

			System.out.println("StockNames : " + StockDetails[i]);

			try {
				if (driver.findElement(By.xpath("//table[@class='dataTable']//a[contains(.,'" + StockDetails[i] + "')]"))
						.isDisplayed()) 
				{

					System.out.println("Stock is available in the data table: " + StockDetails[i]);
				} 
			}
				
				catch (Exception e)
				{
					System.out.println("Stock is not available in the data table: " + StockDetails[i]);
				}
			}

		}

	}


