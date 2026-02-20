package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed_isEnabled {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/text-box.php");
		
		WebElement fullName = driver.findElement(By.id("fullname"));
		boolean displayed = fullName.isDisplayed();
		System.out.println("The TextBox is Displayed: " + displayed);
		boolean enabled = fullName.isEnabled();
		System.out.println("The TextBox is Enabled: " + enabled);
		fullName.sendKeys("Rohith Kumar");
		
	}

}
