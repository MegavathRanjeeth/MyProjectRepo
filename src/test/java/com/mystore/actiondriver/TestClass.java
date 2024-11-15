package com.mystore.actiondriver;

import org.testng.annotations.Test;

import com.mystore.MyStore_BaseClass;

public class TestClass extends MyStore_BaseClass {
	@Test
	public void testing() throws InterruptedException {
		IndexPage obj=new IndexPage(driver);
		obj.Signin();
		obj.logo();
		obj.search();
		obj.searchBtn();
		obj.contact();
		obj.card();
		
	    AccountCreate obj2=new AccountCreate(driver);
		obj2.Signin();
	    obj2.Email();
	    obj2.Pass();
		obj2.submit();
		
		HomePage obj3=new HomePage(driver);
		obj3.ADD();
		obj3.order();
		obj3.Credit();
		obj3.Address();
		obj3.info();
		obj3.back();
		
		SearchResult obj4=new SearchResult(driver);
		obj4.search();
		obj4.searchBtn();
		obj4.Select();
		obj4.selectcolour();
		
		AddtoCard obj5=new AddtoCard(driver);
		obj5.Quantity();
		obj5.Add();
		
		ContinueShop obj6=new ContinueShop(driver);
		obj6.conti();
		obj6.search();
		obj6.searchBtn();
		obj6.Select();
		obj6.selectcolour();
		obj6.Quantity();
		obj6.Add();
		
		Proceed obj7=new Proceed(driver);
		obj7.proceed();
		obj7.proceedtocheck();
		
//		MyAddress obj80=new MyAddress(driver);
//		obj80.Firstname();
//		obj80.Lastname();
//		obj80.company();
//		obj80.Address();
//		obj80.city();
//		obj80.state();
//		obj80.pincode();
//		obj80.country();
//		obj80.phone();
//		obj80.submit();

		
		AddressProceed obj9=new AddressProceed(driver);
		obj9.proceedtocheck();
		
		Shipping obj8=new Shipping(driver);
		obj8.checkbox();
		obj8.tocheck();
		
		Payment obj10=new Payment(driver);
		obj10.BankPay();
		obj10.Conform();
	}

}
