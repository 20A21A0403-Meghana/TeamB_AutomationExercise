package PageRepsitory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	// Declaration
	@FindBy(xpath = "//i[@class='material-icons card_travel']")
	private WebElement productsPage;

	@FindBy(xpath = "(//i[@class='fa fa-shopping-cart'])[1]")
	private WebElement cartPage;

	@FindBy(xpath = "//i[@class='fa fa-lock']")
	private WebElement signinOrLogin;

	@FindBy(xpath = "//i[@class='fa fa-lock']")
	private WebElement logoutPage;

	@FindBy(xpath = "//i[@class='fa fa-trash-o']")
	private WebElement deletePage;

	@FindBy(xpath = "(//i[@class='fa fa-list'])[1]")
	private WebElement testcasePage;

	@FindBy(xpath = "//i[@class='fa fa-user']")
	private WebElement loggedUser;

	@FindBy(xpath="//i[@class='fa fa-envelope']")
	private WebElement contactUs;
	
	// Initialization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Utilization
	public WebElement getProductsPage() {
		return productsPage;
	}

	public WebElement getCartPage() {
		return cartPage;
	}

	public WebElement getsigninOrLogin() {
		return signinOrLogin;
	}

	public WebElement getLogoutPage() {
		return logoutPage;
	}

	public WebElement getDeletePage() {
		return deletePage;
	}

	public WebElement getTestcasePage() {
		return testcasePage;
	}

	public WebElement getLoggedUser() {
		return loggedUser;
	}
	
	public WebElement getContactUs() {
		return contactUs;
	}

}