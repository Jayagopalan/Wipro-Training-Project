package com.automation.stepDefinitions;

import com.automation.pages.WishlistPage;
import com.automation.utilities.ConfigReader;
import com.automation.utilities.DriverFactory;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class WishlistSteps {

	private WishlistPage wishlistPage = new WishlistPage(DriverFactory.getDriver());


    @When("the user adds Ray Ban Aviator Sunglasses to the wishlist")
    public void i_add_rayban_to_the_wishlist() {
        wishlistPage.addRayBanToWishlist();
    }

    @Then("Ray Ban Aviator Sunglasses should appear in the wishlist")
    public void rayban_should_appear_in_my_wishlist() {
        Assert.assertTrue(wishlistPage.isRayBanWishlisted(),
                "Ray-Ban Aviator Sunglasses was not added to wishlist!");
    }
}