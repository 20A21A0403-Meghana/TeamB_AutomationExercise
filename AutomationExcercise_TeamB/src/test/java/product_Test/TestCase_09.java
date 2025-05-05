package product_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericRepository.BaseConfig;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_09 extends BaseConfig{


	@Test
	public void Search_Product() {
		
	
		//Click on Poducts
		driver.findElement(By.xpath("//a[@href=\"/products\"]")).click();
		System.out.println("Products page displayed Successfully");
		
		//Search For he Products
		driver.findElement(By.xpath("//input[@id=\"search_product\"]")).sendKeys("polo");
		
		//select the poduc and Sumit
		driver.findElement(By.xpath("//button[@id=\"submit_search\"]")).click();
		Reporter.log("Related products are displayed Successfully",true);
		
		//Close the browser

		driver.close();
		
	}

}
