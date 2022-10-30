package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.SeleniumWrappers;

public class ProductPage extends SeleniumWrappers {

	public ProductPage(WebDriver driver) {
		super(driver);

	}

	public By addCart = By.cssSelector("button[name='add-to-cart']");
	public By confirmCart = By.cssSelector("div[class='woocommerce-message']");

	public boolean addConfirm() {
		click(addCart);
		return find(confirmCart).isDisplayed();
	}

}