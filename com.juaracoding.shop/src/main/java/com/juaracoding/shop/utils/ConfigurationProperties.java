package com.juaracoding.shop.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("framework.properties")
public class ConfigurationProperties {

	@Value("${browser}")
	private String browser;
	
	@Value("${usernm}")
	private String usernm;
	
	@Value("${useremail}")
	private String useremail;
	
	@Value("${password}")
	private String password;
	
	@Value("${search1}")
	private String search1;
	
	@Value("${search2}")
	private String search2;
	
	@Value("${firstname}")
	private String firstname;
	
	@Value("${lastname}")
	private String lastname;
	
	@Value("${address1}")
	private String address1;
	
	@Value("${address2}")
	private String address2;
	
	@Value("${city}")
	private String city;
	
	@Value("${pin}")
	private String pin;
	
	@Value("${phone}")
	private String phone;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSearch1() {
		return search1;
	}

	public void setSearch1(String search1) {
		this.search1 = search1;
	}

	public String getSearch2() {
		return search2;
	}

	public void setSearch2(String search2) {
		this.search2 = search2;
	}

	public String getBrowser() {
		return browser;
	}

	public void setBrowser(String browser) {
		this.browser = browser;
	}

	public String getUsernm() {
		return usernm;
	}

	public void setUsernm(String usernm) {
		this.usernm = usernm;
	}

	public String getUseremail() {
		return useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
	