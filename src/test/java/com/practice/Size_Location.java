package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Size_Location {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		
		WebElement currentAddress = driver.findElement(By.id("currentAddress"));
		int height = currentAddress.getSize().getHeight();
		int width = currentAddress.getSize().getWidth();
		System.out.println("Height is " + height + " Width is " + width);
		
		int xValue = currentAddress.getLocation().getX();
		int yValue = currentAddress.getLocation().getY();
		System.out.println("X value is " + xValue + " Y value is " + yValue);
		
		driver.quit();
		
		
		
		
		
		
	}

}
