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
import packagePages.ArchivePages.UploadPage;
import packagePages.NavigationMenu.NavigationMenu1;
import packagePages.NavigationMenu.NavigationMenu2;

public class NavigationMenuPageTests {
	
	
	private static final String EMAIL = "foo@gmail.com";
	private static final String PASSWORD = "bar";

	WebDriver driver;
	NavigationMenu1 nm1;
	NavigationMenu2 nm2;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mare\\Desktop\\Selenium\\geckodriver.exe");

		driver = new FirefoxDriver();
	}

	@Test //(priority = 2)
	public void navigationMenuTest() {

		driver.navigate().to(PageURLs.MAIN_PAGE);
		nm1 = new NavigationMenu1(driver);
		nm2 = new NavigationMenu2(driver);

		new NavigationMenu2(driver).clickOnTextIcon();

		new NavigationMenu1(driver).clickOnTextFeaturedElements(0);

		String firstUrl = driver.getCurrentUrl();

		driver.navigate().to(PageURLs.MAIN_PAGE);

		new MainPage(driver).clickOnTextIcon();

		String secondUrl = driver.getCurrentUrl();

		Assert.assertEquals(firstUrl, secondUrl);

	}
	@Test //(priority = 4)
	public void uploadTest() throws Exception{

		driver.navigate().to(PageURLs.MAIN_PAGE);

		new UploadPage(driver).clickOnUploadButton();		
		
		Assert.assertTrue("Log in or Sign up".contains(new UploadPage(driver).loginOrSignUpGetText()));

	}
	
	@Test //(priority = 6)
	public void forgotPasswordTest() throws Exception {

		new BaseClass(driver).implicitWait();

		
		driver.navigate().to(PageURLs.MAIN_PAGE);

		new NavigationMenu2(driver).clickOnSignInButton();
		
		//if (new LoginPage(driver).getForgotPassword().isDisplayed()) {
		//	System.out.println("Element is Visible");
		//} else {
		//	System.out.println("Element is InVisible");
	//	}
	
		Assert.assertTrue(new LoginPage(driver).getErrorMessage().isDisplayed());
		
		new LoginPage(driver).clickOnSignUp();
		
		new LoginPage(driver).clickOnTermOfConditions();
				
		Thread.sleep(3000);
		
		new LoginPage(driver).switchToNextWindow();
		
		Thread.sleep(3000);
		
		new LoginPage(driver).switchToNextWindow();
		
		System.out.println(driver.getCurrentUrl());
				
		Assert.assertTrue(driver.getCurrentUrl().contains("terms"));
		
	}

}

