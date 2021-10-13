package Testcase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TestBase.TestBase1demo;
import pages.LoginPage;

public class NewTest extends TestBase1demo {
	
	
	LoginPage lp;
	public NewTest(){
		super();
	}
	
	
	@BeforeClass
	public void m1(){
		initialization();
		lp = new LoginPage();
	}
	 @Test
	 public void validLoginCred(){
		 lp.loginButtonField().click();
		 lp.usertextField().sendKeys(prop.getProperty("username"));
		 lp.passtextField().sendKeys(prop.getProperty("password"));
		 lp.logintextField().click();	 
	 }
	 
	 @AfterClass
	 public void m2(){
		 terminate();
	 }
}
