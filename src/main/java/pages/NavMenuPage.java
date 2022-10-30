package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.SeleniumWrappers;

public class NavMenuPage extends SeleniumWrappers {

	public NavMenuPage(WebDriver driver) {
		super(driver);
	}

	public By loginLink = By.linkText("My account");
	public By home = By.linkText("HOME");
	public By bakery = By.linkText(" BAKERY");
	public By cart = By.linkText("CART");
	public By searchField = By.cssSelector("input[type='search']");

	public void navigateTo(By locator) {
		driver.findElement(locator).click();
	}

	public void searchProduct(String value) {
		click(searchField);
		sendKeys(searchField, value);
		find(searchField).sendKeys(Keys.ENTER);
	}

	public boolean isBookPictureDisplayed(String picture) {
		WebElement element = driver.findElement(By.cssSelector("div[data-image*='" + picture + "']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
		return element.isDisplayed();
	}

}