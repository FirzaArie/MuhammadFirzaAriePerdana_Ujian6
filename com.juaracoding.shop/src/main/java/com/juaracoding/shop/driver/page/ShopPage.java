package com.juaracoding.shop.driver.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.shop.driver.singleton.DriverSingleton;

public class ShopPage {
	private WebDriver driver;
	
	public ShopPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"noo-site\"]/header/div[2]/div/div/div/a")
	private WebElement btnSearch;
	
	@FindBy(css = "#noo-site > header > div.search-header.search-header-eff > div.noo-container > form > input.form-control")
	private WebElement txtboxSearch;
	
	@FindBy(css = "#noo-site > div.noo-container-shop.noo-shop-wrap > div.noo-row > div > div > div.noo-product-item.one.noo-product-sm-4.not_featured.post-1348.product.type-product.status-publish.has-post-thumbnail.product_cat-sun-glasses.product_tag-sun-glasses.product_tag-women.has-featured.first.instock.shipping-taxable.purchasable.product-type-variable > div > div.noo-product-thumbnail > div.noo-product-slider.owl-carousel.owl-theme > div.owl-wrapper-outer.autoHeight > div > div.owl-item.active > a > img")
	private WebElement productGlasses;
	
	@FindBy(id = "pa_color")
	private WebElement productColor;
	
	@FindBy(id = "pa_size")
	private WebElement productSize;
	
	@FindBy(id = "cboxClose")
	private WebElement btnClose;
	
	
	@FindBy(css = "#product-1348 > div.single-product-content > div.summary.entry-summary > form > div > div.woocommerce-variation-add-to-cart.variations_button.woocommerce-variation-add-to-cart-enabled > button")
	private WebElement btnSubmit;
	
	@FindBy(css = "#product-1301 > div.single-product-content > div.summary.entry-summary > form > div > div.woocommerce-variation-add-to-cart.variations_button.woocommerce-variation-add-to-cart-enabled > button")
	private WebElement btnSubmit2;
	
	@FindBy(css = "#product-1301 > div.single-product-content > div.summary.entry-summary > a")
	private WebElement btnCompare;
	
	
	public void clickSearch() {	
	btnSearch.click();
	}
	
	
	public void searchGlass(String search1) {	
	txtboxSearch.sendKeys(search1);
	txtboxSearch.submit();
	}
	
	public void searchShoes(String search2) {	
	txtboxSearch.sendKeys(search2);
	txtboxSearch.submit();
	}
	
	public void productGlass() {
	JavascriptExecutor js = (JavascriptExecutor)driver;	
	js.executeScript("arguments[0].scrollIntoView();", productGlasses);
	productGlasses.click();
	js.executeScript("window.scrollBy(0,600)");
	productColor.click();
	productColor.sendKeys(Keys.ARROW_DOWN);
	productSize.click();
	productSize.sendKeys(Keys.ARROW_DOWN);
	}
	
	public void productShoes() {
	JavascriptExecutor js = (JavascriptExecutor)driver;	
	js.executeScript("window.scrollBy(0,600)");
	productColor.click();
	productColor.sendKeys(Keys.ARROW_DOWN);
	productSize.click();
	productSize.sendKeys(Keys.ARROW_DOWN);
	}
	
	public void productSubmit() {
	JavascriptExecutor js = (JavascriptExecutor)driver;	
	js.executeScript("window.scrollBy(0,100)");
	productColor.click();
	btnSubmit.click();	
	}
	
	public void productCompare() {
	JavascriptExecutor js = (JavascriptExecutor)driver;	
	js.executeScript("window.scrollBy(0,100)");
	productColor.click();
	btnCompare.click();	
	js.executeScript("arguments[0].scrollIntoView();", btnClose);
	WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.elementToBeClickable(btnClose));
	btnClose.click();
	btnSubmit2.click();
	}
	
}
