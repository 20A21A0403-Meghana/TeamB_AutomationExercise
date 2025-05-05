package product_Test;
	import java.awt.AWTException;
	import java.awt.Robot;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.github.dockerjava.core.NameParser.ReposTag;

import GenericRepository.BaseConfig;
import io.github.bonigarcia.wdm.WebDriverManager;

	public class TestCase_12 extends BaseConfig{
		@Test
		public void Add_Products_in_Cart() throws InterruptedException {
		

			        //Configure the Browser
					WebDriverManager.chromedriver().setup();

					//Step_1:Launch the Browser
					WebDriver driver=new ChromeDriver();
					
					driver.manage().window().maximize();
					
					//Step_2,3:Navigate the appln Via Url
					driver.get("https://www.automationexercise.com/");
					System.out.println("home page is visibled");
					
					//Step_4:Click on "Products" Button
					driver.findElement(By.xpath("(//a[@href=\"/products\"])[1]")).click();
					
					//Step_5:Perform Hovering Action and Click on Add to cart
					JavascriptExecutor js = (JavascriptExecutor)driver;
					
					//Identify the WebElement for Subscription
					WebElement element = driver.findElement(By.xpath("//a[@href=\"/product_details/1\"]"));
					
					js.executeScript("arguments[0].scrollIntoView(false)",element);
					System.out.println(" Hovering 1 done Successfully");
					driver.findElement(By.xpath("(//a[@data-product-id=\"1\"])[1]")).click();
					Thread.sleep(3000);
					//Step6:Click on Continue Shopping button
					driver.findElement(By.xpath("//button[@data-dismiss=\"modal\"]")).click();
					System.out.println("Continue Shopping cliked");
					
					//Step_7:Perform Hovering Action for 2nd product and Click on Add to cart
					//Identify the WebElement for Subscription
					WebElement element1 = driver.findElement(By.xpath("//a[@href=\"/product_details/2\"]"));
					
					js.executeScript("arguments[0].scrollIntoView(false)",element1);
					System.out.println(" Hovering 2 done Successfully");
					driver.findElement(By.xpath("(//a[@data-product-id=\"2\"])[1]")).click();
					
					Thread.sleep(3000);
					//Step_8:Click view Cart button
					driver.findElement(By.xpath("//u[text()='View Cart']")).click();
					
					//Step_9:verify both Products are added to Cart
					WebElement web = driver.findElement(By.xpath("//a[text()='Blue Top']"));
					boolean b=web.isDisplayed();
					if(b) {
						System.out.println("Product is added");
					}
					else {
						System.out.println("Prod is not added");
					}
					WebElement web2 = driver.findElement(By.xpath("//a[text()='Men Tshirt']"));
					boolean b1=web2.isDisplayed();
					if(b1) {
						System.out.println("Product is added");
					}
					else {
						System.out.println("Prod is not added");
					}
					
					
					System.out.println("both Products are added");
					
					//Step_10:Verify their prices ,Quantity and Total Prices
					WebElement elmt=driver.findElement(By.xpath("//td[@class='cart_price']"));
					System.out.println(elmt.getText());
					WebElement elmt1=driver.findElement(By.xpath("(//button[@class='disabled'])[1]"));
					System.out.println(elmt1.getText());
					WebElement elmt2=driver.findElement(By.xpath("(//p[@class='cart_total_price'])[1]"));
					System.out.println(elmt2.getText());
					
					WebElement elmt11=driver.findElement(By.xpath("(//td[@class='cart_price'])[2]"));
					System.out.println(elmt11.getText());
					
					WebElement elmt12=driver.findElement(By.xpath("(//button[@class='disabled'])[2]"));
					System.out.println(elmt12.getText());
					
					WebElement elmt13=driver.findElement(By.xpath("(//p[@class='cart_total_price'])[2]"));
					System.out.println(elmt13.getText());
					
					Reporter.log("Product deatils are Visible",true);

					driver.close();
		}
	}
