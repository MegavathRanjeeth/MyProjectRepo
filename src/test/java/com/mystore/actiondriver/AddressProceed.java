package com.mystore.actiondriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.MyStore_BaseClass;

public class AddressProceed extends MyStore_BaseClass{
	//1)
	@FindBy(xpath="//*[@id=\"center_column\"]/form/p/button/span")
	WebElement proceedToChec;
	
	//2)
		public AddressProceed(WebDriver driver) {
			PageFactory.initElements(driver,this);
			
		}
	//3)	
       public void proceedtocheck() {
	   proceedToChec.click();

}
}
