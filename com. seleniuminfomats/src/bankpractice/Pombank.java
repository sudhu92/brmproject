package bankpractice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class Pombank {
	@FindBy(name = "uid")
	public static WebElement userid;
	@FindBy(name="password")
	public static WebElement pass;
	@FindBy(name="btnLogin")
	public static WebElement login;
	@FindBy(xpath = "//a[text()='New Customer']")
	public static WebElement NewCustomer;
	@FindBy(name="name")
	public static WebElement value;
	@FindBy(xpath="//table[@class='layout']//tbody/tr[5]/td[2]/input[2]")
	public static WebElement radio;
	@FindBy(xpath= "//input[@id='dob']")
	public static WebElement date;
	
	

}
