package homework;


	
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;


	public class PageFactoryGcrTest {
		
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\benmj\\Desktop\\NextBatch\\Selenium_auto\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.get("http://www.gcrit.com/build3");
			
						
		//	PageFactoryGcrLogin obj = PageFactoryGcrLogin.in
			
		
			
		/*	btn.getMyAccount().click();
			btn.getEmailId().sendKeys("miqbalkhan41@yahoo.com");
			Thread.sleep(3000);
			btn.getPassword().sendKeys("12345");
			Thread.sleep(3000);
			btn.getSubmit().click();
			Thread.sleep(3000);
			btn.getCatalog().click();
			Thread.sleep(3000);
			btn.getNewProduct().click();
			Thread.sleep(3000);
			
			System.out.println("page number is:" + btn.getSubmit().getText());
			
					
					
			
			
		}
		
		
		*/

	}
	}


