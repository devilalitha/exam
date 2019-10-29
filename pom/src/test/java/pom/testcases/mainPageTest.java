package pom.testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;


import pom.baseClass;
import pom.locators.mainPage;

public class mainPageTest extends baseClass {
	
}
	@BeforeMethod
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "  ");
		driver = new ChromeDriver();
		driver.get(OR.);
		
		

}
