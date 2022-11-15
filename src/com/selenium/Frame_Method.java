package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Method {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\ADMIN\\eclipse-workspace\\Selenium_Programs\\SeleniumConcept\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Frames.html");
	
	driver.manage().window().maximize();
	
	driver.switchTo().frame("singleframe");
	WebElement textbox = driver.findElement(By.xpath("//input[@type='text']"));
	textbox.sendKeys("karna");
	
	//default content
	driver.switchTo().defaultContent();
	WebElement iframe = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
	iframe.click();
	
	WebElement outerbox = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
	driver.switchTo().frame(outerbox);
	
	WebElement innerlayer = driver.findElement(By.xpath("(//iframe[@src='SingleFrame.html'])"));
	driver.switchTo().frame(innerlayer);
	
	WebElement textbox1 = driver.findElement(By.xpath("//input[@type='text']"));
	textbox1.sendKeys("john");
	
	
	
	
	
	}

}
