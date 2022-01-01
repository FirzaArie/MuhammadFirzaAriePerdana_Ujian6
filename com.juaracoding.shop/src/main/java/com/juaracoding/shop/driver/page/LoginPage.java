package com.juaracoding.shop.driver.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.shop.driver.singleton.DriverSingleton;

public class LoginPage {
	private WebDriver driver;
	
	public LoginPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"noo-site\"]/header/div[1]/div/ul[2]/li[2]/a")
	private WebElement btnMyAccount;

	@FindBy(id = "username")
	private WebElement txtboxuserName;

	@FindBy(id = "password")
	private WebElement txtboxPassword;

	@FindBy(css = "#customer_login > div.u-column1.col-1 > form > p:nth-child(3) > button")
	private WebElement btnLogin;
	
	public void gotoLogIn() {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,500)");
	btnMyAccount.click();
	}
	
	public void InputUser(String usernm, String password) {
	JavascriptExecutor js = (JavascriptExecutor)driver;	
	js.executeScript("arguments[0].scrollIntoView();", txtboxuserName);
	txtboxuserName.clear();
	txtboxuserName.sendKeys(usernm);
	txtboxPassword.sendKeys(password);
	}
	
	public void LoginUser() {
	btnLogin.click();
	}
}