package com.juaracoding.shop.glue;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.juaracoding.shop.driver.config.AutomationFrameworkConfiguration;
import com.juaracoding.shop.driver.page.*;
import com.juaracoding.shop.driver.singleton.*;
import com.juaracoding.shop.utils.*;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(classes = AutomationFrameworkConfiguration.class)
public class StepDefinition {

	private WebDriver driver;
	private AwalRegisterPage registerPage;
	private LoginPage loginPage;
	private ShopPage shopPage;
	private CartPage cartPage;
	ExtentTest extentTest;
	static ExtentReports report = new ExtentReports("src/main/resources/TestReport.html");
	
	@Autowired
	ConfigurationProperties configurationProperties;
	
	@Before
	public void initializeObjects() {
		DriverSingleton.getInstance(configurationProperties.getBrowser());
		registerPage = new AwalRegisterPage();
		loginPage = new LoginPage();
		shopPage = new ShopPage();
		cartPage = new CartPage();
		TestCases[] tests = TestCases.values();
		extentTest = report.startTest(tests[Utils.testCount].getTestName());
		Log.getLogData(Log.class.getName()); //log4j
		Log.startTest(tests[Utils.testCount].getTestName()); //log4j
		Utils.testCount++;
	}
	
	@Given("^User go to the Website")
	public void user_go_to_the_Website() {
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL);
		Log.info("INFO: Navigating to "+ Constants.URL);
	}

	@Given("^User go to search")
	public void User_go_to_search() {
		shopPage.clickSearch();
	}
	
	@Given("^User go to search shoes")
	public void User_go_to_search_shoes() {
		shopPage.clickSearch();
	}
	
	@Given("^User go to the Cart Page")
	public void user_go_to_the_cart_page() {
		cartPage.gotocartPage();
	}
	
	@When("^User click MyAccount page button")
	public void user_click_my_account_page_button() {
		registerPage.gotoLogIn();
	}	
	
	@When("^User input username password email")
	public void user_input_username_password_email() {
		registerPage.InputUser(configurationProperties.getUsernm(), configurationProperties.getUseremail(), configurationProperties.getPassword());
	}
	
//	@When("^User click MyAccount page button")
//	public void user_click_my_account_page_button() {
//		loginPage.gotoLogIn();
//	}
	
	@When("^User Add new email and password")
	public void user_add_new_email_and_password() {
		loginPage.InputUser(configurationProperties.getUsernm(), configurationProperties.getPassword());
	}
	
	@When("^User type glass and submit")
	public void user_type_glass_and_submit() {
		shopPage.searchGlass(configurationProperties.getSearch1());
	}
	
	@When("^User Open product Page click Color and size")
	public void user_open_product_page_click_color_and_size() {
		shopPage.productGlass();
	}
	
	@When("^User type shoes and submit")
	public void user_type_shoes_and_submit() {
		shopPage.searchShoes(configurationProperties.getSearch2());
	}
	
	@When("^User Open product shoes click Color and size")
	public void user_open_product_shoes_click_color_and_size() {
		shopPage.productShoes();
	}
	
	@When("^User can proceed to checkout")
	public void user_can_proceed_to_checkout() {
	cartPage.gotoCheckout();
	}
	
	@When("^User can fill the requirement")
	public void user_can_fill_the_requirement() {
	cartPage.fillRequirements(configurationProperties.getFirstname(), configurationProperties.getLastname(), configurationProperties.getAddress1(), configurationProperties.getAddress2(), configurationProperties.getCity(), configurationProperties.getPin(), configurationProperties.getPhone());
	}
	
//	@When("^User click MyAccount page button")
//	public void user_click_my_account_page_button() {
//		registerPage.gotoLogIn();
//	}	
	
//	@When("^User input usernm password email")
//	public void user_input_usernm_password_email() {
//		registerPage.InputUser(configurationProperties.getusernm(), configurationProperties.getUseremail(), configurationProperties.getPassword());
//	}
	
	@Then("^User can click Register")
	public void user_can_click_register() {
		 registerPage.goRegister();
	}
	
	@Then("^User can press login")
	public void user_can_press_login() {
		 loginPage.LoginUser();
	}
	
	@Then("^User click add to cart")
	public void user_click_add_to_cart() {
		 shopPage.productSubmit();
	}
	
	@Then("^User click compare and add to cart")
	public void user_click_compare_and_add_to_cart() {
		 shopPage.productCompare();
	}
	
	@Then("^User can place an order")
	public void user_can_place_an_order() {
		 cartPage.gotofinalCheckout();
	}
	
	
//	
//	@Then("^User can go back to Dashboard ")
//	public void User_can_go_back_to_Dashboard () {
//		 commentpage.backHome();
//	}
	

}
