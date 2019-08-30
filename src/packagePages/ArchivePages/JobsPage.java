package packagePages.ArchivePages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JobsPage {

	static WebDriver driver;

	public JobsPage(WebDriver driver) {
		this.driver = driver;

	}

	// ELEMENTS
	

	private static WebElement jobsSearchBar() {
		return driver.findElement(By.name("q"));

	}

	private static WebElement jobsSearchButton() {
		return driver.findElement(By.cssSelector("a#btn_search_jobs"));
	}

	private static WebElement linkAdvanced() {
		return driver.findElement(By.cssSelector("a#link_show_advanced_search"));
	}

	private static List<WebElement> generatedList() {
		driver.switchTo().frame("resumator-job-frame");
		return driver.findElements(By.cssSelector("table#jobs_table tr:not(:nth-child(1))"));
	}

	
	// ACTIONS
	

	public void generatedListNumberOfElements() {
		generatedList().size();
	}

	public void sendKeysSearchBar(String SearchTerm) {
		jobsSearchBar().sendKeys(SearchTerm);
	}

	public void clickOnSearchButton() {
		jobsSearchButton().click();
	}
}