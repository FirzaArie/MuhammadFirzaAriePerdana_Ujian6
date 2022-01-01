package com.juaracoding.shop.driver.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.shop.driver.singleton.DriverSingleton;

public class CartPage {
	private WebDriver driver;
	
	public CartPage() {
	driver = DriverSingleton.getDriver();
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#nav-menu-item-cart > a > span")
	private WebElement btnCart;
	
	@FindBy(css = "#post-6 > div > div > div.cart-collaterals > div.cart_totals > div > a")
	private WebElement btnCheckout;
	
	@FindBy(id = "billing_first_name")
	private WebElement txtboxFirstName;

	@FindBy(id = "billing_last_name")
	private WebElement txtboxLastName;
	
	@FindBy(id = "billing_address_1")
	private WebElement txtboxAddress1;
	
	@FindBy(id = "billing_address_2")
	private WebElement txtboxAddress2;
	
	@FindBy(id = "billing_city")
	private WebElement txtboxCity;
	
	@FindBy(id = "billing_postcode")
	private WebElement txtboxPostCode;
	
	@FindBy(id = "billing_phone")
	private WebElement txtboxPhone;
	
	@FindBy(id = "terms")
	private WebElement btnToS;
	
	@FindBy(id = "place_order")
	private WebElement btnOrder;
	
	
	public void gotocartPage() {
	btnCart.click();
	}
	public void gotoCheckout() {
	JavascriptExecutor js = (JavascriptExecutor)driver;	
	js.executeScript("window.scrollBy(0,600)");
	btnCheckout.click();	
	}
	public void fillRequirements(String firstname, String lastname, String address1, String address2, String city, String pin, String phone) {
	JavascriptExecutor js = (JavascriptExecutor)driver;	
	js.executeScript("arguments[0].scrollIntoView();", txtboxFirstName);
	txtboxFirstName.clear();
	txtboxFirstName.sendKeys(firstname);
	txtboxLastName.clear();
	txtboxLastName.sendKeys(lastname);
	js.executeScript("arguments[0].scrollIntoView();", txtboxFirstName);
	txtboxAddress1.clear();
	txtboxAddress1.sendKeys(address1);
	txtboxAddress2.clear();
	txtboxAddress2.sendKeys(address2);
	js.executeScript("arguments[0].scrollIntoView();", txtboxCity);
	txtboxCity.clear();
	txtboxCity.sendKeys(city);
	txtboxPostCode.clear();
	txtboxPostCode.sendKeys(pin);
	txtboxPhone.clear();
	txtboxPhone.sendKeys(phone);
	btnToS.click();
	}
	public void gotofinalCheckout() {
	btnOrder.click();
	}
}
