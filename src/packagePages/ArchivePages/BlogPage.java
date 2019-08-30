package packagePages.ArchivePages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BlogPage {

	static WebDriver driver;

	public BlogPage(WebDriver driver) {
		this.driver = driver;

	}

	// ELEMENTS
	
	private static WebElement facebookIcon() {
		return driver.findElement(By.cssSelector(
				"body.home.blog:nth-child(2) div.hfeed:nth-child(1) div.widget-area:nth-child(2) ul.xoxo li.widget-container.widget_archive_sharing_widget:nth-child(1) div.archive-sharing-widget a.shareitem:nth-child(1) > img:nth-child(1)"));

	}

	private static WebElement twitterIcon() {
		return driver.findElement(By.cssSelector(
				"body.home.blog:nth-child(2) div.hfeed:nth-child(1) div.widget-area:nth-child(2) ul.xoxo li.widget-container.widget_archive_sharing_widget:nth-child(1) div.archive-sharing-widget a.shareitem:nth-child(2) > img:nth-child(1)"));

	}

	private static WebElement searchFieldBlog() {
		return driver.findElement(By.cssSelector("#s"));
	}

	private static WebElement searchButtonBlog() {
		return driver.findElement(By.cssSelector("#searchsubmit"));
	}

	private static List<WebElement> navMenu() {
		return driver.findElements(By.cssSelector("#menu-menu li"));
	}

	private static WebElement archiveMonth() {
		return driver.findElement(By.cssSelector("#archives-dropdown-2 option"));
	}

	private static List<WebElement> searchElements() {
		return driver.findElements(By.cssSelector("div#content div.post.type-post.status-publish.format-standard"));
	}
	

	// ACTIONS
	

	public void clickOnFacebook() {
		facebookIcon().click();
	}

	public void clickOnTwitter() {
		twitterIcon().click();
	}

	public void sendKeysSearchBar(String SearchTerm) {
		searchFieldBlog().click();
	}

	public void clickOnSearchButton() {
		searchButtonBlog().click();
	}

	public void archivesDropdown(int i) {
		Select x = new Select(archiveMonth());
		x.selectByIndex(i);
	}

  

}