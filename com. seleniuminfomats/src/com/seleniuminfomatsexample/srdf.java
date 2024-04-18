package com.seleniuminfomatsexample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class srdf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\sudha\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.co.in/");
			driver.manage().window().maximize();
			WebElement search= driver.findElement(By.name("q"));
			search.sendKeys("12 angry men\n");
		
			List<WebElement> findelement = driver.findElements (By.tagName("a"));
		for (WebElement links : findelement) {
			String tlinks=	links.getAttribute("href");
			System.out.println(tlinks);
			
		}
			
	}

}
