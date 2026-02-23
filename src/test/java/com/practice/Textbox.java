package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textbox {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		
		WebElement elements = driver.findElement(By.xpath("//div[@class=\"card-body\"]//child::h5[text()=\"Elements\"]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView(true);", elements);
		js.executeScript("arguments[0].click();", elements);
		WebElement textBox = driver.findElement(By.xpath("//li[@id=\"item-0\"]//child::span[text()=\"Text Box\"]"));
		js.executeScript("arguments[0].click();", textBox);
		
		WebElement fullName = driver.findElement(By.id("userName"));
		fullName.sendKeys("Rohith Kumar");
		
		WebElement email = driver.findElement(By.id("userEmail"));
		email.sendKeys("rohithkumar@gmail.com");
		
		System.out.println(fullName.getAttribute("value"));
		
		WebElement buttonSubmit = driver.findElement(By.id("submit"));
		js.executeScript("arguments[0].click();", buttonSubmit);
		
		driver.quit();
	}

}
