 package com.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageFactory {
	
	
	@FindBy(how = How.XPATH, using = "(//*[contains(text(), 'Sign In')])[2]")
	private WebElement signInbtn;//
/*
	public WebElement getSignInbtn() {//metho is public its a java rule , getmethod encapsulation 
		return signInbtn;
	}

	public void setSignInbtn(WebElement signInbtn) {
		this.signInbtn = signInbtn;
	}*/

	public WebElement getSignInbtn() {
		return signInbtn;
	}

	public void setSignInbtn(WebElement signInbtn) {
		this.signInbtn = signInbtn;
	}
	

}
