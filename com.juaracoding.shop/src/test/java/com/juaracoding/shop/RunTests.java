package com.juaracoding.shop;

import org.junit.Test;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/features", glue = "com.juaracoding.shop.glue")
public class RunTests {

	@Test
	public void tests() {
		
	}
}
