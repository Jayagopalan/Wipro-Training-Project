package com.selenium.Aug14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResumeUpload {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jaigo\\Downloads\\selenium-java-4.34.0\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		try {
			driver.get("https://www.naukri.com/nlogin/login");
			driver.findElement(By.id("usernameField")).sendKeys("jaigo9944@gmail.com");
			driver.findElement(By.id("passwordField")).sendKeys("jaigo@007");
			driver.findElement(By.cssSelector("button[type='submit']")).click();
			driver.get("https://www.naukri.com/mnjuser/profile?id=&altresid");
			Thread.sleep(5000);

			driver.get("https://www.naukri.com/mnjuser/profile");

			Thread.sleep(5000);
			WebElement uploadElement = driver.findElement(By.xpath("//input[@type='file']"));
			uploadElement.sendKeys("C:\\Users\\Jaigo\\Downloads\\Jayagopalan-M.pdf");
            
            System.out.println("Resume uploaded successfully!");

		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			driver.quit();
		}
	}

}
