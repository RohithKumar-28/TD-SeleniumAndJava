package com.practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SQLCheatSheet {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.switchTo().frame("globalSqa");
		
		WebElement menu = driver.findElement(By.id("mobile_menu_toggler"));
		menu.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", menu);
        
        WebElement cheatSheets = wait.until(
                ExpectedConditions.presenceOfElementLocated(
                        By.xpath("//a[@href=\"https://www.globalsqa.com/cheatsheets/\"][text()=\"CheatSheets\"]")));
        js.executeScript("arguments[0].click();", cheatSheets);
        
        WebElement sqlCheatSheet = driver.findElement(By.xpath("//a[text()=\"SQL Cheat Sheet\"]"));
        sqlCheatSheet.click();
        
        String parentWindow = driver.getWindowHandle();
		Set<String> allWindows1 = driver.getWindowHandles();
		for (String singleWindow1 : allWindows1) {
			if (!singleWindow1.equals(parentWindow)) {
				driver.switchTo().window(singleWindow1);
			}
		}
		
		WebElement para = driver.findElement(By.xpath("//span[@class=\"has-inline-color has-very-dark-gray-color\"]"));
		System.out.println(para.getText());
        
		driver.switchTo().window(parentWindow);
		
		
		driver.quit();

	}
}
