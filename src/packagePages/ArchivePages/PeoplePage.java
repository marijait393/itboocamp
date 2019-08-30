package packagePages.ArchivePages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PeoplePage {

	static WebDriver driver;

	public PeoplePage(WebDriver driver) {
		this.driver = driver;

	}
	
	// ELEMENTS
	

	private static List<WebElement> pBios() {
		return driver.findElements(By.cssSelector("#maincontent > div > div > div.col-md-9 > div > div div:not(.bio)"));
	}

	
	// ACTIONS
	
	
	public List<WebElement> getPBios() {
		return pBios();
	}
	
	public void sizePBios() {
		getPBios().size();
	}

	public List<String> infoBios() {
		
		List<WebElement> bios = getPBios();
		List<String> name_title = new ArrayList<String>();

		for (int i = 0; i < bios.size(); i++) {

			WebElement names = bios.get(i).findElement(By.cssSelector("b"));
			WebElement titles = bios.get(i).findElement(By.cssSelector("i"));
			name_title.add(names.getText() + ' ' + titles.getText());
		}
		return name_title;
	}

}
