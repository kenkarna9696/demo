package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Method {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\ADMIN\\eclipse-workspace\\Selenium_Programs\\SeleniumConcept\\driver\\chromedriver.exe" );
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://testleaf.herokuapp.com/pages/Alert.html");
	  driver.manage().window().maximize();
	  
	  //simple alert
	  WebElement simplealert = driver.findElement(By.xpath("//button[text()='Alert Box']"));
	  simplealert.click();
	  Alert SimpleAlert = driver.switchTo().alert();
	  SimpleAlert.accept();
	  
	  //comfirm alert
	  WebElement confirmalert = driver.findElement(By.xpath("//button[text()='Confirm Box']"));
	  confirmalert.click();
	  Alert ConfirmAlert = driver.switchTo().alert();
	  ConfirmAlert.dismiss();
	  
	  //promt alert
	  WebElement promtalert = driver.findElement(By.xpath("//button[text()='Prompt Box']"));
	  promtalert.click();
	  Alert PromtAlert = driver.switchTo().alert();
	  PromtAlert.sendKeys("kenkarna");
	  PromtAlert.accept();
	  
	  //linebreaks
	  WebElement linebreaks = driver.findElement(By.xpath("//button[text()='Line Breaks?']"));
	  linebreaks.click();
	  Alert LineBreaks = driver.switchTo().alert();
	  LineBreaks.sendKeys("selenium");
	  LineBreaks.dismiss();
	  
	}

}
