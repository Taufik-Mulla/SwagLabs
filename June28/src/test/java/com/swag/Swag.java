package com.swag;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swag {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();

		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();

		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).click();
		driver.findElement(By.id("checkout")).click();
		
		driver.findElement(By.id("first-name")).sendKeys("Swapnil");
		driver.findElement(By.id("last-name")).sendKeys("Patil");
		driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("123456");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("finish")).click();
	

		driver.quit();
		
		

	}

}