package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

   
    private By emailField = By.id("Email");
    private By passwordField = By.id("Password");
    private By loginButton = By.cssSelector("button.button-1.login-button");
    private By myAccountLink = By.className("ico-account");
    private By errorMessage = By.cssSelector("div.message-error");
    
    
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    
    public void enterEmail(String email) {
        driver.findElement(emailField).clear();
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).clear();
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }
    public boolean isMyAccountDisplayed() {
        return driver.findElement(myAccountLink).isDisplayed();
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText().replace("\n", " ").trim();
    }

}
