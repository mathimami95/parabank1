package org.base;

import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.pom.loginpagetestingpom;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Execution extends baseclass {

	public static baseclass b = new baseclass();
	public static loginpagetestingpom  pom;
	public static ExtentSparkReporter spark = new ExtentSparkReporter("ExtentReportSept19.html");
	 public static ExtentReports extend = new ExtentReports();
	 public static  ExtentTest test = extend.createTest("parabank webpage login");
	 
	@BeforeTest
	private void before() {
		extend.attachReporter(spark);
	}
	
	@AfterTest
	private void After() {
		extend.flush();
	}
	
	
	@Test(priority = -2)
	public static void Browser() {
		try {
			test.assignAuthor("mathi");
			test.assignCategory("smokeTest");
			test.assignDevice("chrome");
			b.initidriver("chrome");
			b.windowmax();
			System.out.println("Browser Launched Sucessfully");
			test.log(Status.PASS,"Browser Launched Sucessfully");
		}catch(Exception e) {
			System.out.println("Browser not Launched Sucessfully");
			test.log(Status.FAIL,"Browser not Launched Sucessfully");
			test.addScreenCaptureFromPath(capture(driver));
		}
	}
	@Test(priority = -1)
	public void launched() {
		try {
			b.geturl("https://para.testar.org/parabank/overview.htm");
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			System.out.println("url loaded sucessfully");
			test.log(Status.PASS,"url Launched Sucessfully");
		
	}catch (Exception e) {
	       System.out.println("url loaded not sucessfully"); 
	       test.log(Status.FAIL,"urlr not Launched Sucessfully");
			test.addScreenCaptureFromPath(capture(driver));
}
}
    @Test(priority = 0)
	public void tc00_testingloginpage() {
		try {
			pom = new loginpagetestingpom();
			WebElement username = pom.getUserName();
			username.sendKeys(b.excelread(0, 0));
			WebElement password = pom.getPassword();
			password.click();
			password.sendKeys(b.excelread(1,0));
			WebElement login = pom.getLogin();
			login.click();
			System.out.println("login data entered sucessfully");
			test.log(Status.PASS,"login data Launched Sucessfully");
          }catch(Exception e) {
	          System.out.println("login data not entered sucessfully");
	          test.log(Status.FAIL,"login data not Launched Sucessfully");
				test.addScreenCaptureFromPath(capture(driver));
			
		}
	}
	
	@Test(priority = 1)
	public void paymentstatus() {
		try {
			WebElement billpay=pom.getBillpay();
			billpay.click();
			WebElement firstname = pom.getFirstname();
			firstname.sendKeys(b.excelread(2, 0));
			
			WebElement address = pom.getAddress();
			address.sendKeys(b.excelread(3,0));
			WebElement city = pom.getCity();
			city.sendKeys(b.excelread(4, 0));
			WebElement State = pom.getState();
			State.sendKeys(b.excelread(5, 0));
			WebElement zipcode = pom.getZipcode();
			zipcode.sendKeys(b.excelread(6, 0));
			WebElement phonenumber = pom.getPhonenumber();
			phonenumber.sendKeys(b.excelread(7,0));

			WebElement accunum = pom.getAccnum();
			accunum.sendKeys(b.excelread(8, 0));
			WebElement accunumverify = pom.getAccnumverify();
			accunumverify.sendKeys(b.excelread(9, 0));
			WebElement sendamount = pom.getSendamount();
			sendamount.sendKeys(b.excelread(10, 0));
			WebElement sendpay = pom.getSendpay();
			sendpay.click();
		
			System.out.println("payment status is sucess");
			test.log(Status.PASS,"payment status is Sucessfull");
		}catch(Exception e) {
			System.out.println("payment status is not sucess");
			test.log(Status.FAIL,"payment status not Sucessfull");
			test.addScreenCaptureFromPath(capture(driver));
		}}
	@Test(priority = 2)
	public static void finalstatus() {
	try {
		b.Screenshot("usingtestng");
	System.out.println("tested succesfully");
	test.log(Status.PASS,"tested Sucessfully");
	test.addScreenCaptureFromPath(capture(driver));
	}catch(Exception e) {
		test.log(Status.FAIL,"verify the error message");
		
		
	}
	}
	

}





