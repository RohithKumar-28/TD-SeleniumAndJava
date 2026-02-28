package com.practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/browser-windows.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.xpath("//button[text()=\"New Tab\"]")).click();

		String parentWindow = driver.getWindowHandle();
		Set<String> allWindows1 = driver.getWindowHandles();
		for (String singleWindow1 : allWindows1) {
			if (!singleWindow1.equals(parentWindow)) {
				driver.switchTo().window(singleWindow1);
			}
		}
		WebElement newTab = driver
				.findElement(By.xpath("//h1[@class=\"mb-3 fw-normal border-bottom text-left pb-2 mb-4\"]"));
		System.out.println(newTab.getText());

		driver.switchTo().window(parentWindow);

		driver.findElement(By.xpath("//button[text()=\"New Window\"]")).click();
		Set<String> allWindows2 = driver.getWindowHandles();
		for (String singleWindow2 : allWindows2) {
			if (!singleWindow2.equals(parentWindow)) {
				driver.switchTo().window(singleWindow2);
				driver.manage().window().maximize();
			}
		}
		WebElement newWindow = driver
				.findElement(By.xpath("//h1[@class=\"mb-3 fw-normal border-bottom text-left pb-2 mb-4\"]"));
		System.out.println(newWindow.getText());

		driver.switchTo().window(parentWindow);

		driver.findElement(By.xpath("//button[text()=\"New Window Message\"]")).click();
		Set<String> allWindows3 = driver.getWindowHandles();
		for (String singleWindow3 : allWindows3) {
			if (!singleWindow3.equals(parentWindow)) {
				driver.switchTo().window(singleWindow3);
				driver.manage().window().maximize();
			}
		}

		WebElement newWindowMessage = driver
				.findElement(By.xpath("//div[@class=\"row d-flex justify-content-center logindiv bg-white rounded\"]"));
		System.out.println(newWindowMessage.getText());

		driver.quit();

	}
}
