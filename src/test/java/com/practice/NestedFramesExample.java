package com.practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFramesExample {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/nestedframes.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement nestedFrame = driver.findElement(By.xpath("//*[@class=\"col-md-8 col-lg-8 col-xl-8\"]"));
		System.out.println(nestedFrame.getText());
		
		driver.switchTo().frame("frame1");
		WebElement content = driver.findElement(By.xpath("//*[@class=\"fontawesome-i2svg-active fontawesome-i2svg-complete\"]"));
		System.out.println(content.getText());

		driver.quit();

		
	}
}
