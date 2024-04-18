package com.seleniuminfomatsexample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sudha\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		/*
		 * int size =
		 * driver.findElements(By.xpath("//table[@id='countries']/tbody/tr")).size();
		 * System.out.println(size); List<WebElement> text =
		 * driver.findElements(By.xpath("//table[@id='countries']/tbody/tr/td"));
		 * 
		 * for (WebElement countries : text) { String str = countries.getText();
		 * System.out.println(str); }
		 */
WebElement city = driver.findElement(By.xpath("//strong[text()='Kuwait']"));
            JavascriptExecutor bcc= (JavascriptExecutor) driver;
            bcc.executeScript("arguments[0].scrollIntoView(true);",city);
            driver.findElement(By.xpath("//strong[text()='Kuwait']/preceding::td[1]/input")).click();
            
	
}
	}


