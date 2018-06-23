package homework;



	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	//import org.openqa.selenium.support.ui.Select;

	public class Orbitz {
		
		
		
		
		public static void main(String[] args){
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\benmj\\Desktop\\NextBatch\\Selenium_automation\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.orbitz.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
			
			if (driver.getPageSource().contains("Orbitz")){
					
				
				System.out.println("Test passed");
			}
			else{
				System.out.println("test failed");
			}
			
			//Assert.assertEquals(driver.getTitle(),"https://www.orbitz.com/");
			
			
			WebElement logoOrbitz = driver.findElement(By.xpath("//*[contains(@alt,'www.orbitz.com')]"));
			logoOrbitz.click();
			WebElement account = driver.findElement(By.xpath("(//*[contains(@id,'header-account-menu' )])[1]"));
			account.click();
			
			WebElement signIn = driver.findElement(By.xpath("//*[contains(@id, 'header-account-signin-button')]"));
			signIn.click();
			WebElement email = driver.findElement(By.xpath("(//*[contains(@id, 'signin-loginid')])[1]"));
			email.sendKeys("applicationtesttt@gmail.com");
			WebElement password = driver.findElement(By.xpath("(//*[contains(@id, 'signin-password')])[1]"));
			password.sendKeys("application");
			WebElement submit = driver.findElement(By.xpath("(//*[contains(@id, 'submitButton')])[1]"));
			submit.click();
			
		
			
			
		}

	}



