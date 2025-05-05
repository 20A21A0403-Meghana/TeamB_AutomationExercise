package product_Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericRepository.BaseConfig;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_19 extends BaseConfig{
	
	@Test
	
	public void  View_Cart_Brand_Products() {

		//Configure the browser
		WebDriverManager.chromedriver().setup();
		
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//navigate to the application
		driver.get("https://automationexercise.com");
        
		//maximize the browser
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		
		//Verify brands are visible or not
		WebElement brand = driver.findElement(By.xpath("//h2[text()='Brands']"));
		boolean res=brand.isDisplayed();
		if(res) {
			System.out.println("Brand is visible");
		}
		else {
			System.out.println("Brand is not visible");
		}
		
		//Click on brand
		driver.findElement(By.xpath("//a/span[text()='(6)']")).click();
		//Verify the brand related products are displayed or not
		WebElement poloBrand=driver.findElement(By.xpath("//h2[@class='title text-center']"));
		boolean res1=poloBrand.isDisplayed();
		if(res1) {
			System.out.println("Polo brand related products are displayed");
		}
		else {
			System.out.println("Polo brand related products are not displayed");
		}
		
		//Click on any brand
		driver.findElement(By.xpath("(//span[text()='(5)'])[1]")).click();
		//Verify the brand related products are displayed or not
		WebElement HMbrand=driver.findElement(By.xpath("//h2[@class='title text-center']"));
		boolean res2=HMbrand.isDisplayed();
		if(res2) {
			System.out.println("H&M brand related products are displayed");
		}
		else {
			System.out.println("H&M brand related products are not displayed");
		}
		
		Reporter.log("execution completed",true);
		//Close the browser
		driver.close();
	}

}
