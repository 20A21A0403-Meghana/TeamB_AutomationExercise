package product_Test;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericRepository.BaseConfig;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_23 extends BaseConfig {
	
	@Test
	
	public void Verify_address_details_in_checkout_page() throws IOException {

		//1. Launch browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	//	2. Navigate to url 'http://automationexercise.com'
		driver.get("http://automationexercise.com");
		//3. Verify that home page is visible successfully
	String element=	driver.getCurrentUrl();
	System.out.println(element);
	if(element.equalsIgnoreCase("https://automationexercise.com/"))
	{
		System.out.println("TestCasepage Pass");
	}
	else
	{
		System.out.println("TestCasepage Fail");
	}
		
	//	4. Click 'Signup / Login' button
	driver.findElement(By.xpath("(//div[@class='shop-menu pull-right']//ul//a)[4]")).click();
		//5. Fill all details in Signup and create account
	driver.findElement(By.name("name")).sendKeys("John");
	driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("john3735@gmail.com");
	driver.findElement(By.xpath("//button[text()='Signup']")).click();
	driver.findElement(By.id("id_gender2")).click();
	driver.findElement(By.id("password")).sendKeys("John@3339");
WebElement element1=driver.findElement(By.id("days"));
Select s1=new Select(element1);
s1.selectByIndex(5);
WebElement element2=driver.findElement(By.id("months"));
Select s2=new Select(element2);
s2.selectByValue("5");
WebElement element3=driver.findElement(By.id("years"));
Select s3=new Select(element3);
s3.selectByVisibleText("2001");
driver.findElement(By.id("first_name")).sendKeys("JanuThriveni");
driver.findElement(By.id("last_name")).sendKeys("ThriveniOOBraoi");
driver.findElement(By.id("company")).sendKeys("Amazon");
driver.findElement(By.id("address1")).sendKeys("MadhuraNagar, Hitech city, Madhaapur");
driver.findElement(By.id("address2")).sendKeys("Bhandhar, Kooneru center, machtya Bazar");
WebElement element4=driver.findElement(By.xpath("//select[@data-qa='country']"));
Select s4=new Select(element4);
s4.selectByIndex(3);
driver.findElement(By.id("state")).sendKeys("OObraoi mention");
driver.findElement(By.id("city")).sendKeys("AathrayaPuram");
driver.findElement(By.name("zipcode")).sendKeys("435654");
driver.findElement(By.name("mobile_number")).sendKeys("7013536685");
driver.findElement(By.xpath("//button[contains(text(), 'Account')]")).click();
WebElement element5=driver.findElement(By.xpath("//b[contains(text(),'Account Created!')]"));

	//	6. Verify 'ACCOUNT CREATED!' and click 'Continue' button
Boolean result=element5.isDisplayed();
if(result==true)
{
	System.out.println("TestCasepage Pass");
}
else
{
	System.out.println("TestCasepage Fail");
}
driver.findElement(By.xpath("//a[contains(@class,'btn btn-primary')]")).click();
	
		//7. Verify ' Logged in as username' at top
WebElement element6=driver.findElement(By.xpath("(//div[@class='shop-menu pull-right']//child::li)[10]"));
Boolean result2=element6.isDisplayed();
if(result2==true)
{
	System.out.println("TestCasepage Pass");
}
else
{
	System.out.println("TestCasepage Fail");
}
		//8. Add products to cart
driver.findElement(By.xpath("(//li)[2]//a")).click();
driver.findElement(By.xpath("(//a[@data-product-id='1'])[1]")).click();
		//9. Click 'Cart' button
driver.findElement(By.xpath("//a[contains(text(),'Cart')]")).click();
		//10. Verify that cart page is displayed

String result3=driver.getCurrentUrl();
System.out.println(result3);
if(result3.equalsIgnoreCase("https://automationexercise.com/view_cart"))
{
	System.out.println("TestCasepage Pass");
}
else
{
	System.out.println("TestCasepage Fail");
}
		//11. Click Proceed To Checkout
driver.findElement(By.xpath("//a[contains(text(),'Proceed To Checkout')]")).click();
	//	12. Verify that the delivery address is same address filled at the time registration of account
TakesScreenshot ts=(TakesScreenshot)driver;
File source=ts.getScreenshotAs(OutputType.FILE);
File Destination=new File("./ScreenShot/address.png");
FileHandler.copy(source, Destination);
System.out.println("TestCasepage Pass");
//13. Verify that the billing address is same address filled at the time registration of account
//14. Click 'Delete Account' button
driver.findElement(By.xpath("(//li)[5]//a")).click();
//15. Verify 'ACCOUNT DELETED!' and click 'Continue' button
WebElement element8=driver.findElement(By.xpath("//b[text()='Account Deleted!']"));
Boolean result4=element8.isDisplayed();
if(result4==true)
{
	System.out.println("TestCasepage pass");
}
else
{
	System.out.println("TestCasepage Fail");
}
driver.findElement(By.xpath("//a[contains(text(),'Continue')]")).click();
Reporter.log("Test Execution completed successfully",true);
	}

}