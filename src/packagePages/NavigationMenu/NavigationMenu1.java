package packagePages.NavigationMenu;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigationMenu1 {

	static WebDriver driver;

	public NavigationMenu1(WebDriver driver) {
		this.driver = driver;

	}

	// ELEMENTS
	

	private static WebElement webPagesButton() {
		return driver.findElement(By.cssSelector("#nav-tophat > div.row.toprow.web > div > div.wayback-txt > a"));
	}

	private static WebElement wayBackMachineLogo() {
		return driver.findElement(By.cssSelector(
				"#nav-tophat > div.row.toprow.web > div > div.roundbox7.wayback-main > div > div:nth-child(1) > a > img"));
	}

	private static WebElement wayBackMachineSearchBar() {
		return driver.findElement(By.cssSelector("#nav-wb-url"));
	}

	private static WebElement booksToBorrowLogo() {
		return driver.findElement(By.cssSelector(
				"#nav-tophat > div.row.toprow.fivecolumns.texts > div.col-sm-2.col-xs-5.col-sm-pull-2 > div > center > div > a"));
	}

	private static WebElement booksToBorrowText() {
		return driver.findElement(By.cssSelector(
				"#nav-tophat > div.row.toprow.fivecolumns.texts > div.col-sm-2.col-xs-5.col-sm-pull-2 > div > center > a"));
	}

	private static WebElement openLibraryLogo() {
		return driver.findElement(By.cssSelector(
				"#nav-tophat > div.row.toprow.fivecolumns.texts > div.col-sm-2.col-xs-5.col-sm-pull-4 > div > center > div > a"));
	}

	private static WebElement openLibraryText() {
		return driver.findElement(By.cssSelector(
				"#nav-tophat > div.row.toprow.fivecolumns.texts > div.col-sm-2.col-xs-5.col-sm-pull-4 > div > center > a"));
	}

	private static List<WebElement> textFeaturedElements() {
		return driver.findElements(
				By.cssSelector("div.row.toprow.fivecolumns.texts div.col-sm-2.col-xs-7.col-sm-push-4 div.linx a"));
	}

	private static List<WebElement> textTopElements() {
		return driver.findElements(
				By.cssSelector("div.row.toprow.fivecolumns.texts div.col-sm-2.col-xs-7.col-sm-push-2 div.linx a"));
	}

	private static List<WebElement> textOthersElements() {
		return driver.findElements(By.cssSelector("div.row.toprow.fivecolumns.texts div.linx.linx-topped a"));
	}

	private static WebElement newsLogo() {
		return driver.findElement(By.cssSelector(
				"#nav-tophat > div.row.toprow.fivecolumns.movies > div.col-sm-2.col-xs-5.col-sm-pull-2 > div > center > div > a"));
	}

	private static WebElement newsText() {
		return driver.findElement(By.cssSelector(
				"#nav-tophat > div.row.toprow.fivecolumns.movies > div.col-sm-2.col-xs-5.col-sm-pull-2 > div > center > a"));
	}

	private static WebElement understandingLogo() {
		return driver.findElement(By.cssSelector(
				"#nav-tophat > div.row.toprow.fivecolumns.movies > div.col-sm-2.col-xs-5.col-sm-pull-4 > div > center > div > a"));
	}

	private static WebElement understandingText() {
		return driver.findElement(By.cssSelector(
				"#nav-tophat > div.row.toprow.fivecolumns.movies > div.col-sm-2.col-xs-5.col-sm-pull-4 > div > center > a"));
	}

	private static List<WebElement> videoFeaturedElements() {
		return driver.findElements(
				By.cssSelector("div.row.toprow.fivecolumns.movies div.col-sm-2.col-xs-7.col-sm-push-4 a"));
	} //

	private static List<WebElement> videoTopElements() {
		return driver.findElements(
				By.cssSelector("div.row.toprow.fivecolumns.movies div.col-sm-2.col-xs-7.col-sm-push-2 a"));
	}

	private static List<WebElement> videoOthersElements() {
		return driver.findElements(
				By.cssSelector("div.row.toprow.fivecolumns.movies div.col-sm-2.col-xs-7 div.linx.linx-topped a"));
	}

	private static WebElement liveMusicArchiveVideoLogo() {
		return driver.findElement(By.cssSelector(
				"#nav-tophat > div.row.toprow.fivecolumns.audio > div.col-sm-2.col-xs-5.col-sm-pull-2 > div > center > div > a"));
	}

	private static WebElement liveMusicArchiveText() {
		return driver.findElement(By.cssSelector(
				"#nav-tophat > div.row.toprow.fivecolumns.audio > div.col-sm-2.col-xs-5.col-sm-pull-2 > div > center > div > a"));
	}

	private static WebElement librivoxLogo() {
		return driver.findElement(By.cssSelector(
				"#nav-tophat > div.row.toprow.fivecolumns.audio > div.col-sm-2.col-xs-5.col-sm-pull-4 > div > center > div > a"));
	}

	private static WebElement librivoxText() {
		return driver.findElement(By.cssSelector(
				"#nav-tophat > div.row.toprow.fivecolumns.audio > div.col-sm-2.col-xs-5.col-sm-pull-4 > div > center > a"));
	}

	private static List<WebElement> audioFeaturedElements() {
		return driver
				.findElements(By.cssSelector("div.row.toprow.fivecolumns.audio div.col-sm-2.col-xs-7.col-sm-push-4 a"));
	}

	private static List<WebElement> audioTopElements() {
		return driver.findElements(
				By.cssSelector("div.row.toprow.fivecolumns.audio div.col-sm-2.col-xs-7.col-sm-push-2 a\""));
	} //

	private static List<WebElement> audioOthersElements() {
		return driver.findElements(
				By.cssSelector("div.row.toprow.fivecolumns.audio div.col-sm-2.col-xs-7 div.linx.linx-topped a"));
	}

	private static WebElement internetArcadeLogo() {
		return driver.findElement(By.cssSelector(
				"#nav-tophat > div.row.toprow.fivecolumns.software > div.col-sm-2.col-xs-5.col-sm-pull-2 > div > center > div > a"));
	}

	private static WebElement internetArcadeText() {
		return driver.findElement(By.cssSelector(
				"#nav-tophat > div.row.toprow.fivecolumns.software > div.col-sm-2.col-xs-5.col-sm-pull-2 > div > center > a"));
	}

	private static WebElement consoleLivingRoomLogo() {
		return driver.findElement(By.cssSelector(
				"#nav-tophat > div.row.toprow.fivecolumns.software > div.col-sm-2.col-xs-5.col-sm-pull-4 > div > center > div > a"));
	}

	private static WebElement consoleLivingRoomText() {
		return driver.findElement(By.cssSelector(
				"#nav-tophat > div.row.toprow.fivecolumns.software > div.col-sm-2.col-xs-5.col-sm-pull-4 > div > center > a"));
	}

	private static List<WebElement> softwareFeaturedElements() {
		return driver.findElements(
				By.cssSelector("div.row.toprow.fivecolumns.software div.col-sm-2.col-xs-7.col-sm-push-4 a"));
	}

	private static List<WebElement> softwareTopElements() {
		return driver.findElements(
				By.cssSelector("div.row.toprow.fivecolumns.software div.col-sm-2.col-xs-7.col-sm-push-2 a"));
	}

	private static List<WebElement> softwareOthersElements() {
		return driver.findElements(
				By.cssSelector("div.row.toprow.fivecolumns.software div.col-sm-2.col-xs-7 div.linx.linx-topped a"));
	}

	private static WebElement metropolitanMuseumLogo() {
		return driver.findElement(By.cssSelector(
				"#nav-tophat > div.row.toprow.fivecolumns.image > div.col-sm-2.col-xs-5.col-sm-pull-2 > div > center > div > a"));
	}

	private static WebElement metropolitanMuseumText() {
		return driver.findElement(By.cssSelector(
				"#nav-tophat > div.row.toprow.fivecolumns.image > div.col-sm-2.col-xs-5.col-sm-pull-2 > div > center > a"));
	}

	private static WebElement brooklynMuseumLogo() {
		return driver.findElement(By.cssSelector(
				"#nav-tophat > div.row.toprow.fivecolumns.image > div.col-sm-2.col-xs-5.col-sm-pull-4 > div > center > div > a"));
	}

	private static WebElement brooklynMuseumText() {
		return driver.findElement(By.cssSelector(
				"#nav-tophat > div.row.toprow.fivecolumns.image > div.col-sm-2.col-xs-5.col-sm-pull-4 > div > center > div > a"));
	}

	private static List<WebElement> imageFeaturedElements() {
		return driver
				.findElements(By.cssSelector("div.row.toprow.fivecolumns.image div.col-sm-2.col-xs-7.col-sm-push-4 a"));
	}

	private static List<WebElement> imageTopElements() {
		return driver
				.findElements(By.cssSelector("div.row.toprow.fivecolumns.image div.col-sm-2.col-xs-7.col-sm-push-2 a"));
	}

	// ACTIONS
	

	public void clickOnWayBackMachineLogo() {
		wayBackMachineLogo().click();
	}

	public void sendTextToWayBackMachineSearch(String searchTerm) {
		wayBackMachineSearchBar().sendKeys(searchTerm);
	}

	public void SendEnterToWayBackMachineSearch() {
		wayBackMachineSearchBar().sendKeys(Keys.ENTER);
	}

	public void clickOnWebPagesButton() {
		webPagesButton().click();

	}

	public void clickOnBooksToBorrowLogo() {
		booksToBorrowLogo().click();
	}

	public void clickOnBooksToBorrowText() {
		booksToBorrowText().click();
	}

	public void clickOnOpenLibraryLogo() {
		openLibraryLogo().click();
	}

	public void clickOnOpenLibraryText() {
		openLibraryText().click();
	}

	public void clickOnTextFeaturedElements(Integer index) {
		textFeaturedElements().get(index).click();
	} 

}
