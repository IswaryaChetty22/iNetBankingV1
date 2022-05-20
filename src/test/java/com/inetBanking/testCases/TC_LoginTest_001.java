package com.inetBanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LogInPage;

public class TC_LoginTest_001 extends BaseClass {
	
	@Test
	public void loginTest() throws IOException {
				
		logger.info("Link opened");
		LogInPage lpage= new LogInPage(driver);
		lpage.setUserName(userName);
		logger.info("UserName entered");
		lpage.setPassword(password);
		logger.info("Password entered");
		lpage.clickSubmit();
		logger.info("Login clicked");
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
			logger.info("Login Succesful");
		}
		else {
			captureScreen(driver, "loginTest");
			Assert.assertFalse(false);
			logger.info("Login Failed");
		}
	}

}

