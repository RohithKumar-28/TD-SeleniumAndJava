package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSValue_TagName {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		
		WebElement submit = driver.findElement(By.id("submit"));
		String cssValue = submit.getCssValue("background-color");
		System.out.println(cssValue);
		
		String tagName = submit.getTagName();
		System.out.println(tagName);
		
		String attributeValue = submit.getAttribute("class");
		System.out.println(attributeValue);
		
		driver.quit();
		
		
	}

}
