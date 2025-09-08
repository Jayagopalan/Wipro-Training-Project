package com.automation.stepDefinitions;

import com.automation.pages.CartPage;
import com.automation.pages.SearchPage;
import com.automation.utilities.ConfigReader;
import com.automation.utilities.DriverFactory;

import io.cucumber.java.en.*;
import org.testng.Assert;

public class CartSteps {

    private CartPage cartPage = new CartPage(DriverFactory.getDriver());
    private SearchPage searchPage = new SearchPage(DriverFactory.getDriver());

    @Given("User is on the Home page for Cart")
    public void user_is_on_the_home_page_for_cart() {
        String url = ConfigReader.get("SearchUrl");
        DriverFactory.getDriver().get(url);
    }

    @When("User searches for product {string}")
    public void user_searches_for_product(String productName) {
        searchPage.enterSearchKeyword(productName);
        searchPage.clickSearchButton();
        searchPage.openProduct(productName); 
    }

    @When("User selects product options if available")
    public void user_selects_product_options_if_available() {
        cartPage.selectProductOptions();
    }

    @When("User clicks on Add to Cart")
    public void user_clicks_on_add_to_cart() {
        cartPage.addToCart();
    }

    @Then("Product should be added to cart successfully")
    public void product_should_be_added_to_cart_successfully() {
        Assert.assertTrue(cartPage.isProductAdded(),
                " Product was not added to the cart!");
    }
}
