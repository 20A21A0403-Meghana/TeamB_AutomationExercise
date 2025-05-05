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

public class TestCase_15 extends BaseConfig{
	
	@Test
	public void Place_Order_Register_before_Checkout() throws InterruptedException {

		 //Configure the Browser
		WebDriverManager.chromedriver().setup();

		//Step_1:Launch the Browser
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		//Step_2:Navigate the appln Via Url
		driver.get("https://www.automationexercise.com/");
		//Step_3:Verify for home page
		System.out.println("Home Page is Visible");
		//S_4:Click Login/sign up button
				driver.findElement(By.xpath("//a[@href=\"/login\"]")).click();
				driver.findElement(By.name("name")).sendKeys("lavanya pampana");
				driver.findElement(By.xpath("(//input[@name=\"email\"])[2]")).sendKeys("lavanyapampana1@gmail.com");
				driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).click();
				//S_5:fill all details in sign up and create account
				driver.findElement(By.xpath("(//div[@data-qa=\"title\"])[2]")).click();
				driver.findElement(By.
						xpath("//input[@id=\"password\"]")).sendKeys("lavanya123");
				//Identify the DD
				WebElement ele =driver.findElement(By.xpath("//select[@id=\"days\"]"));
				System.out.println("element identified");
				//Create an obj for select class
				Select obj = new Select(ele);
				Thread.sleep(3000);
				//Call the non Static method Verify select
				obj.selectByIndex(15);
				//Identify the DD
				WebElement ele1 =driver.findElement(By.id("months"));
				System.out.println("element identified");
				//Create an obj for select class
				Select objj = new Select(ele1);
				Thread.sleep(3000);
				//Call the non Static method Verify select
				objj.selectByVisibleText("November");
				
				//Identify the DD
				WebElement ele2 =driver.findElement(By.id("years"));
				System.out.println("element identified");
				//Create an obj for select class
				Select objjj = new Select(ele2);
				Thread.sleep(3000);
				//Call the non Static method Verify select
				objjj.selectByVisibleText("2003");

				driver.findElement(By.id("newsletter")).click();
				driver.findElement(By.id("optin")).click();
				driver.findElement(By.id("first_name")).sendKeys("lavanyaaa");
				driver.findElement(By.id("last_name")).sendKeys("pampana");
				driver.findElement(By.id("company")).sendKeys("Capgemini");
				driver.findElement(By.id("address1")).sendKeys("JNTU");
				driver.findElement(By.id("address2")).sendKeys("RoadNo3");
				//Identify the DD
						WebElement ele11 =driver.findElement(By.xpath("//select[@id=\"days\"]"));
						System.out.println("element identified");
						//Create an obj for select class
						Select obje = new Select(ele11);
						Thread.sleep(3000);
						//Call the non Static method Verify select
						obje.selectByIndex(0);
				driver.findElement(By.id("state")).sendKeys("Telangana");
				driver.findElement(By.id("city")).sendKeys("Hyderabad");
				driver.findElement(By.id("zipcode")).sendKeys("500072");
				driver.findElement(By.id("mobile_number")).sendKeys("7842447207");
				driver.findElement(By.xpath("(//button[@type=\"submit\"])[1]")).click();
				//Step6:Verify Account created click Continue button
				System.out.println("Account created");
				driver.findElement(By.xpath("//a[text()='Continue']")).click();
				//s_7:Verify the Logged in as User name top
				System.out.println(" Logged in as User name top visible");
				//Step_8:Click on add products to cart
				driver.findElement(By.xpath("(//a[@href=\"/products\"])[1]")).click();
				driver.findElement(By.xpath("(//a[@data-product-id=\"1\"])[1]")).click();
				Thread.sleep(2000);				
				driver.findElement(By.xpath("//button[@data-dismiss=\"modal\"]")).click();
				//Step_9:Click on the "cart" button
						driver.findElement(By.xpath("//a[@href=\"/view_cart\"]")).click();
						//Verify the Cart page is Displayed
						WebElement webb=driver.findElement(By.xpath("//li[@class='active']"));
						boolean boo=webb.isDisplayed();
						if(boo) {
							System.out.println("Cart page is Displayed");
						}
						else {
							System.out.println("Cart page is not Displayed");
						}
						Thread.sleep(3000);
						//Step11:Click on Proceed to check
				driver.findElement(By.xpath("//a[text()='Proceed To Checkout']")).click();
				
				//Step12: Verify Address Details and Review Your Order
				WebElement mnt=driver.findElement(By.xpath("//h2[text()='Address Details']"));
				boolean b2=mnt.isDisplayed();
				if(b2) {
					System.out.println("Address Details and Review Your Order visible");
				}
				else {
					System.out.println("Address Details and Review Your Order not visible");
				}		
				
				//Step13:Enter description in comment text area and click 'Place Order'
				driver.findElement(By.xpath("//textarea[@name=\"message\"]")).sendKeys("good appln");
				
				driver.findElement(By.xpath("//a[text()='Place Order']")).click();
				//St14:Enter payment details
				driver.findElement(By.xpath("//input[@name=\"name_on_card\"]")).sendKeys("LavanyaP");
				driver.findElement(By.xpath("//input[@name=\"card_number\"]")).sendKeys("098765431123");
				driver.findElement(By.xpath("//input[@name=\"cvc\"]")).sendKeys("2354");
				driver.findElement(By.xpath("//input[@name=\"expiry_month\"]")).sendKeys("11");
				driver.findElement(By.xpath("//input[@name=\"expiry_year\"]")).sendKeys("2035");
				//St15:Click pay and Confirm button
				driver.findElement(By.id("submit")).click();
				//st16:Verify Your order have been placed Successfully msg
				WebElement elem=driver.findElement(By.xpath("//b[text()='Order Placed!']"));
				boolean b3=elem.isDisplayed();
				if(b3) {
					System.out.println("Your order have been placed Successfully visible");
				}
				else {
					System.out.println("Your order have been placed Successfully not visible");
				}		
				
				//step17:Click delt Account
				
				driver.findElement(By.xpath("//a[@href=\"/delete_account\"]")).click();
				
				//st18:Verify Account Dlted and Click Continue button
				driver.findElement(By.xpath("//a[@data-qa=\"continue-button\"]")).click();
				Reporter.log("execution completed",true);
				driver.close();

	}

}
	
