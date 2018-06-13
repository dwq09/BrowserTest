package com.mycode.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome {

	/**
	 * 启动chrome
	 * 
	 * @param chromeDriverPath
	 *            chrome驱动路径
	 * @return
	 */
	public static WebDriver launchChrome(String chromeDriverPath) {
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		WebDriver driver = new ChromeDriver();
		return driver;
	}

	/**
	 * 自定义chrome的启动程序路径，启动chrome
	 * 
	 * @param chromePath
	 *            chrome启动程序的路径
	 * @param chromeDriverPath
	 *            chrome驱动路径
	 * @return
	 */
	public static WebDriver launchChrome(String chromePath, String chromeDriverPath) {
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		ChromeOptions options = new ChromeOptions();
		options.setBinary(chromePath);

		// options.addExtensions(new File("./test.crx"));
		// options.addArguments("a1 a2 a3");

		WebDriver driver = new ChromeDriver(options);
		return driver;
	}

	/**
	 * 自定义端口，启动chrome
	 * 
	 * @param chromePath
	 * @param chromeDriverPath
	 * @param port
	 * @return
	 */
	public static WebDriver launchChrome(String chromePath, String chromeDriverPath, int port) {
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);

		ChromeDriverService.Builder builder = new ChromeDriverService.Builder();
		builder.usingPort(port);

		ChromeDriverService chromeDriverService = builder.build();
		WebDriver driver = new ChromeDriver(chromeDriverService);
		return driver;
	}

	public static void main(String[] args) {
		String chromeDriverPath = "resources/selenium/drivers/chrome/2.30/mac64/chromedriver";
		String chromePath = "/Applications/Google Chrome.app/Contents/MacOS/Google Chrome";
		int port = 3333;
		WebDriver driver = null;

		// driver =
		// driver = launchChrome(chromeDriverPath);
		// driver = launchChrome(chromePath,chromeDriverPath);
		driver = launchChrome(chromePath, chromeDriverPath, port);
		driver.get("http://www.baidu.com");
	}
}
