package com.selenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_One {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Selenium_Programs\\SeleniumConcept\\driver\\chromedriver.exe");
	 WebDriver driver =new ChromeDriver();
	 driver.get("https://letcode.in/dropdowns");
	driver.manage().window().maximize();
	
	WebElement moreoptions = driver.findElement(By.id("superheros"));
	Select s = new Select(moreoptions);
	
	s.selectByValue("am");
	s.selectByValue("aq");
	s.selectByVisibleText("The Avengers");
	
	s.deselectByValue("am");
	
	//getoptions
	List<WebElement> options = s.getOptions();
	for (WebElement alloptions : options) {
		System.out.println(alloptions.getText());

	}
	
	
	
	
	
	
	

	
	
	
	}

}
