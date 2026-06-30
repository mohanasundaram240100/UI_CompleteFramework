package basePage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class basePage1 {
	
	protected WebDriver driver;
	
	protected basePage1(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@BeforeMethod
	@BeforeClass
	void setUp()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.apple.com");
		
	}
	
	@AfterMethod
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}

}
