package packagePages.ArchivePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DonatePage {

	static WebDriver driver;

	public DonatePage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	// ELEMENTS

	
	private static WebElement amount5() {
		return driver.findElement(By.cssSelector(
				"body.navia.donatePage:nth-child(2) div.container.container-ia div.donate:nth-child(2) div.row.box-pad-bottom:nth-child(1) div.col-xs-12.col-md-4:nth-child(1) div.donate-form-section div.white-box fieldset:nth-child(4) ul.donation-radio-list.donationlevel li:nth-child(1) label:nth-child(1) > span.hit-area:nth-child(2)"));
	}

	private static WebElement amount10() {
		return driver.findElement(By.cssSelector(
				"body.navia.donatePage:nth-child(2) div.container.container-ia div.donate:nth-child(2) div.row.box-pad-bottom:nth-child(1) div.col-xs-12.col-md-4:nth-child(1) div.donate-form-section div.white-box fieldset:nth-child(4) ul.donation-radio-list.donationlevel li:nth-child(2) label:nth-child(1) > span.hit-area:nth-child(2)"));
	}

	private static WebElement amount25() {
		return driver.findElement(By.cssSelector(
				"body.navia.donatePage:nth-child(2) div.container.container-ia div.donate:nth-child(2) div.row.box-pad-bottom:nth-child(1) div.col-xs-12.col-md-4:nth-child(1) div.donate-form-section div.white-box fieldset:nth-child(4) ul.donation-radio-list.donationlevel li:nth-child(3) label:nth-child(1) > span.hit-area:nth-child(2)"));
	}

	private static WebElement amount50() {
		return driver.findElement(By.cssSelector(
				"body.navia.donatePage:nth-child(2) div.container.container-ia div.donate:nth-child(2) div.row.box-pad-bottom:nth-child(1) div.col-xs-12.col-md-4:nth-child(1) div.donate-form-section div.white-box fieldset:nth-child(4) ul.donation-radio-list.donationlevel li:nth-child(4) label:nth-child(1) > span.hit-area:nth-child(2)"));
	}

	private static WebElement amount100() {
		return driver.findElement(By.cssSelector(
				"body.navia.donatePage:nth-child(2) div.container.container-ia div.donate:nth-child(2) div.row.box-pad-bottom:nth-child(1) div.col-xs-12.col-md-4:nth-child(1) div.donate-form-section div.white-box fieldset:nth-child(4) ul.donation-radio-list.donationlevel li:nth-child(5) label:nth-child(1) > span.hit-area:nth-child(2)"));
	}

	private static WebElement amount500() {
		return driver.findElement(By.cssSelector(
				"body.navia.donatePage:nth-child(2) div.container.container-ia div.donate:nth-child(2) div.row.box-pad-bottom:nth-child(1) div.col-xs-12.col-md-4:nth-child(1) div.donate-form-section div.white-box fieldset:nth-child(4) ul.donation-radio-list.donationlevel li:nth-child(6) label:nth-child(1) > span.hit-area:nth-child(2)"));
	}

	private static WebElement amount1000() {
		return driver.findElement(By.cssSelector(
				"body.navia.donatePage:nth-child(2) div.container.container-ia div.donate:nth-child(2) div.row.box-pad-bottom:nth-child(1) div.col-xs-12.col-md-4:nth-child(1) div.donate-form-section div.white-box fieldset:nth-child(4) ul.donation-radio-list.donationlevel li:nth-child(7) label:nth-child(1) > span.hit-area:nth-child(2)"));
	}

	private static WebElement otherAmount() {
		return driver.findElement(By.cssSelector(
				"body.navia.donatePage:nth-child(2) div.container.container-ia div.donate:nth-child(2) div.row.box-pad-bottom:nth-child(1) div.col-xs-12.col-md-4:nth-child(1) div.donate-form-section div.white-box fieldset:nth-child(4) ul.donation-radio-list.donationlevel li:nth-child(8) div.donationlevel-custom-amount-field:nth-child(3) > span.hit-area"));
	}

	
	// ACTIONS
	
	
	public void clickOn100() {
		amount100().click();
	}

	public void otherAmountSendKeys() {
		otherAmount().sendKeys("321");
	}

}
