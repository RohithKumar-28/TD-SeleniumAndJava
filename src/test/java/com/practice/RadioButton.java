package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/radio-button.php");

		WebElement yes = driver.findElement(By.xpath("//input[@onclick=\"show2();\"]"));
		WebElement impressive = driver.findElement(By.xpath("//input[@onclick=\"show3();\"]"));
		WebElement no = driver.findElement(By.xpath("//input[@value=\"option3\"]"));

		if (yes.isDisplayed() && impressive.isDisplayed() && no.isDisplayed()) {
			System.out.println("All the buttons are displayed");
		} else {
			System.out.println("All the Buttons are not displayed");
		}

		if (yes.isSelected() && impressive.isSelected() && no.isSelected()) {
			System.out.println("All the buttons are selected");
		} else {
			System.out.println("All the buttons are not selected");
		}

		if (!no.isEnabled()) {
			System.out.println("Button is not Enabled");
		} else {
			System.out.println("Button is Enabled");
		}

		Thread.sleep(3000);

		yes.click();

		if (yes.isSelected()) {
			System.out.println("Yes Button is Selected");
		} else {
			System.out.println("Yes Button is Not Selected");
		}

		Thread.sleep(3000);

		impressive.click();

		if (impressive.isSelected()) {
			System.out.println("Impressive Button is Selected");
		} else {
			System.out.println("Impressive Button is not Selected");
		}

		if (impressive.isSelected() && !yes.isSelected()) {
			System.out.println("Impressive Button is Selected and Yes Button is not Selected");
		} else {
			System.out.println("Both the Buttons are Selected");
		}
	}

}
