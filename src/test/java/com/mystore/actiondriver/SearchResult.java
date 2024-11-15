package com.mystore.actiondriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.MyStore_BaseClass;

public class SearchResult extends MyStore_BaseClass {
	//1 creating test case for input
		
		@FindBy(name="search_query")
		WebElement Search;
		
		@FindBy(name="submit_search")
		WebElement SearchBtn;
		
		@FindBy(xpath="//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img")
		WebElement SelectItem;
		
		@FindBy(id="color_8")
		WebElement SelectClour;
				
				
				//2 creating constructor
				public SearchResult(WebDriver driver){
					PageFactory.initElements(driver,this);
					
				}
				
				// 3) Giving values
				public void search() throws InterruptedException {
					Search.sendKeys("Blouse");
					Thread.sleep(2000);
				}
				public void searchBtn() {
					SearchBtn.click();
				}
				public void Select() throws InterruptedException {
					SelectItem.click();
					Thread.sleep(2000);
				}
				
				public void selectcolour() {
					SelectClour.click();
				}


}
