package packageTests;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import packagePages.BaseClass;
import packagePages.PageURLs;
import packagePages.ArchivePages.AdvancedSearchPages;
import packagePages.ArchivePages.LoginPage;
import packagePages.ArchivePages.MainPage;
import packagePages.ArchivePages.UploadPage;
import packagePages.NavigationMenu.NavigationMenu1;
import packagePages.NavigationMenu.NavigationMenu2;

public class NavigationMenuPageTests {

	private static final String YEAR = "2015";
	private static final String MONTH = "09";
	private static final String DAY = "09";

	WebDriver driver;
	NavigationMenu1 nm1;
	NavigationMenu2 nm2;
	AdvancedSearchPages as;
	MainPage mp;
	LoginPage lp;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mare\\Desktop\\Selenium\\geckodriver.exe");

		driver = new FirefoxDriver();
	}

	@Test(priority = 2)
	public void navigationMenuTest() {

		driver.navigate().to(PageURLs.MAIN_PAGE);
		nm1 = new NavigationMenu1(driver);
		nm2 = new NavigationMenu2(driver);
		mp = new MainPage(driver);

		nm2.clickOnTextIcon();

		nm1.clickOnTextFeaturedElements(0);

		String firstUrl = driver.getCurrentUrl();

		driver.navigate().to(PageURLs.MAIN_PAGE);

		new MainPage(driver).clickOnTextIcon();

		String secondUrl = driver.getCurrentUrl();

		Assert.assertEquals(firstUrl, secondUrl);

	}

	@Test(priority = 4)
	public void uploadTest() throws Exception {

		driver.navigate().to(PageURLs.MAIN_PAGE);

		new UploadPage(driver).clickOnUploadButton();

		Assert.assertTrue("Log in or Sign up".contains(new UploadPage(driver).loginOrSignUpGetText()));

	}

	@Test(priority = 6)
	public void forgotPasswordTest() throws Exception {

		nm2 = new NavigationMenu2(driver);
		lp = new LoginPage(driver);

		new BaseClass(driver).implicitWait();

		driver.navigate().to(PageURLs.MAIN_PAGE);

		nm2.clickOnSignInButton();

		Assert.assertTrue(new LoginPage(driver).getErrorMessage().isDisplayed());

		lp.clickOnSignUp();

		lp.clickOnTermOfConditions();

		lp.switchToNextWindow();
		
		Thread.sleep(3000);
		
		lp.switchToNextWindow();

		Assert.assertTrue(driver.getCurrentUrl().contains("terms"));

	}

	@Test(priority = 8)
	public void navBarSearchTest() throws Exception {

		driver.navigate().to("https://archive.org/details/movies");

		as = new AdvancedSearchPages(driver);
		nm2 = new NavigationMenu2(driver);

		nm2.clickOnSearchBar();
		Assert.assertTrue(nm2.getAdvancedSearchLink().isDisplayed());
		nm2.clickOnadvancedSearchLink();
		Assert.assertTrue(driver.getCurrentUrl().contains("advancedsearch"));
		as.setYaer(YEAR);
		as.setMonth(MONTH);
		as.setDay(DAY);
		as.clickOnSearchButton1();
		Assert.assertTrue(driver.getCurrentUrl().contains("?query=date%3A2015-09-09"));

	}
}