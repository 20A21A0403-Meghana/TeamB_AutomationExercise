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

public class TestCase_26  extends BaseConfig{
	

	@Test
	
	public void Verify_Scroll_Up_without_Arrow_button_and_Scroll_Down_functionality() {
		
		WebDriverManager.chromedriver().setup();
		//Lanch the Browser
		WebDriver driver=new ChromeDriver();
		//2.Navigate
		driver.get("https://automationexercise.com/");
		//3.Verify homepage is vissible
	String title=driver.getTitle();
	System.out.println(title);
	if(title.equals("Automation Exercise - Signup / Login"))
	{
		System.out.println("Homepage is Visible suceesfully");
	}
	else
	{
		System.out.println("Homepage is Visible suceesfully");

	}
	//4.ScrollDown
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,500)");
	//5. Verify 'SUBSCRIPTION' is visible
	WebElement element=driver.findElement(By.xpath("//h2[text()='Subscription']"));
	boolean result=element.isDisplayed();
	if(result==true)
	{
		System.out.println("Subcription elment is Displayed");
	}
	else
	{
		System.out.println("Subcription is not Displayed");
	}
	
	//6. Scroll up page to top
	js.executeScript("window.scrollBy(0,-500)");
	// Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen
	WebElement	element1=driver.findElement(By.xpath("//h2[contains(text(),'Full-Fledged')]"));
	boolean result2=element1.isDisplayed();
	if(result2==true)
	{
		System.out.println("Fully-Fledged text is visible");
	}
	else
	{
		System.out.println("Not Fully-Fledged text is visible");

	}
	Reporter.log("Test Execution completed successfully",true);

	driver.close();
		
	}

}
