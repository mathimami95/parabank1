package org.pom;

import org.base.baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class loginpagetestingpom extends baseclass{
	public loginpagetestingpom(){
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(how = How.XPATH,using = "//input[@class='input']")
	 private WebElement  userName;
	public WebElement getUserName() {
		return userName;
	}
	@FindBy(how = How.XPATH,using = "//input[@name='password']")
	 private WebElement password;
	public WebElement getPassword() {
		return password;
	}
	@FindBy(how = How.XPATH,using = "//input[@type='submit']")
	private WebElement login;
	public WebElement getLogin() {
		return login;
	}
	@FindBy(how = How.XPATH,using ="//a[contains(text(),'Bill Pay')]")
	private WebElement billpay;
	public WebElement getBillpay() {
		return billpay;
	}
	@FindBy(how = How.XPATH,using ="//input[@ng-model='payee.name']")
	private WebElement firstname;
	public WebElement getFirstname() {
		return firstname;
	}
	@FindBy(how = How.XPATH,using ="//input[@ng-model='payee.address.street']")
	private WebElement address;
	public WebElement getAddress() {
		return address;
	}
	@FindBy(how = How.XPATH,using ="//input[@ng-model='payee.address.city']")
	private WebElement city;
	public WebElement getCity() {
		return city;
	}
	@FindBy(how = How.XPATH,using ="//input[@ng-model='payee.address.state']")
	private WebElement state;
	public WebElement getState() {
		return state;
	}
	@FindBy(how = How.XPATH,using ="//input[@ng-model='payee.address.zipCode']")
	private WebElement zipcode;
	public WebElement getZipcode() {
		return zipcode;
	}
	@FindBy(how = How.XPATH,using ="//input[@ng-model='payee.phoneNumber']")
	private WebElement phonenumber;
	public WebElement getPhonenumber() {
		return phonenumber;
	}
	@FindBy(how = How.XPATH,using ="//input[@ng-model='payee.accountNumber']")
	private WebElement accnum;
	public WebElement getAccnum() {
		return accnum;
	}
	@FindBy(how = How.XPATH,using ="//input[@ng-model='verifyAccount']")
	private WebElement accnumverify;
	public WebElement getAccnumverify() {
		return accnumverify;
	}
	@FindBy(how = How.NAME,using ="amount")
	private WebElement sendamount;
	
	public WebElement getSendamount() {
		return sendamount;
	}
	@FindBy(how = How.XPATH,using ="//input[@value='Send Payment']")
	private WebElement sendpay;
	public WebElement getSendpay() {
		return sendpay;
	}


}



