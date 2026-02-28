package com.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BrowserStack_2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement freeTrialBtn = driver.findElement(By.xpath("//*[text()=\"Free Trial\"]"));
		Actions actions = new Actions(driver);
		actions.doubleClick(freeTrialBtn).perform();
		
		WebElement header = driver.findElement(By.xpath("//h1[contains(text(),'Create a FREE Account')]"));
		System.out.println(header.getText());
		
		driver.quit();
		
	}

}
