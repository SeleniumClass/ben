/*package com.pagefactor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pagefactory.PageFactory;

public class LoginFunctionWithFactory {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\benmj\\Desktop\\NextBatch\\Selenium_auto\\chromedriver.exe" );

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\benmj\\Desktop\\NextBatch\\Selenium_auto\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://www.gcrit.com/build3/");
		
		LoginPageFactory pf = PageFactory.initElements(driver, LoginPageFactory.class);
		
		pf.getMyAccount().click();
	}

}
*/