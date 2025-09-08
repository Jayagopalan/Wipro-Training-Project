package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {

	private WebDriver driver;
	private WebDriverWait wait;

	private By sizeDropdown = By.cssSelector("select[id*='product_attribute']");
	private By colorDropdown = By.cssSelector("select[id*='product_attribute']");
	private By addToCartBtn = By.cssSelector("button#add-to-cart-button-30");
	private By successMessage = By.cssSelector(".bar-notification.success");

	public CartPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public void selectProductOptions() {
		try {
			WebElement sizeElement = driver.findElement(sizeDropdown);
			if (sizeElement.isDisplayed()) {
				new Select(sizeElement).selectByIndex(1);
			}
		} catch (Exception e) {
			System.out.println("No size option available.");
		}

		try {
			WebElement colorElement = driver.findElement(colorDropdown);
			if (colorElement.isDisplayed()) {
				new Select(colorElement).selectByIndex(1);
			}
		} catch (Exception e) {
			System.out.println("No color option available.");
		}
	}

	public void addToCart() {
		wait.until(ExpectedConditions.elementToBeClickable(addToCartBtn)).click();
	}

	public boolean isProductAdded() {
		try {
			return wait.until(ExpectedConditions.visibilityOfElementLocated(successMessage)).isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

}
