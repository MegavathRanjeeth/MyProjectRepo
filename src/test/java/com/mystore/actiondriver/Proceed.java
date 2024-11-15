package com.mystore.actiondriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.MyStore_BaseClass;

public class Proceed extends MyStore_BaseClass {
	@FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
	WebElement proceed;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/p[2]/a[1]")
	WebElement proceedToCheck;
	
	//2)
	public Proceed(WebDriver driver) {
	PageFactory.initElements(driver,this);
	}
	
	//3)
	public void proceed() throws InterruptedException {
		proceed.click();
		Thread.sleep(2000);
		
	}
	public void proceedtocheck() throws InterruptedException {
		proceedToCheck.click();
		Thread.sleep(2000);
	}
			
			
	
	

}
