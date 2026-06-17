package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import basePage.BasePage;

public class HomePage
{
	WebDriver driver;
	
	//Constructor
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//Locators
	
	By username=By.xpath("");
	By password=By.xpath("");
	
	//Action Methods
	
	public void enterUserName(String user)
	{
		driver.findElement(username).sendKeys(user);
	}
	
	public void enterPassword(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
}
