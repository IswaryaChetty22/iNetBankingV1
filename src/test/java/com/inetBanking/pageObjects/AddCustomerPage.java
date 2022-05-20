package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {

	WebDriver ldriver;

	public AddCustomerPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how= How.XPATH,using = "/html/body/div[3]/div/ul/li[2]/a")
	@CacheLookup
	WebElement lnkNewCustomer;
	
	@FindBy(name="name")
	@CacheLookup
	WebElement txtCustomerName;
	
	@FindBy(how= How.NAME ,using = "rad1")
	@CacheLookup
	WebElement rdGender;
	
	@FindBy(how= How.ID_OR_NAME ,using = "dob")
	@CacheLookup
	WebElement txtdob;
	
	@FindBy(how= How.NAME ,using = "addr")
	@CacheLookup
	WebElement txtAddr;
	
	@FindBy(how= How.NAME ,using = "city")
	@CacheLookup
	WebElement txtCity;
	
	@FindBy(how= How.NAME ,using = "state")
	@CacheLookup
	WebElement txtState;
	
	@FindBy(how= How.NAME ,using = "pinno")
	@CacheLookup
	WebElement txtPin;
	
	@FindBy(how= How.NAME ,using = "telephoneno")
	@CacheLookup
	WebElement txtMobNo;
	
	@FindBy(how= How.NAME ,using = "emailid")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(how= How.NAME ,using = "password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(how= How.NAME ,using = "sub")
	@CacheLookup
	WebElement btnSubmit;
	
	@FindBy(how= How.NAME ,using = "res")
	@CacheLookup
	WebElement btnReset;
	
	public void clickLnkNewCustomer() {
		lnkNewCustomer.click();
	}

	public void setTxtCustomerName(String cName) {
		txtCustomerName.sendKeys(cName);
	}

	public void setRdGender(String cGender) {
		rdGender.click();
	}

	public void setTxtdob(String mm,String dd, String yy) {
		txtdob.sendKeys(mm);
		txtdob.sendKeys(dd);
		txtdob.sendKeys(yy);
	}

	public void setTxtAddr(String cAddr) {
		txtAddr.sendKeys(cAddr);
	}

	public void setTxtCity(String cCity) {
		txtCity.sendKeys(cCity);
	}

	public void setTxtState(String cState) {
		txtState.sendKeys(cState);
	}

	public void setTxtPin(String cPin) {
		txtPin.sendKeys(cPin);
	}

	public void setTxtMobNo(String cMobNo) {
		txtMobNo.sendKeys(cMobNo);
	}

	public void setTxtEmail(String cEmail) {
		txtEmail.sendKeys(cEmail);
	}

	public void setTxtPassword(String cPassword) {
		txtPassword.sendKeys(cPassword);
	}

	public void btnSubmit() {
		btnSubmit.click();
	}

	public void btnReset() {
		btnReset.click();
	}

	
}
