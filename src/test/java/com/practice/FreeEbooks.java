package com.practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FreeEbooks {

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
        
        WebElement freeEbooks = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//a[contains(text(),'Free Ebooks')]//span[@class=\"icon chevron-down\"]")));
        js.executeScript("arguments[0].click();", freeEbooks);
        
        List<WebElement> allEbooks = driver.findElements(By.xpath("//li[@id='menu-item-7128']//ul[@class='sub-menu']//a//span"));
        System.out.println("Size: " + allEbooks.size());
        for (WebElement singleEbook : allEbooks) {
        	System.out.println(singleEbook.getText());
        	
		}
        
        
		
		
      //a[contains(text(),'Free Ebooks')]//span[@class=\"icon chevron-down\"]//parent::a//following-sibling::ul[@class=\"sub-menu\"]//child::li//child::a
		
		
		
		
		
		
		
		
		
		
		
		
		
//		WebElement freeEbooks = driver.findElement(By.xpath("//li[@id='menu-item-7128']/a"));
//		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scrollIntoView(true);", menu);
//        wait.until(ExpectedConditions.elementToBeClickable(freeEbooks));
//        freeEbooks.click();
		
//		driver.quit();

	}
}
