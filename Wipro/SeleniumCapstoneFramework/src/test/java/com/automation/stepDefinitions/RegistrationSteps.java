package com.automation.stepDefinitions;

import org.testng.Assert;

import com.automation.pages.RegistrationPage;
import com.automation.utilities.ConfigReader;
import com.automation.utilities.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationSteps {
	private RegistrationPage registrationPage = new RegistrationPage(DriverFactory.getDriver());

	@Given("User is on the Registration page")
	public void user_is_on_the_registration_page() {
		String url = ConfigReader.get("RegisterUrl");
		DriverFactory.getDriver().get(url);
	}

	@When("User enters registration details {string}, {string}, {string}, {string}, {string}, {string}")
	public void user_enters_registration_details(String gender, String fname, String lname, String email,
			String company, String password) {
		registrationPage.selectGender(gender);
		registrationPage.enterFirstName(fname);
		registrationPage.enterLastName(lname);
		registrationPage.enterEmail(email);
		registrationPage.enterCompany(company);
		registrationPage.enterPassword(password);
		registrationPage.enterConfirmPassword(password);
	}

	@And("User enters confirm password {string}")
	public void user_enters_confirm_password(String confirmPassword) {
		registrationPage.enterConfirmPassword(confirmPassword);
	}

	@And("User clicks Register button")
	public void user_clicks_register_button() {
		registrationPage.clickRegister();
	}

	@Then("User should be registered successfully")
	public void user_should_be_registered_successfully() {
		String message = registrationPage.getSuccessMessage();
		Assert.assertTrue(message.contains("Your registration completed"), "Registration failed!");
	}

	@Then("User should see error message {string}")
	public void user_should_see_error_message(String expectedError) {
		String actualError = registrationPage.getErrorMessage();
		Assert.assertTrue(actualError.contains(expectedError), "Error message mismatch!");
	}

}
