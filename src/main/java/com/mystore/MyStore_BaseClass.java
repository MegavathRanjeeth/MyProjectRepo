package com.mystore;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class MyStore_BaseClass {
	public static WebDriver driver;
	String url="http://www.automationpractice.pl/index.php";
	
	@BeforeMethod
	public void setup() {
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
	}
	@AfterMethod
	public void close() {
		//driver.close();
	}

}
