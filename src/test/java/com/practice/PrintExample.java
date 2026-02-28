package com.practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintExample {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement userName = driver.findElement(By.id("userName"));
		userName.sendKeys("RohithKumar");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Rohith@1234");
		
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		
		Set<Cookie> cookies = driver.manage().getCookies();
		for (Cookie cookie : cookies) {
			System.out.println("Name   : " + cookie.getName());
            System.out.println("Value  : " + cookie.getValue());
            System.out.println("Domain : " + cookie.getDomain());
            System.out.println("Path   : " + cookie.getPath());
            System.out.println(" ");
			
		}

		driver.quit();

	}
}
