package packageTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import packagePages.BaseClass;
import packagePages.PageURLs;
import packagePages.ArchivePages.LoginPage;
import packagePages.NavigationMenu.NavigationMenu2;


public class SignIntest {

	private static final String EMAIL = "foo@gmail.com";
	private static final String PASSWORD = "bar";

	WebDriver driver;
	NavigationMenu2 nm2;
	LoginPage lp;
	BaseClass bc;
	
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mare\\Desktop\\Selenium\\geckodriver.exe");

		driver = new FirefoxDriver();
	}

	@Test (priority = 5)
	public void sigIn() throws Exception {
		
		lp = new LoginPage(driver);
		nm2 = new NavigationMenu2(driver);
		bc = new BaseClass(driver);
		
		driver.navigate().to(PageURLs.MAIN_PAGE);
        nm2.clickOnSignInButton();
        
        Assert.assertTrue(lp.getLoginButton().isDisplayed());
        
        lp.sendKeysEmail(EMAIL);
        lp.SendKeysPassword(PASSWORD);
        lp.clickOnLogin();
        
        bc.elementToAppear(lp.getErrorMessage());
        
        Assert.assertTrue(lp.getErrorMessage().isDisplayed());

  }
}