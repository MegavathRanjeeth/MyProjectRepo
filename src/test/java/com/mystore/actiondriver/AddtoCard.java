package com.mystore.actiondriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.MyStore_BaseClass;

public class AddtoCard extends MyStore_BaseClass {
	//1)
	@FindBy(xpath="//*[@id=\"quantity_wanted_p\"]/a[2]")
	WebElement Quantity;
	
	@FindBy(id="add_to_cart")
	WebElement AddtoCard;
	
	//2)
	public AddtoCard(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	//3)
	public void Quantity() {
		Quantity.click();
	}
	public void Add() {
		AddtoCard.click();
	}

}
