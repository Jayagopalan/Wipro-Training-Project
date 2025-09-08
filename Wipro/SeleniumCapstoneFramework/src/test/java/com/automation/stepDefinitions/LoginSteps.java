package com.automation.stepDefinitions;

import com.automation.pages.LoginPage;
import com.automation.utilities.ConfigReader;
import com.automation.utilities.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.testng.Assert.assertTrue;

public class LoginSteps {
    private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

    @Given("User is on the Login page")
    public void user_is_on_the_login_page() {
        String url = ConfigReader.get("Url");
        DriverFactory.getDriver().get(url);
    }

    @When("User enters email {string} and password {string}")
    public void user_enters_email_and_password(String email, String password) {
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
    }

    @When("User clicks on Login button")
    public void user_clicks_on_login_button() {
        loginPage.clickLogin();
    }

    @Then("User should be logged in successfully")
    public void user_should_be_logged_in_successfully() {
        assertTrue(loginPage.isMyAccountDisplayed(), "Login failed!");
    }

    @Then("User should see login error message {string}")
    public void user_should_see_login_error_message(String expectedError) {
        String actualError = loginPage.getErrorMessage();
        assertTrue(actualError.contains(expectedError), "Error message mismatch!");
    }
}

