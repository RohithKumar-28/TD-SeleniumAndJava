package com.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BrowserStack_1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement getStartedBtn = driver.findElement(By.id("signupModalProductButton"));
		String btnColor1 = getStartedBtn.getCssValue("background-color");
		System.out.println("Get Started Free Button Color before mouse over action is " + btnColor1);
		
		Actions actions = new Actions(driver);
		actions.moveToElement(getStartedBtn).perform();
		
		String btnColor2 = getStartedBtn.getCssValue("background-color");
		System.out.println("Get Started Free Button Color after mouse over action is " + btnColor2);
		
		WebElement viewPricingBtn = driver.findElement(By.xpath("//a[text()=\" View all integrations\"]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", viewPricingBtn);
		
		actions.click(viewPricingBtn).perform();
		
		WebElement amt = driver.findElement(By.xpath("(//div[contains(@class,'simplification-best-value-plan')]//span[contains(@class,'simplification-card__price-amount')])[1]"));
		System.out.println("The Best Value Dollar Amount is " + amt.getText());
		
		driver.quit();
		
	}

}
