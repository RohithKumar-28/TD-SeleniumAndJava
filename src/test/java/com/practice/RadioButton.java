package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");

		WebElement elements = driver
				.findElement(By.xpath("//div[@class=\"card-body\"]//child::h5[text()=\"Elements\"]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView(true);", elements);
		js.executeScript("arguments[0].click();", elements);
		WebElement radioButton = driver.findElement(By.xpath("//li[@id=\"item-2\"]//child::span[text()=\"Radio Button\"]"));
		js.executeScript("arguments[0].click();", radioButton);
		
		WebElement noRadio = driver.findElement(By.id("noRadio"));
		if (noRadio.isEnabled()) {
			System.out.println("No RadioButton is Enabled");
		} else {
			System.out.println("No RadioButton is not Enabled");
		}
		
		if (noRadio.isDisplayed()) {
			System.out.println("No RadioButton is Displayed");
		} else {
			System.out.println("No RadioButton is not Displayed");
		}
		
		WebElement yesRadio = driver.findElement(By.id("yesRadio"));
		if (yesRadio.isSelected()) {
			System.out.println("Yes RadioButton is Selected");
		} else {
			System.out.println("Yes RadioButton is not Selected");
		}
		yesRadio.click();
		
		WebElement impressiveRadio = driver.findElement(By.id("impressiveRadio"));
		boolean yesSelected = yesRadio.isSelected();
		boolean impressiveNotSelected = impressiveRadio.isSelected();
		System.out.println("Yes RadioButton is currently Selected : " + yesSelected + " & Impressive RadioButton is currently Selected : " + impressiveNotSelected);
		
		impressiveRadio.click();
		boolean yesNotSelected = yesRadio.isSelected();
		boolean impressiveSelected = impressiveRadio.isSelected();
		System.out.println("Yes RadioButton is currently Selected : " + yesNotSelected + " & Impressive RadioButton is currently Selected : " + impressiveSelected);
		
		driver.quit();
		
		
		
	}

}
