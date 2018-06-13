package com.mycode.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Safari {
	public static WebDriver launch() {
		WebDriver driver = new SafariDriver();
		return driver ;
	}
	
	public static void main(String[] args) {
		WebDriver driver = null;
		
		driver = launch();
		driver.get("http://www.baidu.com");
		driver.quit();
	}
}
