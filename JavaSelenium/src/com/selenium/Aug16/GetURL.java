package com.selenium.Aug16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetURL {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jaigo\\Downloads\\selenium-java-4.34.0\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");

		String title = driver.getTitle();
		System.out.println("Page Title: " + title);

		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL: " + currentUrl);

		driver.quit();
	}
}
