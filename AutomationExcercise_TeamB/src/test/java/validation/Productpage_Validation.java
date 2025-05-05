package validation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PageRepsitory.Productpage;
import PageRepsitory.TestCasepage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Productpage_Validation {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.automationexercise.com/");
		
		Productpage obj=new Productpage(driver);
		
		obj.getProduct().click();
		
		obj.getProductdetails().click();
		
		System.out.println("Execution completed");
		
		driver.close();
		
	}

}
