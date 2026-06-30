package testCase;

import org.openqa.selenium.WebDriver;

import basePage.basePage1;
import pageObjects.DashBoardPage;

public class dummyClass extends basePage1 {

	dummyClass(WebDriver driver) {
		super(driver);
		
	}

	void testMethod() {
		DashBoardPage dbp = new DashBoardPage(driver);
		dbp.setUsername();
		dbp.setPassword();
	}
	

}
