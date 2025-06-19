package com.swag;

import org.testng.annotations.Test;
import com.constant.Expected;
import com.constant.Locators;
import com.constant.TestData;
import com.testConfig.Configrution1;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;

public class TC_001_Login_Test extends Configrution1 {

	@Test
	public void testLogin() {

		driver.findElement(By.id(Locators.BY_Id_USERNAME)).sendKeys(TestData.USERNAME);
		driver.findElement(By.id(Locators.BY_Id_PASSWORD)).sendKeys(TestData.PASSWORD);
		driver.findElement(By.id(Locators.BY_Id_Login_BTN)).click();
		String title = driver.getCurrentUrl();

		driver.quit();
		assertEquals(Expected.HOME_PAGE_CURRENT_URL,title);
	}
}