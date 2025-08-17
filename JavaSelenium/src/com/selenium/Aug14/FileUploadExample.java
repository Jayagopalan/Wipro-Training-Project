package com.selenium.Aug14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadExample {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jaigo\\Downloads\\selenium-java-4.34.0\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/upload");

		WebElement uploadElement = driver.findElement(By.id("file-upload"));

		uploadElement.sendKeys("C:\\Users\\Jaigo\\Downloads\\Assessment Engine.pdf");

		driver.findElement(By.id("file-submit")).click();

		WebElement message = driver.findElement(By.id("uploaded-files"));
		System.out.println(message.getText());

		driver.quit();
	}
}
