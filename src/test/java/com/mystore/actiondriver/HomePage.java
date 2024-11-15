package com.mystore.actiondriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.MyStore_BaseClass;

public class HomePage extends MyStore_BaseClass {
	
	//1 creating test case for input
	
	@FindBy(linkText="Add my first address")
	WebElement ADD;
	
	@FindBy(linkText="Orders")
	WebElement Order;
	
	@FindBy(linkText="Credit slips")
	WebElement Credit;
	
	@FindBy(linkText="Addresses")
	WebElement MyAddress;
	
	@FindBy(linkText="Information")
	WebElement info;
	
	@FindBy(linkText="Home")
	WebElement BackHome;
	
	//2)
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//3)
	
	public void ADD() {
		System.out.println("ADD MY First ADDRESSES");
	}
	public void order() {
		System.out.println("ORDER HISTORY");
	}
	public void Credit() {
		System.out.println("Credit SLIP");
	}
	public void Address() {
		System.out.println("MY ADDRESSES");
	}
	public void info() {
		System.out.println("INFORMATION");
	}
	public void back() throws InterruptedException {
		BackHome.click();
	}
	

}
