package PageRepsitory;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class PaymentPage {
		//Declaration
			@FindBy (name="name_on_card")
			private WebElement cardName;
			
			@FindBy (name="card_number")
			private WebElement cardNumber;
			
			@FindBy (xpath="//input[@name='cvc']")
			private WebElement cvc;
			
			@FindBy (name="expiry_month")
			private WebElement month;
			
			@FindBy (name="expiry_month")
			private WebElement year;
			
			@FindBy (xpath="//button[text()='Pay and Confirm Order']")
			private WebElement conformOrder;
			
			@FindBy(xpath="//h2[text()='Subscription']")
			private WebElement subscription;
			
			@FindBy(xpath="//input[@id=\"susbscribe_email\"]")
			private WebElement subscriptionemail;
			
			@FindBy(xpath="//i[@class=\"fa fa-arrow-circle-o-right\"]")
			private WebElement arrowbutton;
			
			//Initialization
			public PaymentPage(WebDriver driver) {
				PageFactory.initElements(driver, this);
			}

			//Utilization

			public WebElement getCardName() {
				return cardName;
			}

			public WebElement getCardNumber() {
				return cardNumber;
			}

			public WebElement getCvc() {
				return cvc;
			}

			public WebElement getMonth() {
				return month;
			}

			public WebElement getYear() {
				return year;
			}

			public WebElement getConformOrder() {
				return conformOrder;
			}
			
			public WebElement getsubscription() {
				return subscription;
			}
			public WebElement getsubscriptionemail() {
				return subscriptionemail;
			}
			public WebElement getarrowbutton() {
				return arrowbutton;
			}
	}
