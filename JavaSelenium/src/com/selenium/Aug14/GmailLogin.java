package com.selenium.Aug14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GmailLogin {
	public static void main(String[] args) throws InterruptedException, IOException {

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("config.properties");
		prop.load(fis);

		String username = prop.getProperty("gmail.username");
		String password = prop.getProperty("gmail.password");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jaigo\\Downloads\\selenium-java-4.34.0\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://accounts.google.com/signin");

		driver.findElement(By.id("identifierId")).sendKeys(username);
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(2000);

		driver.findElement(By.name("Passwd")).sendKeys(password);
		driver.findElement(By.id("passwordNext")).click();

		Thread.sleep(5000);
		System.out.println("Login flow completed!");

		driver.quit();
	}
}
