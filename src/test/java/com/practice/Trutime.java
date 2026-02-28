package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trutime {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://onecognizant.cognizant.com/Welcome");

		Thread.sleep(30000);

		WebElement oneCognizant = driver
				.findElement(By.className("navbar-brand oneCNavTitleLink text-truncate oneC_brandName"));
		System.out.println(oneCognizant.getText());

		driver.findElement(By.id("oneC_searchLanding")).sendKeys("TruTime", Keys.ENTER);
		Thread.sleep(1500);
		driver.findElement(By.xpath("//button[text()=\"Launch Now\"]")).click();

		WebElement appFrame = driver.findElement(By.id("appFrame"));
		driver.switchTo().frame("appFrame");

		Thread.sleep(3000);

		String monthAvg = driver.findElement(By.id("A2")).getText();
		String yearAvg = driver.findElement(By.id("A3")).getText();
		System.out.println("Month Avg. - " + monthAvg);
		System.out.println("Year Avg. - " + yearAvg);

		Thread.sleep(3000);

		driver.quit();

	}

}
