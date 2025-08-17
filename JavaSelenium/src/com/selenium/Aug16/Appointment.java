package com.selenium.Aug16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;

public class Appointment {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jaigo\\Downloads\\selenium-java-4.34.0\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.get("https://360homedecor.uk/book-appointment");
		Select brandDropdown = new Select(driver.findElement(By.xpath("//select[contains(@name,'brand')]")));
		brandDropdown.selectByVisibleText("Marquis Manor");
		Thread.sleep(2000);

		Select styleDropdown = new Select(driver.findElement(By.xpath("//select[contains(@name,'style')]")));
		styleDropdown.selectByVisibleText("Artdeco");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[contains(@name,'first')]")).sendKeys("Jayagopalan");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[contains(@name,'last')]")).sendKeys("M");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[contains(@name,'city')]")).sendKeys("Chennai");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[contains(@name,'phone')]")).sendKeys("9876543210");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("jayagopalan@gmail.com");
		Thread.sleep(2000);

//		driver.findElement(By.xpath("//input[@type='file']"))
//				.sendKeys("C:\\Users\\Jaigo\\Downloads\\Assessment Engine.pdf");
//		Thread.sleep(2000);

		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		if (!checkbox.isSelected()) {
			checkbox.click();
		}

		driver.findElement(By.xpath("//button[contains(text(),'BOOK APPOINTMENT')]")).click();

		

		//driver.quit();

	}

}
