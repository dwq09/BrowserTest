package com.mycode.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Firefox {

	/**
	 * 启动Firefox
	 * 
	 * @param geckoDriverPath
	 * @return
	 */
	public static WebDriver launch(String geckoDriverPath) {
		System.setProperty("webdriver.gecko.driver", geckoDriverPath);
		WebDriver driver = new FirefoxDriver();
		return driver;
	}

	/**
	 * 自定义Firefox启动程序路径，启动Firefox
	 * 
	 * @param firefoxPath
	 * @param geckoDriverPath
	 * @return
	 */
	public static WebDriver launch(String firefoxPath, String geckoDriverPath) {
		System.setProperty("webdriver.gecko.driver", geckoDriverPath);
		System.setProperty("webdriver.firefox.bin", firefoxPath);
		WebDriver driver = new FirefoxDriver();
		return driver;
	}

	public static WebDriver launch(String geckoDriverPath, FirefoxOptions options) {
		WebDriver driver = new FirefoxDriver(options);
		return driver;
	}

	public static void main(String[] args) {
		String geckoDriverPath = "resources/selenium/drivers/firefox/0.19.1/macos/geckodriver";
		String firefoxPath = "/Applications/Firefox.app/Contents/MacOS/firefox";
		WebDriver driver = null;

		// driver = Firefox.launch(geckoDriverPath);
		driver = Firefox.launch(firefoxPath, geckoDriverPath);
		// driver = Firefox.launchAloneBinary(firefoxPath, geckoDriverPath);
		driver.get("http://www.baidu.com");
	}
}