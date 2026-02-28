package com.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Actions actions = new Actions(driver);
		WebElement bankSource = driver.findElement(By.id("credit2"));
		WebElement debitAccount = driver.findElement(By.id("bank"));
		actions.dragAndDrop(bankSource, debitAccount).perform();
		
		WebElement salesSource = driver.findElement(By.id("credit1"));
		WebElement creditAccount = driver.findElement(By.id("loan"));
		actions.dragAndDrop(salesSource, creditAccount).perform();
		
		WebElement Source1 = driver.findElement(By.xpath("//*[@id=\"fourth\"]//*[text()=\" 5000\"]"));
		WebElement debitAmount = driver.findElement(By.id("amt7"));
		actions.dragAndDrop(Source1, debitAmount).perform();
		
		WebElement Source2 = driver.findElement(By.xpath("//*[@id=\"fourth\"]//*[text()=\" 5000\"]"));
		WebElement creditAmount = driver.findElement(By.id("amt8"));
		actions.dragAndDrop(Source2, creditAmount).perform();
		
		
		WebElement successMsg = driver.findElement(By.xpath("//*[@class=\"table4_result\"]"));
		System.out.println(successMsg.getText());
		
		driver.quit();
		
		
	}
}
