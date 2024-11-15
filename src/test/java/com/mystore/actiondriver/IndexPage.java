package com.mystore.actiondriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.MyStore_BaseClass;

public class IndexPage extends MyStore_BaseClass{
	//1 creating test case for input
	@FindBy(linkText="Sign in")
	WebElement SighinBtn;
	
	@FindBy(xpath="//*[@id=\"header_logo\"]/a/img")
	WebElement Logo;
	
	@FindBy(linkText="Contact us")
	WebElement Contact;
	
	@FindBy(name="search_query")
	WebElement Search;
	
	@FindBy(name="submit_search")
	WebElement SearchBtn;
	
	@FindBy(xpath="//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")
	WebElement Card;
			
			
			//2 creating constructor
			public IndexPage(WebDriver driver){
				PageFactory.initElements(driver,this);
				
			}
			
			// 3) Giving values
			public void Signin() throws InterruptedException
			{
				SighinBtn.click();
				Thread.sleep(3000);
				driver.navigate().back();

			}
			public void logo()
			{
				Logo.isDisplayed();
				System.out.println("The Logo is :My Store Logo");
			}
			public void contact() throws InterruptedException
			{
				Contact.click();
				Thread.sleep(3000);
				driver.navigate().back();


			}
			public void search() throws InterruptedException {
				Search.sendKeys("Blouse");
				Thread.sleep(2000);
			}
			public void searchBtn() {
				SearchBtn.click();
				driver.navigate().back();
			}
			public void card() throws InterruptedException {
				Card.click();
				driver.navigate().back();
				Thread.sleep(2000);
			}


}
