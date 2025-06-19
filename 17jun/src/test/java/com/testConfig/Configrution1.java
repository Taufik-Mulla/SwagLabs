package com.testConfig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Configrution1 {

	public WebDriver driver = null;

	@BeforeMethod
	public WebDriver getConfiguration() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		return driver;
	}

	@AfterMethod
	public void closeBrowser() {
		if (driver != null) {
			driver.quit();
		}
	}
}