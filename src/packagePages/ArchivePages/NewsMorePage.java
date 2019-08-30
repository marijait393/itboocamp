package packagePages.ArchivePages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewsMorePage {

	static WebDriver driver;

	public NewsMorePage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	// ELEMENTS

	
	private static List<WebElement> newsElements() {
		return driver.findElements(By.cssSelector("#maincontect div > table tr:not(.backColor1)"));
	}

	private static WebElement emailIcon() {

		return driver.findElement(By.cssSelector("a > span.iconochive-email"));
	}

}
