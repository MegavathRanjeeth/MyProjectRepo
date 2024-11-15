package com.mystore.actiondriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.MyStore_BaseClass;

public class Payment extends MyStore_BaseClass {
	@FindBy(xpath="//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")
	WebElement BankPay;
	
	@FindBy(xpath="//*[@id=\"cart_navigation\"]/button/span")
	WebElement Conform;
	
	//2)
	public Payment(WebDriver driver) {
	PageFactory.initElements(driver,this);
	}
	
	//3)
	public void BankPay() throws InterruptedException {
		BankPay.click();
		Thread.sleep(2000);
		
	}
	public void Conform() throws InterruptedException {
		Conform.click();
		Thread.sleep(2000);
	}

}
