package com.selenium.Aug16;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jaigo\\Downloads\\selenium-java-4.34.0\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Alert simpleAlert = driver.switchTo().alert();
		simpleAlert.accept();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Alert confirmAlert = driver.switchTo().alert();
		confirmAlert.dismiss();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys("Hello Selenium!");
		promptAlert.accept();
		Thread.sleep(5000);

		driver.quit();
	}
}
