package packagePages.ArchivePages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewsSubjectsPages {

	static WebDriver driver;

	public NewsSubjectsPages(WebDriver driver) {
		this.driver = driver;
	}
	
	
	// ELEMENTS

	private static List<WebElement> viewPost() {
		return driver.findElements(By.cssSelector("div.box.well.well-sm a"));

	}

}