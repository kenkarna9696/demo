package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium_example {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver", 
	"C:\\Users\\ADMIN\\eclipse-workspace\\Selenium_Programs\\SeleniumConcept\\driver\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.amazon.in/");
    driver.manage().window().maximize();
    WebElement mobiles = driver.findElement(By.xpath("//a[text()='Mobiles']"));
    Actions ac=new Actions(driver);
    ac.contextClick(mobiles).build().perform();
    
    Robot r= new Robot();
    
    r.keyPress(KeyEvent.VK_DOWN);
    r.keyRelease(KeyEvent.VK_DOWN);
    
    r.keyPress(KeyEvent.VK_ENTER);
    r.keyRelease(KeyEvent.VK_ENTER);
    
    WebElement fashion = driver.findElement(By.xpath("//a[text()='Fashion']"));
    ac.contextClick(fashion).build().perform();
    
    r.keyPress(KeyEvent.VK_DOWN);
    r.keyRelease(KeyEvent.VK_DOWN);
    
    r.keyPress(KeyEvent.VK_ENTER);
    r.keyRelease(KeyEvent.VK_ENTER);
    
    Set<String> windowHandles = driver.getWindowHandles();
    for (String id : windowHandles) {
	String title = driver.switchTo().window(id).getTitle();
	System.out.println(title);
	
	
	
	}
}
}
