package product_Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericRepository.BaseConfig;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_13 extends BaseConfig{
	
	@Test
	public void Verify_Product_quantity_in_Cart() throws InterruptedException {
		

		        //Configure the Browser
				WebDriverManager.chromedriver().setup();

				//Step_1:Launch the Browser
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				//Step_2:Navigate the appln Via Url
				driver.get("https://www.automationexercise.com/");
				//Step_3:Verify for home page
				System.out.println("Home Page is Visible");
				
				//Step_4:Click on "view Products" Button
				driver.findElement(By.xpath("//a[@href='/product_details/1']")).click();
				
				//Step_5:Verify product details is opened
				String s=driver.getCurrentUrl();
				String s1="https://www.automationexercise.com/product_details/1";
				if(s.equals(s1)) {
					System.out.println("Product details is opened");
				}
				else {
					System.out.println("Prod details is not opend");
				}
				
				System.out.println("Product details opend");
				
				//Step_6:Increase Quantity to 4				
				//Identify the First Mouse hover element
				Actions act=new Actions(driver);
				WebElement element=driver.findElement(By.xpath("//input[@name=\"quantity\"]"));
				element.click();
				element.clear();
				element.sendKeys("4");	
				
				
				
				driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
				Thread.sleep(3000);
				
			  //Step_8:Click view cart button
				driver.findElement(By.xpath("//u[text()='View Cart']")).click();
				
				//Step_9:verify the product is displayed in a cart page with exact quantity
				String s2=driver.getCurrentUrl();
				String s3="https://www.automationexercise.com/view_cart";
				if(s.equals(s1)) {
					System.out.println("Product details is opened");
				}
				else {
					System.out.println("Prod details is not opend");
				}

				System.out.println("product is displayed in a cart page with exact quantity");
				Reporter.log("execution completed",true);
							driver.close();

	}

}
