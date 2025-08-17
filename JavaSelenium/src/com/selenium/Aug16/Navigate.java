package com.selenium.Aug16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jaigo\\Downloads\\selenium-java-4.34.0\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.navigate().to("https://www.amazon.in");
		Thread.sleep(2000);

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptop");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);

		driver.navigate().to("https://www.flipkart.com");
		Thread.sleep(2000);

		driver.navigate().back();
		System.out.println("Back to Amazon");
		Thread.sleep(2000);

		driver.navigate().forward();
		Thread.sleep(2000);

		driver.navigate().refresh();

		driver.quit();
	}
}
