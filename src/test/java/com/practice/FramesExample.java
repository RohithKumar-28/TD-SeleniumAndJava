package com.practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/frames.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement header1 = driver.findElement(By.xpath("//h2[text()=\"Iframe 1\"]"));
		System.out.println(header1.getText());

		driver.switchTo().frame(0);
		WebElement iframe1 = driver
				.findElement(By.xpath("//*[@class=\"fontawesome-i2svg-active fontawesome-i2svg-complete\"]"));
		System.out.println(iframe1.getText());

		System.out.println("");

		driver.switchTo().defaultContent();
		WebElement header2 = driver.findElement(By.xpath("//h2[text()=\"Iframe 2\"]"));
		System.out.println(header2.getText());

		driver.switchTo().frame(1);
		WebElement iframe2 = driver
				.findElement(By.xpath("//*[@class=\"fontawesome-i2svg-active fontawesome-i2svg-complete\"]"));
		System.out.println(iframe2.getText());

		driver.quit();

	}
}
