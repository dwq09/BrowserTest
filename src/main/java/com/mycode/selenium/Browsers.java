package com.mycode.selenium;

import org.openqa.selenium.WebDriver;

public class Browsers {

	public static WebDriver launch(BrowserType browserType, String driverPath) {
		WebDriver driver = null;

		switch (browserType) {
		case ie:
			break;
		case firefox:
			driver = Firefox.launch(driverPath);
			break;
		case safari:
			driver = Safari.launch();
			break;
		case chrome:
			driver = Chrome.launchChrome(driverPath);
			break;
		case opera:
			break;
		}
		return driver;
	}

	public static void main(String[] args) {
		String driverPath = "resources/selenium/drivers/chrome/2.30/mac64/chromedriver";
		String chromePath = "/Applications/Google Chrome.app/Contents/MacOS/Google Chrome";
		int port = 3333;

		WebDriver driver = Browsers.launch(BrowserType.chrome, driverPath);
		driver.get("http://www.baidu.com");
	}
}
