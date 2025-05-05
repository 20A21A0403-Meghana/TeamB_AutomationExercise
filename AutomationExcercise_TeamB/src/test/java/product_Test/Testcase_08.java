package product_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericRepository.BaseConfig;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase_08 extends BaseConfig{

 
	@Test
	public void Verify_All_Products_and_product_detail_page() {
		
		//Configure thee Browser
		WebDriverManager.chromedriver().setup();
		
		//lunch the browser
		WebDriver driver=new ChromeDriver();
		
		//Navigate the url
		driver.get("https://www.automationexercise.com/test_cases");
		System.out.println("Home page displayed Successfully");
		
		//Click on Products button
		driver.findElement(By.xpath("//a[@href=\"/products\"]")).click();
		System.out.println("Products page displayed");
		System.out.println("Products list displayed");
		
		//Product details are displayed
		driver.findElement(By.xpath("//a[@href=\"/product_details/1\"]")).click();
		Reporter.log("Products details displayed",true);
		
		//Close the browser
		driver.close();
		
	}

}
