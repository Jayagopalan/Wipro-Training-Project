package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automation.utilities.DriverFactory;

import java.time.Duration;

public class WishlistPage {

	private WebDriver driver;
	private WebDriverWait wait;

	public WishlistPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public void addRayBanToWishlist() {
        WebElement productLink = wait.until(
                ExpectedConditions.elementToBeClickable(By.linkText("Ray Ban Aviator Sunglasses"))
        );
        productLink.click();

        WebElement wishlistButton = wait.until(
                ExpectedConditions.elementToBeClickable(By.cssSelector("button[id^='add-to-wishlist-button']"))
        );
        wishlistButton.click();
    }

    public boolean isRayBanWishlisted() {
        driver.findElement(By.linkText("Wishlist")).click();
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.linkText("Ray Ban Aviator Sunglasses"))
        ).isDisplayed();
    }
}

