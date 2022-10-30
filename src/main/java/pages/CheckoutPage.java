package pages;

import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.SeleniumWrappers;

public class CheckoutPage extends SeleniumWrappers {

	public CheckoutPage(WebDriver driver) {
		super(driver);

	}

	public By checkbox = By.cssSelector("input[type='checkbox']");
	public By proceed = By.cssSelector("button[id='place_order'");
	public By message = By.cssSelector("p[class*='thankyou']");

	public boolean proceedFinal() throws InterruptedException {
		click(checkbox);
		Thread.sleep(2000);
		click(proceed);
		Thread.sleep(2000);
		return find(message).isDisplayed();
	}

}

