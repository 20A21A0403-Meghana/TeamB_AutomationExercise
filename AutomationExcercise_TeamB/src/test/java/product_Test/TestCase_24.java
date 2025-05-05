package product_Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericRepository.BaseConfig;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_24 extends BaseConfig {
	
	
	@Test
	public void Download_Invoice_after_purchase_order() {

		//1. Launch browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();			
		//2. Navigate to url 'http://automationexercise.com'
		driver.get("http://automationexercise.com");
		//3. Verify that home page is visible successfully
		String element=driver.getTitle();
		System.out.println(element);
		if(element.equals("Automation Exercise"))
		{
			System.out.println("homepage is visible sucessfully");
		}
		else
		{
			System.out.println("not visisble");
		}
		//4. Add products to cart
	driver.findElement(By.xpath("//a[@data-product-id='2']")).click();
	driver.findElement(By.xpath("(//a)[3]//i")).click();	
		//5. Click 'Cart' button
driver.findElement(By.xpath("(//ul[@class='nav navbar-nav']//li//a)[3]")).click();
		//6. Verify that cart page is displayed
		String result2=driver.getTitle();
		System.out.println(result2);
		if(result2.equals("Automation Exercise - Checkout"))
		{
			System.out.println("cartpage is visible sucessfully");
		}
		else
		{
			System.out.println("cartpage is not visible ");
		}
		//7. Click Proceed To Checkout
		driver.findElement(By.xpath("//a[@class='btn btn-default check_out']")).click();
		
		//8. Click 'Register / Login' button
		driver.findElement(By.xpath("//a//child::u")).click();
		
		//9. Fill all details in Signup and create account
		driver.findElement(By.xpath("//input[@data-qa='signup-name']")).sendKeys("omkara");
		driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("gawri123@gmail.com");
		driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();
		driver.findElement(By.id("id_gender2")).click();
		driver.findElement(By.id("password")).sendKeys("gawri123@gmail.com");
		WebElement dropdown1=driver.findElement(By.id("days"));
		WebElement dropdown2=driver.findElement(By.id("months"));
		WebElement dropdown3=driver.findElement(By.id("years"));
		WebElement dropdown4=driver.findElement(By.id("country"));
		Select selobj1=new Select(dropdown1);
		Select selobj2=new Select(dropdown2);
		Select selobj3=new Select(dropdown3);
		Select selobj4=new Select(dropdown4);

		selobj1.selectByIndex(4);
		selobj2.selectByIndex(4);
		selobj3.selectByVisibleText("2001");
		driver.findElement(By.id("first_name")).sendKeys("Vasavi");
		driver.findElement(By.id("last_name")).sendKeys("chavva");
		driver.findElement(By.id("address1")).sendKeys("hyderabad");
		selobj4.selectByIndex(2); 
		driver.findElement(By.id("state")).sendKeys("Andhra Pradesh");
		driver.findElement(By.id("city")).sendKeys("Thirupathi");
		driver.findElement(By.id("zipcode")).sendKeys("453123");
		driver.findElement(By.id("mobile_number")).sendKeys("897654329");
		driver.findElement(By.xpath("//button[@data-qa='create-account']")).click();
		
		//10. Verify 'ACCOUNT CREATED!' and click 'Continue' button
		WebElement element4=driver.findElement(By.xpath("//b[contains(text(),'Account Cre')]"));
	String result4=element4.getText();
	System.out.println(result4);
	if(result4.equals("ACCOUNT CREATED!"))
	{
		System.out.println("Account created sucessfully");
	}
	else
	{
		System.out.println("not created");
		
	}
	driver.findElement(By.xpath("//a[@data-qa='continue-button']")).click();
		//11. Verify ' Logged in as username' at top
	WebElement element5=driver.findElement(By.xpath("//div//div//div//div//div//ul//li[10]//a"));
	String result5=element5.getText();
	System.out.println(result5);
	if(result5.equals("Logged in as omkara"))
	{
		System.out.println("logged in as username is visible sucessfully");
	}
	else
	{
		System.out.println("not visible");
	}
		//12.Click 'Cart' button
	driver.findElement(By.xpath("(//ul[@class='nav navbar-nav']//li//a)[3]")).click();
		//13. Click 'Proceed To Checkout' button
	driver.findElement(By.xpath("//a[@class='btn btn-default check_out']")).click();

		//14. Verify Address Details and Review Your Order
	WebElement element6=driver.findElement(By.xpath("//div[@class='checkout-information']"));
	boolean result6=element6.isDisplayed();
	System.out.println(result6);
	if(result6==true)
	{
		System.out.println("verified details:pass");
	}
	else
	{
		System.out.println("verified details:fail");
	}
	WebElement element7=driver.findElement(By.id("cart_info"));
	boolean result7=element7.isDisplayed();
	System.out.println(result7);
	if(result7==true)
	{
		System.out.println("verified order:pass");
	}
	else
	{
		System.out.println("verified order:fail");
	}
		//15. Enter description in comment text area and click 'Place Order'
		driver.findElement(By.xpath("//textarea[@class='form-control']")).sendKeys("good products are available!!!");
		driver.findElement(By.xpath("//a[contains(text(),'Place')]")).click();
		//16. Enter payment details: Name on Card, Card Number, CVC, Expiration date
		driver.findElement(By.name("name_on_card")).sendKeys("Jyothi");
		driver.findElement(By.name("card_number")).sendKeys("7013536685");
		driver.findElement(By.name("cvc")).sendKeys("314");
		driver.findElement(By.name("expiry_month")).sendKeys("05");
		driver.findElement(By.name("expiry_year")).sendKeys("2025");
		//17. Click 'Pay and Confirm Order' button
		driver.findElement(By.xpath("//button[contains(text(),'Pay and')]")).click();
		//18. Verify success message 'Your order has been placed successfully!'
		WebElement element8=driver.findElement(By.xpath("//p[contains(text(),'Congratu')]"));
		boolean result8=element8.isDisplayed();
		System.out.println(result8);
		
		if(result8==true)
		{
			System.out.println("verified message:isDispalyed");
		}
		else
		{
			System.out.println("verified message:notDisplayed");
		}
		//19. Click 'Download Invoice' button and verify invoice is downloaded successfully.
		driver.findElement(By.xpath("//a[@class='btn btn-default check_out']")).click();
		//20. Click 'Continue' button
		driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
		//21. Click 'Delete Account' button
		driver.findElement(By.xpath("(//a[@style='color:brown;'])[2]")).click();
		//22. Verify 'ACCOUNT DELETED!' and click 'Continue' button
		WebElement element10=driver.findElement(By.xpath("//b[text()='Account Deleted!']"));
		boolean result10=element10.isDisplayed();
		System.out.println(result10);
		if(result10==true)
		{
			System.out.println("verified:account deteleted sucessfully");
		}
		else
		{
			System.out.println("verified:not deleted account");
		}
		driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
		driver.close();
		Reporter.log("Test Execution completed successfully",true);
		
	}

}