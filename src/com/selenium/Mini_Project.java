package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mini_Project {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
		("C:\\Users\\ADMIN\\eclipse-workspace\\Selenium_Programs\\SeleniumConcept\\driver\\chromedriver.exe"));
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://adactinhotelapp.com/Register.php");
	    driver.manage().window().maximize();
	    
	    WebElement username = driver.findElement(By.id("username"));
	    username.sendKeys("kenkarna");
	    
	    WebElement password = driver.findElement(By.id("password"));
	    password.sendKeys("ken9696");
	    
	    WebElement repassword = driver.findElement(By.id("re_password"));
	    repassword.sendKeys("ken9696");
	    
	    WebElement name = driver.findElement(By.id("full_name"));
	    name.sendKeys("karunakranC");
	    
	    WebElement mail = driver.findElement(By.id("email_add"));
	    mail.sendKeys("karunakaran0696@gmail.com");
	    
	    WebElement box = driver.findElement(By.id("tnc_box"));
	    box.click();
	    
	    WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
	    submit.click();
	    
	
	
	}

}
