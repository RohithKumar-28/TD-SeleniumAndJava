package com.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/check-box.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		WebElement main1 = driver.findElement(By.id("c_bs_1"));
		WebElement main2 = driver.findElement(By.id("c_bs_2"));

		if (main1.isDisplayed() && main2.isDisplayed()) {
			System.out.println("All the CheckBox are displayed");
		} else {
			System.out.println("All the CheckBox are not displayed");
		}

		if (main1.isSelected() && main2.isSelected()) {
			System.out.println("All the CheckBox are Selected");
		} else {
			System.out.println("All the CheckBox are not Selected");
		}

		main1.click();

		if (main1.isSelected()) {
			System.out.println("Main Level 1 CheckBox is Selected");
		} else {
			System.out.println("Main Level 1 CheckBox is Selected");
		}

		main2.click();

		if (main2.isSelected()) {
			System.out.println("Main Level 2 CheckBox is Selected");
		} else {
			System.out.println("Main Level 2 CheckBox is Selected");
		}

		WebElement main1Plus = driver.findElement(By.xpath("//input[@id=\"c_bs_1\"]/preceding-sibling::span"));
		main1Plus.click();

		WebElement main2Plus = driver.findElement(By.xpath("//input[@id=\"c_bs_2\"]/preceding-sibling::span"));
		main2Plus.click();

		WebElement sub1 = driver.findElement(By.id("c_bf_1"));
		WebElement sub2 = driver.findElement(By.id("c_bf_2"));
		WebElement sub3 = driver.findElement(By.id("c_bf_3"));
		WebElement sub4 = driver.findElement(By.id("c_bf_4"));

		if (sub1.isSelected()) {
			System.out.println("Sub Level 1 CheckBox is Selected");
		} else {
			System.out.println("Sub Level 1 CheckBox is Selected");
		}

		if (sub2.isSelected()) {
			System.out.println("Sub Level 2 CheckBox is Selected");
		} else {
			System.out.println("Sub Level 2 CheckBox is Selected");
		}

		if (sub3.isSelected()) {
			System.out.println("Sub Level 3 CheckBox is Selected");
		} else {
			System.out.println("Sub Level 3 CheckBox is Selected");
		}

		if (sub4.isSelected()) {
			System.out.println("Sub Level 4 CheckBox is Selected");
		} else {
			System.out.println("Sub Level 4 CheckBox is Selected");
		}

		WebElement sub1Plus = driver.findElement(By.xpath("//input[@id=\"c_bf_1\"]/preceding-sibling::span"));
		sub1Plus.click();

		WebElement sub2Plus = driver.findElement(By.xpath("//input[@id=\"c_bf_2\"]/preceding-sibling::span"));
		sub2Plus.click();

		Thread.sleep(2000);
		WebElement sub3Plus = driver.findElement(By.xpath("//input[@id=\"c_bf_3\"]/preceding-sibling::span"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", sub3Plus);
		js.executeScript("arguments[0].click();", sub3Plus);

		Thread.sleep(2000);
		WebElement sub4Plus = driver.findElement(By.xpath("//input[@id=\"c_bf_4\"]/preceding-sibling::span"));
		js.executeScript("arguments[0].scrollIntoView(true);", sub4Plus);
		js.executeScript("arguments[0].click();", sub4Plus);

	}
}
