package com.tesing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class forlooptesting {

	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 60); // to use explicit wait
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(""))));
		
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = 20;
		System.out.println(a);
		System.out.println(b);
		
		/*for (int i=0; i<100; i++){
			System.out.println(i);
			
			if(i==10 || i==20  || i==50 || i==65 ){
				System.out.println("you are too young");
			}
			else if(i==25){
				System.out.println("You need job");
				
			}
			else if(i==40){
				
				System.out.println("You need a house");
			}
				
				else if(i==65){
					
					System.out.println("senior csitizen");
					
					
				}*/
			
			for (int i=0; i<10001; i++){
				//System.out.println(i);
				
				 if(i==2000){
					System.out.println(2000 + "poor salary");
					
				}
				else if(i==5000){
					
					System.out.println("Good salary");
				}
					
					else if(i==10000){
						
						System.out.println("Great salary");
						
			
				
				
			}
			
			
			
		}

	}

}
