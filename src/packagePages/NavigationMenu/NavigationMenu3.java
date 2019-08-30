package packagePages.NavigationMenu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigationMenu3 {

	static WebDriver driver;

	public NavigationMenu3(WebDriver driver) {
		this.driver = driver;
	}
	
	// ELEMENTS
	
	
	private static WebElement about() {
		return driver.findElement(By.cssSelector("body.navia.top.ia-module.bgEEE.tiles:nth-child(2) div.hatted:nth-child(1) div:nth-child(1) div.navbar.navbar-inverse.navbar-static-top ul:nth-child(3) li:nth-child(1) > a:nth-child(1)"));
	}                                             
	
	private static WebElement contact() {
		return driver.findElement(By.cssSelector("body.navia.top.ia-module.bgEEE.tiles:nth-child(2) div.hatted:nth-child(1) div:nth-child(1) div.navbar.navbar-inverse.navbar-static-top ul:nth-child(3) li:nth-child(2) > a:nth-child(1)"));
	}
	
	
	private static WebElement blog() {
		return driver.findElement(By.cssSelector("body.navia.top.ia-module.bgEEE.tiles:nth-child(2) div.hatted:nth-child(1) div:nth-child(1) div.navbar.navbar-inverse.navbar-static-top ul:nth-child(3) li:nth-child(3) > a:nth-child(1)"));
	}
	
	
	private static WebElement projects() {
		return driver.findElement(By.cssSelector("body.navia.top.ia-module.bgEEE.tiles:nth-child(2) div.hatted:nth-child(1) div:nth-child(1) div.navbar.navbar-inverse.navbar-static-top ul:nth-child(3) li:nth-child(4) > a:nth-child(1)"));
	}
	
	
	private static WebElement help() {
		return driver.findElement(By.cssSelector("body.navia.top.ia-module.bgEEE.tiles:nth-child(2) div.hatted:nth-child(1) div:nth-child(1) div.navbar.navbar-inverse.navbar-static-top ul:nth-child(3) li:nth-child(5) > a:nth-child(1)"));
	}
	
	
	private static WebElement donate() {
		return driver.findElement(By.cssSelector("body.navia.top.ia-module.bgEEE.tiles:nth-child(2) div.hatted:nth-child(1) div:nth-child(1) div.navbar.navbar-inverse.navbar-static-top ul:nth-child(3) li:nth-child(6) > a:nth-child(1)"));
	}
	
	private static WebElement jobs() {
		return driver.findElement(By.cssSelector("body.navia.top.ia-module.bgEEE.tiles:nth-child(2) div.hatted:nth-child(1) div:nth-child(1) div.navbar.navbar-inverse.navbar-static-top ul:nth-child(3) li:nth-child(7) > a:nth-child(1)"));
	}
	
	private static WebElement volunteer() {
		return driver.findElement(By.cssSelector("body.navia.top.ia-module.bgEEE.tiles:nth-child(2) div.hatted:nth-child(1) div:nth-child(1) div.navbar.navbar-inverse.navbar-static-top ul:nth-child(3) li:nth-child(8) > a:nth-child(1)"));
	}
	private static WebElement people() {
		return driver.findElement(By.cssSelector("body.navia.top.ia-module.bgEEE.tiles:nth-child(2) div.hatted:nth-child(1) div:nth-child(1) div.navbar.navbar-inverse.navbar-static-top ul:nth-child(3) li:nth-child(9) > a:nth-child(1)"));
	}
}