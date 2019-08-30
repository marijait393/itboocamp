package packagePages.ArchivePages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UploadPage {

	static WebDriver driver;

	public UploadPage(WebDriver driver) {
		this.driver = driver;

	}

	// ELEMENTS
	

	private static WebElement uploadButton() {
		return driver.findElement(By.cssSelector(
				"body.navia.top.ia-module.bgEEE.tiles:nth-child(2) div.hatted:nth-child(1) div:nth-child(1) div.navbar.navbar-inverse.navbar-static-top ul.nav.navbar-nav.navbar-main:nth-child(2) li.dropdown.dropdown-ia.pull-right:nth-child(9) > a.nav-upload"));
	}

	private static WebElement questionMark() {
		return driver.findElement(By.cssSelector("#createhelp > h3 > small > a"));
	}

	private static WebElement blueButton() {
		return driver.findElement(By.cssSelector("#createhelp > center:nth-child(7) > a"));
	}

	private static WebElement loginOrSignUp() {
		return driver.findElement(By.cssSelector(
				"body.navia:nth-child(2) div:nth-child(2) main:nth-child(2) div.container.container-ia p:nth-child(1) > b:nth-child(5)"));
	}

    
	// ACTIONS
	

	public void clickOnUploadButton() {
		uploadButton().click();
	}

	public String loginOrSignUpGetText() {
		return loginOrSignUp().getText();
	}

}
