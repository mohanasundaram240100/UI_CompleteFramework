package basePage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BasePage {
	
	public WebDriver driver;
	public Logger logger;
	
	//Constructor
	public BasePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@BeforeMethod
	@BeforeClass
	public void setUp()
	{
		Logger logger = LogManager.getLogger(this.getClass());
		
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.apple.com");
		
	}
	
	@AfterMethod
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}
