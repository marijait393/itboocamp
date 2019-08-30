package packagePages.NavigationMenu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

   public class NavigationMenu2 {

   static WebDriver driver;
	
	public NavigationMenu2(WebDriver driver) {
		this.driver = driver;
	}
	
	
	// ELEMENTS
	
	
	private static WebElement webIcon() {
		return driver.findElement(By.cssSelector("body.navia.top.ia-module.bgEEE.tiles:nth-child(2) div.hatted:nth-child(1) div:nth-child(1) div.navbar.navbar-inverse.navbar-static-top ul.nav.navbar-nav.navbar-main:nth-child(2) > li.dropdown.dropdown-ia.pull-left:nth-child(1)"));
	}
	
	
	private static WebElement textIcon() {
		return driver.findElement(By.xpath("//*[@id=\"navwrap2\"]/div[2]/ul[1]/li[2]"));
	}
	
	
	private static WebElement videoIcon() {
		return driver.findElement(By.cssSelector("body.navia.top.ia-module.bgEEE.tiles:nth-child(2) div.hatted:nth-child(1) div:nth-child(1) div.navbar.navbar-inverse.navbar-static-top ul.nav.navbar-nav.navbar-main:nth-child(2) li.dropdown.dropdown-ia.pull-left.hatted:nth-child(4) > a.navia-link.movies"));
	}
	
	
	private static WebElement audioIcon() {
		return driver.findElement(By.cssSelector("body.navia.top.ia-module.bgEEE.tiles:nth-child(2) div.hatted:nth-child(1) div:nth-child(1) div.navbar.navbar-inverse.navbar-static-top ul.nav.navbar-nav.navbar-main:nth-child(2) li.dropdown.dropdown-ia.pull-left:nth-child(5) > a.navia-link.audio"));
	}
	
	private static WebElement softwareIcon () {
		return driver.findElement(By.cssSelector("body.navia.top.ia-module.bgEEE.tiles:nth-child(2) div.hatted:nth-child(1) div:nth-child(1) div.navbar.navbar-inverse.navbar-static-top ul.nav.navbar-nav.navbar-main:nth-child(2) li.dropdown.dropdown-ia.pull-left:nth-child(6) > a.navia-link.software"));
	}
	
	
	private static WebElement imageIcon () {
		return driver.findElement(By.cssSelector("body.navia.top.ia-module.bgEEE.tiles:nth-child(2) div.hatted:nth-child(1) div:nth-child(1) div.navbar.navbar-inverse.navbar-static-top ul.nav.navbar-nav.navbar-main:nth-child(2) li.dropdown.dropdown-ia.pull-left.rightmost:nth-child(7) > a.navia-link.image"));
	}
	
	
	private static WebElement  logoIcon() {
		return driver.findElement(By.cssSelector("body.navia.top.ia-module.bgEEE.tiles:nth-child(2) div.hatted:nth-child(1) div:nth-child(1) div.navbar.navbar-inverse.navbar-static-top ul.nav.navbar-nav.navbar-main:nth-child(2) li.navbar-brand-li:nth-child(7) > a.navbar-brand"));
	}
	
	private static WebElement signInButton() {
		return driver.findElement(By.cssSelector("body.navia.top.ia-module.bgEEE.tiles:nth-child(2) div.hatted:nth-child(1) div:nth-child(1) div.navbar.navbar-inverse.navbar-static-top ul.nav.navbar-nav.navbar-main:nth-child(2) li.dropdown-ia.pull-right.leftmost:nth-child(10) > a.nav-user"));
	}
	
	
	private static WebElement uploadButton() {
		return driver.findElement(By.cssSelector("body.navia.top.ia-module.bgEEE.tiles:nth-child(2) div.hatted:nth-child(1) div:nth-child(1) div.navbar.navbar-inverse.navbar-static-top ul.nav.navbar-nav.navbar-main:nth-child(2) li.dropdown.dropdown-ia.pull-right:nth-child(9) > a.nav-upload"));
	}
	
	private static WebElement searchBar() {
		return driver.findElement(By.cssSelector("body.navia.tv911.navia.content-box.responsive-playing:nth-child(2) div:nth-child(1) div.navbar.navbar-inverse.navbar-static-top ul.nav.navbar-nav.navbar-main:nth-child(2) li.dropdown.dropdown-ia.pull-right:nth-child(9) > div.searchbar:nth-child(2)"));
	}  
	
	
	//Username when logged
	private static WebElement username() {
		return driver.findElement(By.cssSelector("body.navia.ia-module.tiles:nth-child(2) div.hatted:nth-child(1) div.navbar.navbar-inverse.navbar-static-top ul.nav.navbar-nav.navbar-main:nth-child(2) li.dropdown-ia.pull-right.leftmost:nth-child(12) a.nav-user.ghost80 > span.hidden-xs-span"));
	}


	// ACTIONS
	
	
	public void clickOnSignInButton() {
		signInButton().click();
	}
	
	 public void inputSearchTerm(String searchTerm) {
		searchBar().sendKeys(searchTerm);
	 }
	 
	 public void clickOnTextIcon() {
		 textIcon().click();
	 }
	 
	 public void clickOnLogo() {
		 logoIcon().click();
	 }
	 
	 public void clickOnUpload() {
		 uploadButton().click();
	 }
	
	 public void clickOnUsername() {
		 username().click();
	 }

	 public void clickOnSearchBar() {
		 searchBar().click();
	 }
	 
	 public void sendTextSearchBar(String SearchTerm) {
		 searchBar().sendKeys(SearchTerm);
	 }
	 
}
