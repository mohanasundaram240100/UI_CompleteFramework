package testCase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import basePage.BasePage;
import pageObjects.HomePage;

public class TC001_BrowserLaunch extends BasePage
{

	TC001_BrowserLaunch(WebDriver driver) 
	{
		super(driver);
		
	}

	
@Test
void Reg()
{
	HomePage hp = new HomePage(driver);	
	hp.enterUserName("admin");
	hp.enterPassword("admin123");
	
}


		
		

}


