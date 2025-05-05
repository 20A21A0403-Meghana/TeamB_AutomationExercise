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

public class TestCase_21 extends BaseConfig{
	
	@Test
	
	public void Add_review_on_product() {

		//1. Launch browser
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();

		//2. Navigate to url 'http://automationexercise.com'
driver.get("https://automationexercise.com");
//click on homepage
		//3. Click on 'Products' button
driver.findElement(By.xpath("(//div[@class='shop-menu pull-right']//child::ul//li)[2]//a")).click();
		//4. Verify user is navigated to ALL PRODUCTS page successfully
String result=driver.getCurrentUrl();
System.out.println(result);
if(result.equalsIgnoreCase("https://automationexercise.com/products"))
{
	System.out.println("TastCase Pass");
}
else
{
	System.out.println("TestCasepage Fail");
}
		//5. Click on 'View Product' button
	driver.findElement(By.xpath("(//div[@class='choose']//ul//li//a)[1]")).click();
		//6. Verify 'Write Your Review' is visible
	WebElement element=driver.findElement(By.xpath("//div[@class='col-sm-12']//ul//li//a"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true)", element);
	Boolean element2=element.isDisplayed();
	if(element2==true)
	{
		System.out.println("TestCasepage Pass");
	}
	else
	{
		System.out.println("TestCasepage Fail");
	}
		//7. Enter name, email and review
	driver.findElement(By.id("name")).sendKeys("Jyothi");
	driver.findElement(By.id("email")).sendKeys("jyothi3735@gmail.com");
	driver.findElement(By.name("review")).sendKeys("Good Quality");
		//8. Click 'Submit' button
	driver.findElement(By.id("button-review")).click();
	
		//9. Verify success message 'Thank you for your review.'
	WebElement element3=driver.findElement(By.xpath("//span[text()='Thank you for your review.']"));
	Boolean result3=element3.isDisplayed();
	if(result3==true)
	{
		System.out.println("TestCasepage Pass");
	}
	else
	{
		System.out.println("TestCasepage Fail");
	}
	Reporter.log("Test Execution Completed",true);

driver.close();
	}

}

