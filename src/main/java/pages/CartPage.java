package pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.SeleniumWrappers;

public class CartPage extends SeleniumWrappers {

	public CartPage(WebDriver driver) {
		super(driver);

	}

	public By addQty = By.cssSelector("div[class*='quantity-button plus']");
	public By total = By.cssSelector("td[data-title='Total'] bdi");
	public By checkout = By.cssSelector("div[class*='checkout']>a");

	public void confirmUpdate() throws InterruptedException {
		String initialTotal = find(total).getText();
		click(addQty);
		Thread.sleep(2000);
		assertNotEquals(find(total).getText(), initialTotal);
	}
	
	public void ProceedCheckout() {
		click(checkout);
	}

}
