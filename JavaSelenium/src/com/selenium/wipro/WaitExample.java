package com.selenium.wipro;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class WaitExample {
    public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Jaigo\\Downloads\\selenium-java-4.34.0\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");

        driver.findElement(By.cssSelector("#start button")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement helloText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")));

        System.out.println(helloText.getText());

        driver.quit();
    }
}
