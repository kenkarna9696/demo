package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_Concept {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
    "C:\\Users\\ADMIN\\eclipse-workspace\\Selenium_Programs\\SeleniumConcept\\driver\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.facebook.com/login/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    
    WebElement email = driver.findElement(By.id("email"));
    email.sendKeys("karnasumi007@gmail.com");
    
    WebElement password = driver.findElement(By.id("pass"));
    
   WebDriverWait wait=new WebDriverWait(driver,30);
   wait.until(ExpectedConditions.visibilityOf(password));
    password.sendKeys("karna9696");
    
    WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
    login.click();



}
}
