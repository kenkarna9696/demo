package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IptClass_Java {
	public static void main(String[] args) {
		
		//all product
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Selenium_Programs\\SeleniumConcept\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.myntra.com/kids");
	driver.manage().window().maximize();
	List<WebElement> findes = driver.findElements(By.xpath("//li[@class=\"product-base\"]"));
	int size = findes.size();
	System.out.println(size);
	
	//lowest value product 
	driver.findElement(By.xpath(""));
	
	
	
	}
	

	
	
}


