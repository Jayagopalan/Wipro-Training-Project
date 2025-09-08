package com.automation.stepDefinitions;

import com.automation.pages.SearchPage;
import com.automation.utilities.ConfigReader;
import com.automation.utilities.DriverFactory;

import io.cucumber.java.en.*;
import org.testng.Assert;

public class SearchSteps {
    private SearchPage searchPage = new SearchPage(DriverFactory.getDriver());

    @Given("User is on the Home page")
    public void user_is_on_the_home_page() {
        String url = ConfigReader.get("SearchUrl");
        DriverFactory.getDriver().get(url);
    }

    @When("User searches for {string}")
    public void user_searches_for(String keyword) {
        searchPage.enterSearchKeyword(keyword);
        searchPage.clickSearchButton();
    }

    @Then("Product results should be displayed")
    public void product_results_should_be_displayed() {
        Assert.assertTrue(searchPage.isProductDisplayed(), "No products displayed!");
    }

    @Then("User should see message {string}")
    public void user_should_see_message(String expectedMessage) {
        String actualMessage = searchPage.getNoResultsMessage();
        Assert.assertTrue(actualMessage.contains(expectedMessage),
                "Error message mismatch! Expected: " + expectedMessage + " but found: " + actualMessage);
    }
}
