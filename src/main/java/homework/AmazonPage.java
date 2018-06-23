package homework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPage {
	
	public static void main(String[] args)throws Exception {
		
		WebDriver driver;
		driver= new ChromeDriver();
	//	String baseUrl;
		driver= new ChromeDriver();
		//baseUrl = "https://www.amazon.com/";
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\benmj\\Desktop\\NextBatch\\Selenium_automation\\Driver\\chromedriver.exe");	
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//baseUrl = "https://www.amazon.com/";
		
		//WebElement yourRecomentation = driver.findElement(By.xpath(" //*[@id='nav-xshop']/a[1]"));
		//yourRecomentation.click();
		
		WebElement yourRecomentation = driver.findElement(By.xpath(" //*[@id='nav-xshop']/a[1]"));
		yourRecomentation.click();
		
		WebElement emailId = driver.findElement(By.xpath("//*[@type='email']"));
		emailId.click();
		
	/*	WebElement yourRecomentation = driver.findElement(By.xpath(" //*[@id='nav-xshop']/a[1]"));
		yourRecomentation.click();
		
		WebElement yourRecomentation = driver.findElement(By.xpath(" //*[@id='nav-xshop']/a[1]"));
		yourRecomentation.click();
		
		WebElement yourRecomentation = driver.findElement(By.xpath(" //*[@id='nav-xshop']/a[1]"));
		yourRecomentation.click();
		
		WebElement yourRecomentation = driver.findElement(By.xpath(" //*[@id='nav-xshop']/a[1]"));
		yourRecomentation.click();
		
		WebElement yourRecomentation = driver.findElement(By.xpath(" //*[@id='nav-xshop']/a[1]"));
		yourRecomentation.click();
		
		WebElement yourRecomentation = driver.findElement(By.xpath(" //*[@id='nav-xshop']/a[1]"));
		yourRecomentation.click();*/
		
	}


}
