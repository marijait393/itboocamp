package packagePages.ArchivePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactPage {

	static WebDriver driver;

	public ContactPage(WebDriver driver) {
		this.driver = driver;

	}

	// ELEMENTS
	
	
	private static WebElement map1() {
		return driver.findElement(By.cssSelector(
				"body.navia:nth-child(2) div.container.container-ia:nth-child(1) div.row:nth-child(1) div.col-md-9:nth-child(2) a:nth-child(5) > img:nth-child(1)"));
	}

	private static WebElement map2() {
		return driver.findElement(By.cssSelector(
				"body.navia:nth-child(2) div.container.container-ia:nth-child(1) div.row:nth-child(1) div.col-md-9:nth-child(2) font:nth-child(2) font:nth-child(23) font:nth-child(17) a:nth-child(7) > img:nth-child(1)"));
	}
	
	
	// ACTIONS

	public void clickOnMap1() {
		map1().click();
	}

}