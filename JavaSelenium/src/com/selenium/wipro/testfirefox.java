package com.selenium.wipro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testfirefox {
	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Jaigo\\Downloads\\selenium-java-4.34.0\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.google.com");

		driver.quit();
	}

}
