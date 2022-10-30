package tests;

import org.testng.annotations.Test;

import pages.NavMenuPage;
import utils.BaseTest;

public class SearchProduct extends BaseTest {

	@Test(groups="Search")
	public void SearchProd() {

		NavMenuPage navMenu = new NavMenuPage(driver);
		navMenu.navigateTo(navMenu.home);
		navMenu.searchProduct("Pretzels");

	}

}