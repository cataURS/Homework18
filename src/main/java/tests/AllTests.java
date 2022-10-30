package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.CartPage;
import pages.CheckoutPage;
import pages.LoginPage;
import pages.NavMenuPage;
import pages.ProductPage;
import utils.BaseTest;

public class AllTests extends BaseTest {
	
	@Parameters({ "user", "pass" })
	@Test(priority=1)
	public void login(String username, String parola) {
		NavMenuPage navMenu = new NavMenuPage(driver);
		navMenu.navigateTo(navMenu.loginLink);
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginInApp(username, parola);
		assertTrue(loginPage.loginSucessMessageIsDisplayed());
		assertTrue(loginPage.loginMessageIsDisplayed(loginPage.loginSuccessMessage));
	}
	
	@Test(priority=2)
	public void Search() {
		NavMenuPage navMenu = new NavMenuPage(driver);
		navMenu.navigateTo(navMenu.home);
		navMenu.searchProduct("Pretzels");

	}

	@Test(priority=3)
	public void AddProduct() {
		ProductPage prod = new ProductPage(driver);
		assertTrue(prod.addConfirm());

	}
	
	@Test(priority=4)
	public void SearchAddAnother( ) {
		NavMenuPage navMenu = new NavMenuPage(driver);
		navMenu.searchProduct("tomatoes");
		ProductPage prod = new ProductPage(driver);
		assertTrue(prod.addConfirm());
	}
	
	@Test(priority=5)
	public void CartUpdate() throws InterruptedException {
		NavMenuPage navMenu = new NavMenuPage(driver);
		navMenu.navigateTo(navMenu.cart);
		CartPage cart = new CartPage(driver);
		cart.confirmUpdate();
		cart.ProceedCheckout();
		
	}
	
	@Test(priority=6)
	public void Checkout() throws InterruptedException {
		CheckoutPage check = new CheckoutPage(driver);
		assertTrue(check.proceedFinal());
		
	}

}