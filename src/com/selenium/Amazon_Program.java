package com.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Program {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Selenium_Programs\\SeleniumConcept\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    WebElement find = driver.findElement(By.id("twotabsearchtextbox"));
	    find.sendKeys("cricket");
	    List<WebElement> selectoptions = driver.findElements(By.xpath("(//div[@class='s-suggestion-container'])[5]"));
        //System.out.println(selectoptions);
	    for (WebElement webElement : selectoptions) {
		if (webElement.getText().equals("cricket kit bag")) {
			webElement.click();
			
		}
	}
	
	//(//div[@class='s-suggestion-container'])[5]
	}
	

}
