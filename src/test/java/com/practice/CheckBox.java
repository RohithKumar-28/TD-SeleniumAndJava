package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");

		WebElement elements = driver
				.findElement(By.xpath("//div[@class=\"card-body\"]//child::h5[text()=\"Elements\"]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView(true);", elements);
		js.executeScript("arguments[0].click();", elements);
		WebElement checkBox = driver.findElement(By.xpath("//li[@id=\"item-1\"]//child::span[text()=\"Check Box\"]"));
		js.executeScript("arguments[0].click();", checkBox);

		driver.findElement(By.xpath("//span[@class=\"rc-tree-switcher rc-tree-switcher_close\"]")).click();
		driver.findElement(By.xpath(
				"//span[@aria-label=\"Select Desktop\"]//preceding-sibling::span[@class=\"rc-tree-switcher rc-tree-switcher_close\"]"))
				.click();
		WebElement commands = driver.findElement(By.xpath(
				"//span[@class=\"rc-tree-switcher rc-tree-switcher-noop\"]//following-sibling::span[@aria-label=\"Select Commands\"]"));
		if (commands.isSelected()) {
			System.out.println("Commands Checkbox is Already Selected");
		} else {
			System.out.println("Commands Checkbox is not Selected");
			commands.click();
		}

		driver.findElement(By.xpath(
				"//span[@aria-label=\"Select Documents\"]//preceding-sibling::span[@class=\"rc-tree-switcher rc-tree-switcher_close\"]"))
				.click();
		driver.findElement(By.xpath(
				"//span[@aria-label=\"Select Office\"]//preceding-sibling::span[@class=\"rc-tree-switcher rc-tree-switcher_close\"]"))
				.click();
		WebElement classified = driver.findElement(By.xpath(
				"//span[@class=\"rc-tree-switcher rc-tree-switcher-noop\"]//following-sibling::span[@aria-label=\"Select Classified\"]"));
		if (classified.isDisplayed()) {
			System.out.println("Classified Checkbox is Displayed");
		} else {
			System.out.println("Classified Checkbox is not Displayed");
		}
		classified.click();
		commands.click();

		driver.findElement(By.xpath(
				"//span[@aria-label=\"Select Downloads\"]//preceding-sibling::span[@class=\"rc-tree-switcher rc-tree-switcher_close\"]"))
				.click();
		WebElement excelFile = driver.findElement(By.xpath(
				"//span[@class=\"rc-tree-switcher rc-tree-switcher-noop\"]//following-sibling::span[@aria-label=\"Select Excel File.doc\"]"));
		if (excelFile.isEnabled()) {
			System.out.println("Excel File Checkbox is Enabled");
		} else {
			System.out.println("Excel File Checkbox is not Enabled");
		}
		excelFile.click();
		driver.findElement(By.xpath(
				"//span[@class=\"rc-tree-switcher rc-tree-switcher-noop\"]//following-sibling::span[@aria-label=\"Select Notes\"]")).click();
		
		driver.quit();
		

	}
}
