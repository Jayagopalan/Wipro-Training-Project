package com.selenium.wipro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class testedge {
	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\Jaigo\\Downloads\\selenium-java-4.34.0\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();

		driver.get("https://www.google.com");

		driver.quit();
	}

}
