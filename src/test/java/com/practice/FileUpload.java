package com.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUpload {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("uploadfile_0")));
		driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\Users\\kumar\\OneDrive\\Pictures\\pexels-stijn-dijkstra-10643872.jpg");
		
		driver.findElement(By.id("terms")).click();
		
		driver.findElement(By.id("submitbutton")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@id=\"res\"]")));
		WebElement successfulMsg = driver.findElement(By.xpath("//h3[@id=\"res\"]"));
		System.out.println(successfulMsg.getText());
		
		driver.quit();
		
	}
}
