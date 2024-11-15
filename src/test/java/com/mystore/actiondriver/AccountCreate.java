package com.mystore.actiondriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.MyStore_BaseClass;

public class AccountCreate extends MyStore_BaseClass {
	//1)
	@FindBy(linkText="Sign in")
	WebElement SighinBtn;
	
	@FindBy(name="email")
	WebElement UserEmail;
	
	@FindBy(name="passwd")
	WebElement Password;
	
	@FindBy(name="SubmitLogin")
	WebElement ClickSignin;
	
	//2
	public AccountCreate(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	//3)
	public void Signin()
	{
		SighinBtn.click();
	}
		
	public void Email() throws InterruptedException {
		UserEmail.sendKeys("ranjeethsingh0@xyz.com");
		Thread.sleep(2000);
	}
	public void Pass() {
		Password.sendKeys("Rathod@123");
	}
	public void submit() {
		ClickSignin.click();
	}
	

}
