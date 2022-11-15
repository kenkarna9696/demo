package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Adactin {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\ADMIN\\eclipse-workspace\\Selenium_Programs\\SeleniumConcept\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	driver.manage().window().maximize();
	
	WebElement username = driver.findElement(By.id("username"));
	username.sendKeys("karnaken");
	
	WebElement password = driver.findElement(By.id("password"));
	password.sendKeys("karna9696");
	
	WebElement login = driver.findElement(By.xpath("//input[@type='Submit']"));
	login.click();
	
	}

}
