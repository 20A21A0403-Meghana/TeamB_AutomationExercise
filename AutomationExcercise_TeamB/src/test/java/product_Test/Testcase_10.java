package product_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericRepository.BaseConfig;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase_10 extends BaseConfig{

	@Test
	public void Verify_Subscription_in_home_page() throws InterruptedException {
		
		//Perform ScrollActions
		WebElement element=driver.findElement(By.xpath("//h2[text()='Subscription']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)",element);
		
		//Enter Email in email txt field
		driver.findElement(By.xpath("//input[@id=\"susbscribe_email\"]")).sendKeys("ramya1@gmail.com");
		
		//Click on Right Arrow 
		driver.findElement(By.xpath("//i[@class=\"fa fa-arrow-circle-o-right\"]")).click();
		Thread.sleep(2000);
		Reporter.log("Successfully your Subscribed message displayed",true);
		
		//close the browser
		driver.close();
		
	}

}
