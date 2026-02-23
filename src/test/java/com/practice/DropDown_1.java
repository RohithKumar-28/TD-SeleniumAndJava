package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown_1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		
		WebElement stateDdn = driver.findElement(By.id("state"));
		if (stateDdn.isEnabled()) {
			System.out.println("State Dropdown is Enabled");
		} else {
			System.out.println("State Dropdown is not Enabled");
		}
		
		WebElement cityDdn = driver.findElement(By.id("city"));
		if (cityDdn.isEnabled()) {
			System.out.println("City Dropdown is Enabled");
		} else {
			System.out.println("City Dropdown is not Enabled");
		}
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", stateDdn);
		
		stateDdn.click();
		driver.findElement(By.xpath("//div[text()='NCR']")).click();
		
		cityDdn.click();
		driver.findElement(By.xpath("//div[text()='Delhi']")).click();
		
		driver.quit();
		
		
		
		
		
		
	}

}
