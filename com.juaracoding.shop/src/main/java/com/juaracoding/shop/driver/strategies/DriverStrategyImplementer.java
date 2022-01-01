package com.juaracoding.shop.driver.strategies;

import com.juaracoding.shop.utils.*;

public class DriverStrategyImplementer {

	public static DriverStrategy chooseStrategy(String strategy) {
		switch (strategy) {
		case Constants.CHROME:
			return new Chrome();
		case Constants.FIREFOX:
			return new Firefox();
		default:
			return null;
		
		}
	}
}
