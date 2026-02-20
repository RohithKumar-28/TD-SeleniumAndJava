package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickButton {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/buttons.php");
		
		WebElement button = driver.findElement(By.xpath("//button[@onclick=\"showDiv()\"]"));
		button.click();
		
		String text = button.getText();
		System.out.println(text);
		
		//Position
		
		Point point = button.getLocation();
		int xValue = point.getX();
		int yValue = point.getY();
		
		System.out.println("X value is " + xValue + " Y value is " + yValue);
		
		
		//size
		
		int height = button.getSize().getHeight();
		int width = button.getSize().getWidth();
		
		System.out.println("Height is " + height + " Width is " + width);
		
		//color
		
		String cssValue = button.getCssValue("background-color");
		System.out.println("CSS Value is " + cssValue);
		
		
		
		
		
		
	}

}
