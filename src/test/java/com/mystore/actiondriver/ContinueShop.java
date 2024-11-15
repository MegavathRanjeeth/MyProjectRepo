package com.mystore.actiondriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.MyStore_BaseClass;

public class ContinueShop extends MyStore_BaseClass {
	//1)
	    @FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span")
	    WebElement Continue;
	    
	    @FindBy(name="search_query")
	    WebElement Search;
	
	    @FindBy(name="submit_search")
	    WebElement SearchBtn;
	    
	    @FindBy(xpath="//*[@id=\"center_column\"]/ul/li[2]/div/div[1]/div/a[1]/img")
		WebElement SelectIte;
		
		@FindBy(id="color_11")
		WebElement SelectClou;
	    
		@FindBy(xpath="//*[@id=\"quantity_wanted_p\"]/a[2]")
		WebElement Quantit;
		
		@FindBy(id="add_to_cart")
		WebElement AddtoCar;
		
		//2)
		public ContinueShop(WebDriver driver) {
			PageFactory.initElements(driver,this);
			
		}
		//3)
		public void conti() {
			
			Continue.click();
		}
		public void search() throws InterruptedException {
			Search.clear();
			Search.sendKeys("Dress");
			Thread.sleep(2000);
		}
		public void searchBtn() {
			SearchBtn.click();
		}
		public void Select() throws InterruptedException {
			SelectIte.click();
			Thread.sleep(2000);
		}
		
		public void selectcolour() {
			SelectClou.click();
		}
		public void Quantity() {
			Quantit.click();
		}
		public void Add() {
			AddtoCar.click();
		}
		}


