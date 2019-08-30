package packagePages.ArchivePages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewAboutPage {

	static WebDriver driver;

	public NewAboutPage(WebDriver driver) {
		this.driver = driver;

	}

	// ELEMENTS

	
	private static List<WebElement> contributorsElements() {
		return driver.findElements(By.cssSelector("div.about-box div.items_list.person"));
	}

	private static List<WebElement> grafs() {
		return driver.findElements(By.cssSelector("div.col-sm-5 div.grafs.about-box"));
	}

	private static List<WebElement> relatedCollectionsElements() {
		return driver.findElements(By.cssSelector(
				"#tabby-about > div > div.col-sm-5 > div:nth-child(7) > div:nth-child(2), #tabby-about > div > div.col-sm-5 > div:nth-child(7) > div:nth-child(3)"));
	}

	private static WebElement topRegionsElements() {
		return driver.findElement(By.cssSelector("div.col-sm-5 > section"));
	}

}