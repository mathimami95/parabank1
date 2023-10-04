package org.base;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.pom.loginpagetestingpom;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class sample extends baseclass{

	public static baseclass b = new baseclass();
	public static loginpagetestingpom  pom;
	@Parameters({"browser"})
	@Test
	public static void Browser(String browserType) {
		try {
			   if(browserType.equals("Edge")) {
				   b.initidriver("Edge");
			   }else {
				   b.initidriver("chrome");
			   }
					b.windowmax();
					System.out.println("Browser Launched Sucessfully");
				}catch(Exception e) {
					System.out.println("Browser not Launched Sucessfully");
				}
			
			
				try {
					b.geturl("https://para.testar.org/parabank/overview.htm");
					driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
					System.out.println("url loaded sucessfully");
				
			}catch (Exception e) {
			       System.out.println("url loaded not sucessfully"); 
		}
		
				try {
					pom = new loginpagetestingpom();
					WebElement username = pom.getUserName();
					username.sendKeys(b.excelread(0,0));
					WebElement password = pom.getPassword();
					password.click();
					password.sendKeys(b.excelread(1,0));
					WebElement login = pom.getLogin();
					login.click();
					System.out.println("login data entered sucessfully");
		          }catch(Exception e) {
			          System.out.println("login data not entered sucessfully");
					
				}
		
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
				}catch(Exception e) {
					System.out.println("payment status is not sucess");
				}
			
			try {
				b.Screenshot("usingtestng");
			System.out.println("verify the error message");
			}catch(Exception e) {
				
			}
			}
			

		}






