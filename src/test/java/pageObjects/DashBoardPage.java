package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashBoardPage {
	
	//Constructor
	
	private WebDriver driver;
	
	public DashBoardPage( WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	//Locators
	
	By userName=By.xpath("");
	By passWord=By.xpath("");
	
	//Action Methods
	
	public void setUsername()
	{
		driver.findElement(userName).sendKeys("Admin");
	}
	
	public void setPassword()
	{
		driver.findElement(passWord).sendKeys("Admin@123");
	}

}
