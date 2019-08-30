package packageTests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import packagePages.PageURLs;
import packagePages.ArchivePages.LoginPage;
import packagePages.ArchivePages.MainPage;
import packagePages.NavigationMenu.NavigationMenu2;


public class SignIntest {

	private static final String EMAIL = "foo@gmail.com";
	private static final String PASSWORD = "bar";

	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mare\\Desktop\\Selenium\\geckodriver.exe");

		driver = new FirefoxDriver();
	}

	@Test //(priority = 5)
	public void sigIn() throws Exception {
		
		driver.navigate().to(PageURLs.MAIN_PAGE);
        new NavigationMenu2(driver).clickOnSignInButton();
        Assert.assertTrue(new LoginPage(driver).getLoginButton().isDisplayed());
        new LoginPage(driver).sendKeysEmail(EMAIL);
        new LoginPage(driver).SendKeysPassword(PASSWORD);
        new LoginPage(driver).clickOnLogin();
        Assert.assertTrue(new LoginPage(driver).getErrorMessage().isDisplayed());

  }
}