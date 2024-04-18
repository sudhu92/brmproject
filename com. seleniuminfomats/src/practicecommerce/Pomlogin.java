package practicecommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pomlogin {
	@FindBy(xpath="//input[@id='Email']")
	public static WebElement Email;
@FindBy(xpath = "//input[@id='Password']")
public static WebElement  Paasword;
@FindBy(xpath ="//button[text()='Log in']")
public static WebElement login;
}
