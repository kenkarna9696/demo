package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra_Path {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Selenium_Programs\\SeleniumConcept\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/kids?f=Categories%3ATshirts%3A%3AGender%3Aboys%2Cboys%20girls&plaEnabled=false");
		driver.manage().window().maximize();
		
		List<WebElement> total = driver.findElements(By.xpath("//li[@class='product-base']	"));
		for (WebElement webElement : total) {
			String text = webElement.getText();
			System.out.println(text);
			
		}
		List<WebElement> productname = driver.findElements(By.xpath("//h3[@class=\"product-brand\"]"));
		for (WebElement singlename : productname) {
			String text = singlename.getText();
		System.err.println(text);
			
		}
	    int size = total.size();
	    System.out.println("Total product of kids page : "+size);
	    
	    
	    
	    
	}
	

}
