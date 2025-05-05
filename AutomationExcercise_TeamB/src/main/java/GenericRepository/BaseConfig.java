package GenericRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import ExelFileUtility.ReadExcelFile;
import PropertiesfileUtility.ReadPropertyFile;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseConfig {

	public WebDriver driver;
	public ReadPropertyFile propertylibrary;
	public ReadExcelFile excelLibrary;

	@Parameters()
	@BeforeClass

	public void browserSetup() {

		String bname = "chrome";
		// System.out.println("Username:" + username);

		// Create object for all library
		createobject();

		// Configure the browser
		WebDriverManager.chromedriver().setup();

		// step1: Launch the browser
		if (bname.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (bname.equals("edeg")) {
			driver = new EdgeDriver();
		}

		else if (bname.equals("firefox")) {
			driver = new EdgeDriver();
		}

		// Fetch the URL Data from property-File
		String URL = propertylibrary.readData("url");
		String USERNAME = propertylibrary.readData("username");
		String PSWD = propertylibrary.readData("password");
		String EMAIL = propertylibrary.readData("email");
		System.out.println(USERNAME);
		System.out.println(PSWD);
		System.out.println(EMAIL);
		
		

		// Step2: Maximize the browser
		driver.manage().window().maximize();

		// Step3:Navigate to the Application via URL
		driver.get(URL);

		String expectedurl = driver.getCurrentUrl();
		String actualurl = "https://automationexercise.com/";

		if (actualurl.equals(expectedurl)) {
			System.out.println("verify that the url is Displayed");
		} else {
			System.out.println("Verify that the url is not Displayed");
		}

	}

	public void createobject() {

		propertylibrary = new ReadPropertyFile();
		excelLibrary = new ReadExcelFile();

	}

	@AfterClass
	public void closeBrowser() {
		// Close the Browser
		driver.quit();

	}

}