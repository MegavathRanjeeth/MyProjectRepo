package com.mystore.actiondriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.MyStore_BaseClass;

public class Shipping extends MyStore_BaseClass{
	@FindBy(name="cgv")
	WebElement checkbox;
	
	@FindBy(xpath="//*[@id=\"form\"]/p/button/span")
	WebElement ToCheck;
	
	//2)
	public Shipping(WebDriver driver) {
	PageFactory.initElements(driver,this);
	}
	
	//3)
	public void checkbox() throws InterruptedException {
		checkbox.click();
		Thread.sleep(2000);
		
	}
	public void tocheck() throws InterruptedException {
		ToCheck.click();
		Thread.sleep(2000);
	}

}
