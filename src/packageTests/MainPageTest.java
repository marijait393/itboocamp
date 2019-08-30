package packageTests;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import packagePages.BaseClass;
import packagePages.PageURLs;
import packagePages.ArchivePages.LoginPage;
import packagePages.ArchivePages.MainPage;


public class MainPageTest {
	
	public static final String SEARCH_TERM = "qa";

	WebDriver driver;
	

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mare\\Desktop\\Selenium\\geckodriver.exe");

		driver = new FirefoxDriver();
	}

	@Test //(priority = 3)
	public void searchFieldTest() throws Exception {

		new BaseClass(driver).implicitWait();
		
		driver.navigate().to(PageURLs.MAIN_PAGE);

		new MainPage(driver).clickOnSearchField();

		if (new MainPage(driver).GetRadioButton(0).isDisplayed()) {
			System.out.println("Element is Visible");
		} else {
			System.out.println("Element is InVisible");
		}

	
		
		new MainPage(driver).sendTextSearchField(SEARCH_TERM);

		new MainPage(driver).clickOnGoButton();

		Thread.sleep(3000);
		
		new LoginPage(driver).switchToNextWindow();
		
		Assert.assertTrue(driver.getCurrentUrl().contains("?query=qa"));
	}
}

	


