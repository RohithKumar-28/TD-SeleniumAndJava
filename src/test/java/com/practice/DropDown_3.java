package com.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_3 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");

		WebElement stateDdn = driver.findElement(By.id("state"));
		if (stateDdn.isEnabled()) {
			System.out.println("State Dropdown is Enabled");
		} else {
			System.out.println("State Dropdown is not Enabled");
		}

		WebElement cityDdn = driver.findElement(By.id("city"));
		if (cityDdn.isEnabled()) {
			System.out.println("City Dropdown is Enabled");
		} else {
			System.out.println("City Dropdown is not Enabled");
		}

		Select selectState = new Select(stateDdn);
		selectState.selectByIndex(1);
		Thread.sleep(2000);
		selectState.selectByValue("Uttar Pradesh");
		Thread.sleep(2000);
		selectState.selectByVisibleText("Haryana");
		Thread.sleep(2000);
		selectState.selectByContainsVisibleText("Raja");
		Thread.sleep(2000);

		Select selectCity = new Select(cityDdn);
		String text = "Meerut";
		List<WebElement> options = selectCity.getOptions();
		for (WebElement option : options) {
			System.out.println(option.getText());
			if (text.equals(option.getText())) {
				selectCity.selectByVisibleText(text);
			}
		}

		Thread.sleep(2000);
		driver.quit();

	}

}
