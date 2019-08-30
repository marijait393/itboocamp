package packagePages.ArchivePages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {

	static WebDriver driver;

	public MainPage(WebDriver driver) {
		this.driver = driver;

	}
	
	// ELEMENTS
	
	
	private static List<WebElement> collections() {
		return driver.findElements(By.cssSelector("div:not(micro-label).num-items.topinblock"));
	}

	private static List<WebElement> topCollection() {
		return driver.findElements(By.cssSelector("div.item-ia.collection-ia"));
	}

	private static WebElement searchField() {
		return driver.findElement(By.cssSelector(
				"body.navia.top.ia-module.bgEEE.tiles:nth-child(2) div.container.container-ia div.row.preamble:nth-child(3) div.col-sm-6.hero-center:nth-child(2) div.searchbar.searchbar-home form.form.search-form.js-search-form div.form-group div:nth-child(1) > input.form-control.input-sm.roundbox20.js-search-bar:nth-child(2)"));
	}

	private static WebElement webIcon() {
		return driver.findElement(By.cssSelector(
				"body.navia.top.ia-module.bgEEE.tiles:nth-child(2) div.container.container-ia div.row.preamble:nth-child(3) div.col-sm-6.hero-center:nth-child(2) div.preamble-whoweare:nth-child(1) center.mt-big:nth-child(2) > a:nth-child(1)"));
	}

	private static WebElement textIcon() {
		return driver.findElement(By.cssSelector(
				"body.navia.top.ia-module.bgEEE.tiles:nth-child(2) div.container.container-ia div.row.preamble:nth-child(3) div.col-sm-6.hero-center:nth-child(2) div.preamble-whoweare:nth-child(1) center.mt-big:nth-child(2) > a:nth-child(2)"));
	}

	private static WebElement videoIcon() {
		return driver.findElement(By.cssSelector(
				"body.navia.top.ia-module.bgEEE.tiles:nth-child(2) div.container.container-ia div.row.preamble:nth-child(3) div.col-sm-6.hero-center:nth-child(2) div.preamble-whoweare:nth-child(1) center.mt-big:nth-child(2) > a:nth-child(3)"));
	}

	private static WebElement audioIcon() {
		return driver.findElement(By.cssSelector(
				"body.navia.top.ia-module.bgEEE.tiles:nth-child(2) div.container.container-ia div.row.preamble:nth-child(3) div.col-sm-6.hero-center:nth-child(2) div.preamble-whoweare:nth-child(1) center.mt-big:nth-child(2) > a:nth-child(4)"));
	}

	private static WebElement tvIcon() {
		return driver.findElement(By.cssSelector(
				"body.navia.top.ia-module.bgEEE.tiles:nth-child(2) div.container.container-ia div.row.preamble:nth-child(3) div.col-sm-6.hero-center:nth-child(2) div.preamble-whoweare:nth-child(1) center.mt-big:nth-child(2) > a:nth-child(5)"));
	}

	private static WebElement softwareIcon() {
		return driver.findElement(By.cssSelector(
				"body.navia.top.ia-module.bgEEE.tiles:nth-child(2) div.container.container-ia div.row.preamble:nth-child(3) div.col-sm-6.hero-center:nth-child(2) div.preamble-whoweare:nth-child(1) center.mt-big:nth-child(2) > a:nth-child(6)"));
	}

	private static WebElement imageIcon() {
		return driver.findElement(By.cssSelector(
				"body.navia.top.ia-module.bgEEE.tiles:nth-child(2) div.container.container-ia div.row.preamble:nth-child(3) div.col-sm-6.hero-center:nth-child(2) div.preamble-whoweare:nth-child(1) center.mt-big:nth-child(2) > a:nth-child(7)"));
	}

	private static WebElement contertsIcon() {
		return driver.findElement(By.cssSelector(
				"body.navia.top.ia-module.bgEEE.tiles:nth-child(2) div.container.container-ia div.row.preamble:nth-child(3) div.col-sm-6.hero-center:nth-child(2) div.preamble-whoweare:nth-child(1) center.mt-big:nth-child(2) > a:nth-child(8)"));
	}

	private static WebElement collectionsIcon() {
		return driver.findElement(By.cssSelector(
				"body.navia.top.ia-module.bgEEE.tiles:nth-child(2) div.container.container-ia div.row.preamble:nth-child(3) div.col-sm-6.hero-center:nth-child(2) div.preamble-whoweare:nth-child(1) center.mt-big:nth-child(2) > a:nth-child(9)"));
	}

	private static WebElement goButton() {
		return driver.findElement(By.cssSelector(
				"body.navia.top.ia-module.bgEEE.tiles:nth-child(2) div.container.container-ia div.row.preamble:nth-child(3) div.col-sm-6.hero-center:nth-child(2) div:nth-child(2) div.searchbar.searchbar-home form.form.search-form.js-search-form div.form-group > button.btn.btn-gray.label-primary.input-sm:nth-child(3)"));
	}

	private static WebElement advancedSearch() {
		return driver.findElement(By.cssSelector(
				"body.navia.top.ia-module.bgEEE.tiles:nth-child(2) div.container.container-ia div.row.preamble:nth-child(3) div.col-sm-6.hero-center:nth-child(2) div.searchbar.searchbar-home form.form.search-form.js-search-form div.form-group div.search-options.js-search-options:nth-child(2) > a.search-options__advanced-search-link:nth-child(2)"));
	}

	private static WebElement seeMore() {
		return driver.findElement(By.cssSelector(
				"body.navia.top.ia-module.bgEEE.tiles:nth-child(2) div.container.container-ia div.row.preamble:nth-child(3) div.col-sm-3.hero-right:nth-child(3) div.pull-right:nth-child(4) > a.stealth"));
	}

	private static List<WebElement> radioButtons() {
		return driver.findElements(By.name("sin"));
	}

	
	// ACTIONS
	

	public WebElement GetRadioButton(int i) {
		return radioButtons().get(i);
	}

	public void clickOnGoButton() {
		goButton().click();
	}

	public void clickOnSearchField() {
		searchField().click();
	}

	public void sendTextSearchField(String SearchTerm) {
		searchField().sendKeys(SearchTerm);
	}

	public void clickOnTextIcon() {
		textIcon().click();
	}

	public List<WebElement> getCollections() {
		return collections();
	}

	public int getTopCollectionSize() {
		return topCollection().size();
	}

	public void clickOnTopCollection(int i) {
		topCollection().get(i).click();
	}

	public List<WebElement> getTopCollection() {
		return topCollection();
	}

}