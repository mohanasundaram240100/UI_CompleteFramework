package testCase;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import basePage.BasePage;
import pageObjects.HomePage;

public class TC001_BrowserLaunch extends BasePage
{
	private static final Logger logger = LogManager.getLogger(TC001_BrowserLaunch.class);

	TC001_BrowserLaunch(WebDriver driver) 
	{
		super(driver);
		
	}

	
@Test
void Reg()
{
	logger.info("Browser Launch Test Case");
	
	HomePage hp = new HomePage(driver);	
	hp.enterUserName("admin");
	hp.enterPassword("admin123");
	
}


		
		

}


