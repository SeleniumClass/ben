package homework;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.ForkJoinPool.ManagedBlocker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\benmj\\Desktop\\NextBatch\\Selenium_automation\\Driver\\chromedriver.exe");
		WebDriver driver;
		// String baseUrl;
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		// baseUrl ="https://www.amazon.com/";

		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// driver.get(baseUrl);

		WebElement department = driver.findElement(By.xpath("//*[@id='nav-link-shopall']/span[2]"));
		department.click();

		WebElement todaysDeal = driver.findElement(By.xpath("//*[@id='nav-xshop']/a[2]"));
		todaysDeal.click();

		WebElement giftCards = driver.findElement(By.xpath("//*[@id='nav-xshop']/a[3]"));
		giftCards.click();

		WebElement registry = driver.findElement(By.xpath("//*[@id='nav-xshop']/a[4]"));
		registry.click();

		WebElement sell = driver.findElement(By.xpath("//*[@id='nav-xshop']/a[5]"));
		sell.click();

		WebElement yourRecomentation = driver.findElement(By.xpath(" //*[@id='nav-xshop']/a[1]")); //// *[@id="nav-xshop"]/a[1]
		yourRecomentation.click();

		WebElement emailid = driver.findElement(By.xpath("//*[@type='email']"));
		emailid.sendKeys("applicationtesttt@gmail.com");

		WebElement continues = driver.findElement(By.xpath("//*[@id='continue']"));
		continues.click();

		WebElement password = driver.findElement(By.xpath("//*[@type='password']"));
		password.sendKeys("application");

		WebElement signIn = driver.findElement(By.xpath("//*[@id='signInSubmit']"));
		signIn.click();

		WebElement tryPrime = driver.findElement(By.xpath("//*[@id='nav-link-prime']/span[2]"));
		tryPrime.click();

		WebElement order = driver.findElement(By.xpath("//*[@id='nav-orders']"));
		order.click();

		WebElement accountList = driver.findElement(By.xpath(" //*[@id='nav-link-accountList']/span[1]")); //// *[@id="nav-xshop"]/a[1]
		accountList.click();

	}

}
