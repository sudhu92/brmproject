package com.seleniuminfomatsexample;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class calender {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sudha\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement date =driver.findElement(By.xpath("//*[@id='datepicker']"));
		date.click();
		WebDriverWait  waitt = new WebDriverWait(driver,Duration.ofSeconds(10));
		waitt.until(ExpectedConditions.visibilityOf(date));
		String calenderbutton = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		
		while(!calenderbutton.equalsIgnoreCase("january 2022")) {
			driver.findElement(By.xpath("//span[text()='Prev']")).click();	
			calenderbutton = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
//			Thread.sleep(3000);
		}
		WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement pastdate=w.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='13']")));
		pastdate.click();
				
			 
		
		}
				
				
				
				
				
				
				
	}
	
	

