package com.selenium.wipro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class testchrome {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jaigo\\Downloads\\selenium-java-4.34.0\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");

		System.out.println("Page title is: " + driver.getTitle());

		driver.quit();
	}
}
