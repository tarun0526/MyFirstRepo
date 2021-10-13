package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import TestBase.TestBase1demo;

public class LoginPage extends TestBase1demo {
	
	By loginbutton = By.xpath("/html/body/nav/div/ul/li[2]/div/span/a");
	By usertextbox = By.id("username");
	By passtextbox = By.id("password");
	By loginbtn = By.id("loginbtn");
	
	
	public WebElement loginButtonField()
	{
		return driver.findElement(loginbutton);
	}
	public WebElement usertextField()
	{
		return driver.findElement(usertextbox);
	}
	public WebElement passtextField()
	{
		return driver.findElement(passtextbox);
	}
	public WebElement logintextField()
	{
		return driver.findElement(loginbtn);
	}
}
