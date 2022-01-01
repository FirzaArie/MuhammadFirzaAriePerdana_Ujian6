package com.juaracoding.shop.utils;

public enum TestCases {

	T1("Testing the authentication"),
	T2("Login"),
	T3("AddToCart Glass"),
	T4("AddToCart Shoes"),
	T5("Cart Page");
	
	private String testName;	

	TestCases(String value){
		this.testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
}
