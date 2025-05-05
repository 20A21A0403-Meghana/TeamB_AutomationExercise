package validation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import PageRepsitory.PaymentPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollDown_validation {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.automationexercise.com/");
		
		PaymentPage obj=new PaymentPage(driver);
		obj.getsubscription().click();
		obj.getsubscriptionemail().sendKeys("ramya1@gmail.com");
		obj.getarrowbutton().click();
		System.out.println("Execution completed");
		driver.close();
	}

}
