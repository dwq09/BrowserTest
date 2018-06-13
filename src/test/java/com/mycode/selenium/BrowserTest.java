package com.mycode.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrowserTest {

	@Test
	public void test() {
		WebDriver driver = Browsers.launch(BrowserType.firefox, "resources/selenium/drivers/firefox/0.19.1/macos/geckodriver");
		driver.get("http://www.baidu.com");
		driver.findElement(By.partialLinkText("百度"));
		Assert.assertTrue(driver.getPageSource().contains("百度"));
		driver.quit();
	}
	
//	@Test
//	public void test1() {
//		WebDriver driver = Browsers.launch(BrowserType.firefox, "resources/selenium/drivers/firefox/0.19.1/macos/geckodriver");
//		driver.get("http://www.baidu.com");
//		driver.findElement(By.partialLinkText("美国混账"));
//		driver.quit();
//	}
}
