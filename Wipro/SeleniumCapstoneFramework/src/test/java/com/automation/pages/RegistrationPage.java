package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {
    private WebDriver driver;

    
    private By genderMale = By.id("gender-male");
    private By genderFemale = By.id("gender-female");
    private By firstName = By.id("FirstName");
    private By lastName = By.id("LastName");
    private By email = By.id("Email");
    private By company = By.id("Company");
    private By newsletter = By.id("Newsletter");
    private By password = By.id("Password");
    private By confirmPassword = By.id("ConfirmPassword");
    private By registerButton = By.id("register-button");
    private By successMessage = By.cssSelector("div.result");
    private By errorMessage = By.cssSelector("div.message-error, span.field-validation-error" );

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectGender(String gender) {
        if (gender.equalsIgnoreCase("male")) {
            driver.findElement(genderMale).click();
        } else {
            driver.findElement(genderFemale).click();
        }
    }

    public void enterFirstName(String fname) {
        driver.findElement(firstName).sendKeys(fname);
    }

    public void enterLastName(String lname) {
        driver.findElement(lastName).sendKeys(lname);
    }

    public void enterEmail(String mail) {
        driver.findElement(email).sendKeys(mail);
    }

    public void enterCompany(String companyName) {
        driver.findElement(company).sendKeys(companyName);
    }

    public void setNewsletter(boolean subscribe) {
        if (!subscribe) {
            if (driver.findElement(newsletter).isSelected()) {
                driver.findElement(newsletter).click();
            }
        }
    }

    public void enterPassword(String pass) {
        driver.findElement(password).sendKeys(pass);
    }

    public void enterConfirmPassword(String confirmPass) {
        driver.findElement(confirmPassword).sendKeys(confirmPass);
    }

    public void clickRegister() {
        driver.findElement(registerButton).click();
    }

    public String getSuccessMessage() {
        return driver.findElement(successMessage).getText();
    }
    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText().trim();
    }
   
}
