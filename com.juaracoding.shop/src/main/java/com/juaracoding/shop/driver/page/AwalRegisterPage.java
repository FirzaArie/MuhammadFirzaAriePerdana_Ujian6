package com.juaracoding.shop.driver.page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.shop.driver.singleton.*;

public class AwalRegisterPage {
	private WebDriver driver;
	
	public AwalRegisterPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"noo-site\"]/header/div[1]/div/ul[2]/li[2]/a")
	private WebElement btnMyAccount;
	
	@FindBy(xpath = "//*[@id=\"reg_username\"]")
	private WebElement txtboxuserName;

	@FindBy(id = "reg_email")
	private WebElement txtboxuserEmail;
	
	@FindBy(id = "reg_password")
	private WebElement txtboxuserPass;
	
	@FindBy(css = "#customer_login > div.u-column2.col-2 > form > p:nth-child(5) > button")
	private WebElement btnRegister;
	
	@FindBy(css = "#noo-site > header > div.navbar-wrapper > div > div > div > div > a > img")
	private WebElement btnHome;
	
	
	
	public void gotoLogIn() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		btnMyAccount.click();
	}
	
	public void InputUser(String usernm, String useremail, String password) {
		JavascriptExecutor js = (JavascriptExecutor)driver;	
		js.executeScript("arguments[0].scrollIntoView();", btnHome);
		txtboxuserName.click();
		txtboxuserName.sendKeys(usernm);
		txtboxuserEmail.sendKeys(useremail);
		txtboxuserPass.sendKeys(password);
	}
	public void goRegister() {	
		btnRegister.click();
	}
//	public String getDIsplayName() {
//		return txtDisplayName.getText();
//	}
}
