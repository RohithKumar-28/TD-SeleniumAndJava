package com.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTip {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/tooltip.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement downloadBtn = driver.findElement(By.id("download_now"));
		Actions action = new Actions(driver);
		action.moveToElement(downloadBtn).perform();

		WebElement tooltip = driver.findElement(By.xpath("//*[@class=\"tooltip\"]"));
		System.out.println(tooltip.getText());

		driver.quit();

	}
}
