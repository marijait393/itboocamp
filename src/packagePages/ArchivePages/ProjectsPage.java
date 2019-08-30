package packagePages.ArchivePages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProjectsPage {

	static WebDriver driver;

	public ProjectsPage(WebDriver driver) {
		this.driver = driver;

	}
	
	
	// ELEMENTS
	

	private static List<WebElement> projectsList() {
		return driver.findElements(By.cssSelector("main#maincontent div.col-sm-9"));
	}

	
	// ACTIONS
	
	
	public void projectListNumberOfElements() {
		projectsList().size();
	}

}