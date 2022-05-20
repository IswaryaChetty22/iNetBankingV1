package com.inetBanking.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.AddCustomerPage;
import com.inetBanking.pageObjects.LogInPage;

public class TC_AddCustomerTest_003 extends BaseClass{
	
	@Test
	public void addNewCustomer() throws Exception {
		LogInPage lp= new LogInPage(driver);
		lp.setUserName(userName);
		logger.info("Username is provided");
		lp.setPassword(password);
		logger.info("Password is provided");
		lp.clickSubmit();
		logger.info("Login Clicked");
		
		Thread.sleep(3000);
		
		logger.info("Providing New Customer Details");
		AddCustomerPage addCust= new AddCustomerPage(driver);
		addCust.clickLnkNewCustomer();
		addCust.setTxtCustomerName("Bala");
		addCust.setRdGender("male");
		addCust.setTxtdob("08", "09", "1988");
		addCust.setTxtAddr("Plot no 9 NGO Colony Annanji");
		addCust.setTxtCity("Theni");
		addCust.setTxtState("Tamilnadu");
		addCust.setTxtPin("625531");
		addCust.setTxtMobNo("9099909900");
		addCust.setTxtEmail(randomString()+"@gmail.com");
		addCust.setTxtPassword("bala88");
		addCust.btnSubmit();
		
		Thread.sleep(3000);
		
		logger.info("Validation started...");
		boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
		if(res==true) {
			Assert.assertTrue(true);
			logger.info("test case passed...");
		}else {
			logger.info("test case failed...");
			captureScreen(driver, "addNewCustomer");
			Assert.assertTrue(false);
		}
	}
	
	
}
