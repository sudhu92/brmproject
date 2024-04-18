package com.seleniuminfomatsexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fbradiobutton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sudha\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
			driver.navigate().to("https://www.facebook.com/");
			//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
			driver.findElement(By.xpath("//a[text()='Create new account']")).click();
			
			for (int i = 1; i <=3; i++) {
				WebElement gender=driver.findElement(By.xpath("//span[@class='_5k_2 _5dba']["+i+"]/label"));
				String text=gender.getText();
				System.out.println(text);
				if (text.equalsIgnoreCase("female")) {
					Thread.sleep(3000);
					gender.click();
				}
				if (text.equalsIgnoreCase("male")) {
					Thread.sleep(3000);
					gender.click();
				}
			}
			Thread.sleep(3000);
			driver.quit();



		}

	}


