package homework;


	
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.How;

	/**
	 * @author benmj
	 *
	 */
	public class PageFactoryGcrLogin {
		
		WebDriver driver; 
		public PageFactoryGcrLogin(WebDriver driver) {
			
		this.driver = driver;	
	
		
		PageFactoryGcrLogin.initElements(driver, this);
		
		}
		
		
		
		private static void initElements(WebDriver driver2, PageFactoryGcrLogin pageFactoryGcrLogin) {
			// TODO Auto-generated method stub
			
		}



		//Login function xpath
		
		@FindBy(how = How.XPATH, using = "//*[contains(text(),'My Account')]")
		private WebElement myAccount;
		
		@FindBy(how = How.XPATH, using = "//*[contains(@name,'email_address')]")
		private WebElement emailId;
		
		@FindBy(how = How.XPATH, using = "//*[contains(@name,'password')]")
		private WebElement password;

		@FindBy(how = How.XPATH, using = "(//*[contains(@class , 'ui-button-text')])[9]")
		private WebElement submit;
		
		@FindBy(how = How.XPATH, using = "//*[contains(text(),'Catalog')]")
		private WebElement catalog;
		
		@FindBy(how = How.XPATH, using = "//*[@id='bodyContent']/div/div[1]/a/u")
		private WebElement newProduct;
		
		@FindBy(how = How.XPATH, using = "")
		private WebElement pageNumber;
		
		//product list xpath

		public WebElement getMyAccount() {
			return myAccount;
		}

		public WebElement getEmailId() {
			return emailId;
		}

		public WebElement getPassword() {
			return password;
		}

		public WebElement getSubmit() {
			return submit;
		}

		public WebElement getCatalog() {
			return catalog;
		}

		public WebElement getNewProduct() {
			return newProduct;
		}

		public WebElement getPageNumber() {
			return pageNumber;
		}
		
		
		
		
		


}
