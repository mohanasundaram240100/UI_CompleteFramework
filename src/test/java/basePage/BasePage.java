package basePage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BasePage {
	
	public WebDriver driver;
	
	
	//Constructor
	public BasePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@BeforeClass
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.apple.com");
		
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}
