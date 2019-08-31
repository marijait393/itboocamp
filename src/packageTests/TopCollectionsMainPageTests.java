package packageTests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import packagePages.PageURLs;
import packagePages.ArchivePages.MainPage;


public class TopCollectionsMainPageTests {

	WebDriver driver;
	MainPage mp;


	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mare\\Desktop\\Selenium\\geckodriver.exe");

		driver = new FirefoxDriver();
	}

	@Test  (priority = 0)
	public void topCollectionItemsTest() throws Exception {
		
		mp = new MainPage(driver);
		
		driver.navigate().to(PageURLs.MAIN_PAGE);

		Assert.assertTrue(new MainPage(driver).getTopCollectionSize() >= 20);

		mp.getTopCollectionSize();

		List<WebElement> tekst = driver.findElements(By.cssSelector("div.item-ia.collection-ia"));
		for (WebElement i : tekst) {

			i.getText();

			Assert.assertTrue(i.getText().toLowerCase().contains("items"));
		}
	}

	@Test  (priority = 1)
	public void topCollectionItemResultsTest() throws Exception {

		WebElement number = mp.getCollections().get(0);

		String[] views1 = number.getText().split("[\\n]");

		System.out.println(views1[0]);

		new MainPage(driver).clickOnTopCollection(0);

		WebElement results = driver.findElement(By.cssSelector("div.results_count"));

		String[] views2 = results.getText().split("[\\s]");

		String num1 = views2[0];
		String num2 = views1[0];
		
		String newNum1 = num1.replace(",", "");
		String newNum2 = num2.replace(",", "");
		
		int result1 = Integer.valueOf(newNum1);
		int result2 = Integer.valueOf(newNum2);

		int diference = result1 - result2;

		Assert.assertTrue(diference > 100);
		
	}

}
