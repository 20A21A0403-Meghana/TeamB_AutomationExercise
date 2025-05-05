package PageRepsitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	//Declaration
	@FindBy(name="name")
	private WebElement usertextfield;
	
	@FindBy(xpath="//input[@data-qa='signup-email']")
	private WebElement Emailtextfield;
	
	@FindBy(xpath="//button[@data-qa=\"signup-button\"]")
	private WebElement SignUpbutton;
	
	//Initialization
	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//Utilization
	public WebElement getusertextfield() {
		return usertextfield;
	}
		public WebElement getEmailtextfield() {
			return Emailtextfield;
	}
		public WebElement getSignUpbutton() {
			return SignUpbutton;
		}
}
