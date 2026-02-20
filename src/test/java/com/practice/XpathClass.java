package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathClass {

public static void main (String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("demoemail@gmail.com");
	driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("DemoPassword@1234");
	Thread.sleep(5000);
	driver.quit();
}
	
	
}
