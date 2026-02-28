package com.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyAndPaste {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/register.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		Actions actions = new Actions(driver);

		WebElement firstName = driver.findElement(By.id("firstname"));
		firstName.sendKeys("Selenium");

		WebElement lastName = driver.findElement(By.id("lastname"));
		lastName.sendKeys("Test123456");

		actions.doubleClick(firstName).perform();
		actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();

		WebElement userName = driver.findElement(By.id("username"));
		userName.click();
		actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();

		actions.doubleClick(lastName).perform();
		actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();

		WebElement passWord = driver.findElement(By.id("password"));
		passWord.click();
		actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();

		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();

		driver.navigate().refresh();

		Thread.sleep(3000);

		WebElement firstName2 = driver.findElement(By.id("firstname"));
		WebElement lastName2 = driver.findElement(By.id("lastname"));
		WebElement userName2 = driver.findElement(By.id("username"));
		WebElement passWord2 = driver.findElement(By.id("password"));

		if (firstName2.getAttribute("value").isEmpty() && lastName2.getAttribute("value").isEmpty()
				&& userName2.getAttribute("value").isEmpty() && passWord2.getAttribute("value").isEmpty()) {
			System.out.println("All the fields are Empty");
		} else {
			System.out.println("All the fields are Filled");
		}

		driver.quit();

	}
}
