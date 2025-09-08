package com.automation.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {
	private WebDriver driver;
	private WebDriverWait wait;

	private By searchBox = By.id("small-searchterms");
	private By searchButton = By.cssSelector("button.search-box-button");
	private By searchResults = By.cssSelector("div.product-item");
	private By noResultsMessage = By.cssSelector("div.no-result");
	


    public SearchPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public void searchProduct(String productName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchBox)).clear();
        driver.findElement(searchBox).sendKeys(productName);
        driver.findElement(searchButton).click();
    }

	public void enterSearchKeyword(String keyword) {
		driver.findElement(searchBox).clear();
		driver.findElement(searchBox).sendKeys(keyword);
	}

	public void clickSearchButton() {
		driver.findElement(searchButton).click();
	}

	public boolean isProductDisplayed() {
		return driver.findElements(searchResults).size() > 0;
	}

	public String getNoResultsMessage() {
		return driver.findElement(noResultsMessage).getText();
	}
//	public void openProduct(String productName) {
//	    By productLink = By.linkText(productName);
//	    wait.until(ExpectedConditions.elementToBeClickable(productLink)).click();
//	}
	public void openProduct(String productName) {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    By productLink = By.xpath("//a[contains(text(),'" + productName + "')]");
	    wait.until(ExpectedConditions.elementToBeClickable(productLink)).click();
	}

}
