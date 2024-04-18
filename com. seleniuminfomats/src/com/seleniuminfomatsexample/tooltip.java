package com.seleniuminfomatsexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class tooltip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sudha\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/tool-tips");
		driver.manage().window().maximize();
		WebElement ttip= driver.findElement(By.id("toolTipButton"));
		Actions act= new Actions(driver);
		act.moveToElement(ttip).build().perform();
		Thread.sleep(3000);
String hovered = driver.findElement(By.className("tooltip-inner")).getText();
System.out.println(hovered);


	}

}
