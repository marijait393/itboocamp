package packagePages.ArchivePages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class HelpPage {

	static WebDriver driver;

	public HelpPage(WebDriver driver) {
		this.driver = driver;

	}

	Actions builder = new Actions(driver);

	// ELEMENTS
	

	private static List<WebElement> buttonsFields() {
		return driver.findElements(By.className("blocks-item"));
	}

	private static WebElement searchField() {
		return driver.findElement(By.cssSelector("#query"));
	}

	private static WebElement signIn() {
		return driver.findElement(By.cssSelector("a.login"));
	}
	
	
	// ACTIONS
	

	public void clickOn4Buttons() {
		for (int i = 0; i < 3; i++) {
			buttonsFields().get(i).click();
		}
	}

	public void sendKeysSearchField(String SearchTerm) {
		searchField().sendKeys(SearchTerm);

		Actions action = new Actions(driver);

		action.keyDown(Keys.ENTER).perform();
	}

	public void clickOnSignIn() {
		signIn().click();
	}

}
