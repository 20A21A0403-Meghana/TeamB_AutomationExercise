package validation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PageRepsitory.TestCasepage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_Validation {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.automationexercise.com/");

		TestCasepage obj=new TestCasepage(driver);
		
		obj.getTestCase().click();
		
		System.out.println("******Execution Completed*****");
		
		driver.close();
		
	}

}
