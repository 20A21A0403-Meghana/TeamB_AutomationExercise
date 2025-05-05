package PageRepsitory;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class CartPage {

		//Declaration
		@FindBy (xpath="//a[text()='Proceed To Checkout']")
		private WebElement checkOut;
		
		@FindBy (xpath="//a[text()='Place Order']")
		private WebElement placeOrder;
		
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
		
		@FindBy(xpath = "//a[text()='Men Tshirt'")
		private WebElement product1;
		
		@FindBy(xpath = "//a[text()='GRAPHIC DESIGN MEN T SHIRT - BLUE']")
		private WebElement product2;
		
		@FindBy(xpath = "//a[text()='Pure Cotton V-Neck T-Shirt']")
		private WebElement product3;
		
		@FindBy(xpath = "//a[text()='Green Side Placket Detail T-Shirt']")
		private WebElement product4;
		
		@FindBy(xpath = "//a[text()='Premium Polo T-Shirts']")
		private WebElement product5;
		
		@FindBy(xpath = "//a[text()='Pure Cotton Neon Green Tshirt']")
		private WebElement product6;
		
		//Initialization
		public CartPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		//Utilization
		public WebElement getCheckOut() {
			return checkOut;
		}

		public WebElement getPlaceOrder() {
			return placeOrder;
		}

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

		public WebElement getProduct1() {
			return product1;
		}

		public WebElement getProduct2() {
			return product2;
		}

		public WebElement getProduct3() {
			return product3;
		}

		public WebElement getProduct4() {
			return product4;
		}

		public WebElement getProduct5() {
			return product5;
		}

		public WebElement getProduct6() {
			return product6;
		}
		
	

}
