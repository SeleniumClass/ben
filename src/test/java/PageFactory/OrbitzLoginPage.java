/*package PageFactory;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrbitzLoginPage {

	WebDriver driver;
	
	public UpsFirstPage(WebDriver d){
		this.driver=d;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="(//*[contains(@id,'header-account-menu' )])[1]")
	WebElement account;
	 
	@FindBy(xpath="(//*[@name='email_address'])")
	WebElement 
	
	@FinBy(xpath="(//*[@name='password'])")
	WebElement password
	
	
	
	@FindBy(xpath="//*[@id='ups-menuLinks2']")
	WebElement services;
	
	@FindBy(xpath="//*[@id='ups-menuLinks12']/div[1]/div[3]/ul/li[1]/a")
	WebElement healthcare;
	//"//*[@id='ups-menuPanel2']"
	
	
	public WebElement account(){
		return account;
	}
	public WebElement emailId(){
		return emailId;
	}
	public WebElement services(){
		return services;
	}
	public WebElement healthcare(){
		return healthcare;
		
	}
	
	
	
}
*/