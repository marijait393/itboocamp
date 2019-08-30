package packageTests;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import packagePages.ArchivePages.PeoplePage;

public class PeoplePageTest {
	
WebDriver driver;
	

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mare\\Desktop\\Selenium\\geckodriver.exe");

		driver = new FirefoxDriver();
	}

//	@Test(priority = 7)
	//public void () throws Exception{
	
	
}
