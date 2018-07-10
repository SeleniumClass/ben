package com.stepdef;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {

	WebDriver driver;

	@Given("^User able to open Disney world browser//Given pre action setup browsse url$")
	public void user_able_to_open_Disney_world_browser_Given_pre_action_setup_browsse_url() throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\benmj\\Desktop\\NextBatch\\Selenium_auto\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://disneyworld.disney.go.com/");

	}

	@Given("^Put URL and got to SignIn page$")
	public void put_URL_and_got_to_SignIn_page() throws Throwable {
		
		driver.get("https://disneyworld.disney.go.com/");
	    
	    String pagetitle= driver.getTitle();
	    
	    System.out.println(pagetitle);
	    
	    if (pagetitle.contains("Walt Disney World")) {
	    	
	    	System.out.println("Got Disney home page");
	    	TakeScreenShot.captureScreenShot(driver, "Disney home page");
	    	
	    }
	    else {
	    	System.out.println("Something went wrong and check screen shot");
	    	
	    	TakeScreenShot.captureScreenShot(driver, "Disney home page");
	  
	    
	}

	@When("^User able to click SignIn Button//When  action \\(testing \\)$")
	public void user_able_to_click_SignIn_Button_When_action_testing() throws Throwable {
		
		 driver.findElement(By.xpath("//*[contains(text(),'Sign In or Create Account')]")).click();
	}
	  
	

	@When("^User able to take screen shot of SignIn page//And and or multiple times$")
	public void user_able_to_take_screen_shot_of_SignIn_page_And_and_or_multiple_times() throws Throwable {
		
		TakeScreenShot.captureScreenShot(driver, "Login page2");
		
	}
	  
	

	@When("^User able to use Valid <email_id>$")
	public void user_able_to_use_Valid_email_id(DataTable arg1) throws Throwable {
	  
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		
		List<List<String>> obj =userName.raw();
		
		driver.findElement(By.xpath("//*[@id='loginPageUsername']")).sendKeys(obj.get(1).get(0));
		
		
	}

	@When("^User able to put valid<password>$")
	public void user_able_to_put_valid_password(DataTable arg1) throws Throwable {
	  
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		
		driver.findElement(By.xpath("//*[@id='loginPagePassword']")).sendKeys(mypassword.get(1).get(0));
	}

	@When("^User able to clik submit button$")
	public void user_able_to_clik_submit_button() throws Throwable {
		
		 driver.findElement(By.xpath("//*[@class='buttonText']")).click();
	}
	  
	

	@Then("^User able to Validate SignIn status//then validation$")
	public void user_able_to_Validate_SignIn_status_then_validation() throws Throwable {
		
		 String homepageTitle=driver.getTitle();
		   System.out.println(homepageTitle);
		    if (homepageTitle.contains("ddddddd")) {
		    	
		    	System.out.println("login page");
		    	TakeScreenShot.captureScreenShot(driver, "Login Page");
		    	
	}
	 
    else {
    	System.out.println("Something went wrong and check screen shot");
    	
    	TakeScreenShot.captureScreenShot(driver, "Login page");
    }
}

	  

	@Then("^User able to take screen Shot of home page$")
	public void user_able_to_take_screen_Shot_of_home_page() throws Throwable {
		
		
		TakeScreenShot.captureScreenShot(driver, "HomePage");
		
	}
	  
	@Then("^Close the browser$")
	public void close_the_browser() throws Throwable {
		
		driver.quit();//=== browser + driver
		
		
	}
	  
	}


