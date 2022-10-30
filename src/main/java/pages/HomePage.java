package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	public WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;

	}

	public By book1 = By.cssSelector("a[href='the-forest']");
	public By book2 = By.cssSelector("a[href='the-son']");
	public By book3 = By.cssSelector("a[href='life-in-the-garden']");
	public By book4 = By.cssSelector("a[href='the-long-road-to-the-deep-silence']");
	public By book5 = By.cssSelector("a[href='its-a-really-strange-story']");
	public By book6 = By.cssSelector("a[href='storm']");

	public boolean navigateValidate(By book, String url) {
		driver.findElement(book).click();
		String currentURL = driver.getCurrentUrl();
		assertEquals(currentURL, url);
		return true;
	}

}
