package com.seleniuminfomatsexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {
	public void practice () {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sudha\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.get
	("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fcss%2Fhomepage.html%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	driver.manage().window().maximize();
	WebElement emailfeild =driver.findElement(By.xpath("//input[@name='email']"));
	emailfeild.sendKeys("sudharahan@gmail.com");
	WebElement continuebutton = driver.findElement(By.id("continue"));
	continuebutton.click();
	WebElement passwordfield = driver.findElement(By.id("ap_password"));
	 passwordfield.sendKeys("Sudharshan@92");
	 WebElement signinbutton = driver.findElement(By.id("signInSubmit"));
	 signinbutton.click();
	 
	 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		amazon sp = new amazon();
		sp.practice();

	}

}
