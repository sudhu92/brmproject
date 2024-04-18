package com.seleniuminfomatsexample;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocomplete {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sudha\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("g");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		List<WebElement> optionlist= driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		for (WebElement list : optionlist) {
			String text= 	list.getText();
			System.out.println(text);
			if(text.contains("google translate")) {
				Thread.sleep(3000);
				list.click();
				break;


			}


		}
	}

}
