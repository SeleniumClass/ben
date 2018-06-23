import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginfunctionTest {

	public static void main(String[] args) {//void main method never return value//
		//if void void method
		// no void non void, then you hhave to put return at the end
		//static jvm don't need object/static class level method
		//static then static method
		// no static then non static//
		//obj-beha-method
		//public can access the main method  from any package/class
		//main- name jvm only understand main method
		//()parenthesis 
		//
		//[]array method
		//(args) argument
		//browseer and frontnd html css, javascript has no locator but using by javascript executor
		//xpath can use htm xml json
		//html use locators
		//to handle dynamic object use XPATH IN HTML
		//DYNAMIC OBJECT WHEN VALUE FREQUENTLY BUT PARTIALY PROPERTY CHANGES. BUT TOTALLY OBJECT CHANGE IS NOT DYNAMIC OBJECT
		// //tagname[@AttributeName = 'value' this is called XPAATH FORMULA
		// //*[@Attribute ='value']
		
		 //*[@id = 'email']
		
		//public WebDriver login(WebDriver driver) throws Throwable{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\benmj\\Desktop\\NextBatch\\Selenium_automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//String baseUrl; 
		//driver.get("https://www.google.com/");
		driver.get("http://www.gcrit.com/build3/");
		
		
		
		
		
		
		
		
		
		WebElement myaccount = driver.findElement(By.xpath("//*[@id='tdb3']"));////*[@id="tdb3"]/span[2]
		myaccount.click();
		WebElement email   = driver.findElement(By.xpath("(//*[@name='email_address'])"));
		email.sendKeys("sarowerny@gmail.com");
		
		WebElement password   = driver.findElement(By.xpath(" (//*[@name='password'])"));
		 password.sendKeys("student");
		WebElement signin  = driver.findElement(By.xpath("(//*[@class='ui-button-text'])[5]"));
		signin.click();
		
		WebElement catlog = driver.findElement(By.xpath("(//*[contains(@id, 'headerNavigation')])[2]"));
		catlog.click();
		
		
		//orbitz.com//
		//validation
		/*Assert.assertEquals("GCR shop",driver.getTitle(), "test Passed";
		
		if(driver.getTitle().equalsIgnoreCase("GCR Shop")){
			System.out.println("Test passed>>>>> Page Title" + driver.getTitle());
			
		}
		else{
			System.out.println("Test Failed >>>>>" ); 
			
		}
		
*/
		
		
		/*JavascriptExecutor object = (JavascriptExecutor)driver;//handle by java script-java script executor
	//	object.executeScript("argument[0].style.border=", );
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		*/
		driver.manage().window().maximize();
		
		//xpath handle by html and css is handle by css selector -
		

	}
	


}
