package com.kiranAcedmy;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.config.ScreenshotUtil;

public class TC_001_Login_Test {

	@Test
	public void logintest() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/liveproject/index.html");
		driver.manage().window().maximize();

		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		driver.findElement(By.className("fa-user")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button")).click();
		driver.findElement(By.id("username")).sendKeys("Taufik");
		driver.findElement(By.id("mobile")).sendKeys("9876543210");
		driver.findElement(By.id("email")).sendKeys("taufik@gmail.com");
		driver.findElement(By.id("course")).sendKeys("Java");
		driver.findElement(By.id("Male")).click();
		WebElement element = driver
				.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[6]/div/select"));
		
		Select select = new Select(element);
		select.selectByIndex(2);
		
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("submit")).click();
		
		Alert alert1 = driver.switchTo().alert();
				alert1.accept();
				
				ScreenshotUtil.captureScreenshot(driver,"logintest" );	
				
			
	}
}