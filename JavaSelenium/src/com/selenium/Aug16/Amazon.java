package com.selenium.Aug16;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Amazon {
    public static void main(String[] args) throws InterruptedException, IOException {
    	
    	Properties props = new Properties();
        FileInputStream fis = new FileInputStream("config.properties");
         props.load(fis);        
         String email = props.getProperty("amazon.email");
         String password = props.getProperty("amazon.password");
         
        
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));     
         driver.get("https://www.amazon.in");   
         driver.findElement(By.id("nav-link-accountList")).click();
         driver.findElement(By.id("ap_email_login")).sendKeys(email);
         driver.findElement(By.id("continue")).click();
         driver.findElement(By.id("ap_password")).sendKeys(password);
         driver.findElement(By.id("signInSubmit")).click();
         List<String> products = new ArrayList<>();
         products.add("Phones");
         products.add("SoundBars");
         products.add("Speakers");
         for (String product : products) {
             
             WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
             searchBox.clear();
             searchBox.sendKeys(product);
             driver.findElement(By.id("nav-search-submit-button")).click();
             WebElement firstProduct = driver.findElement(By.cssSelector("div.s-main-slot div[data-component-type='s-search-result'] h2 a"));
             firstProduct.click();
             driver.findElement(By.id("add-to-cart-button")).click();
             Thread.sleep(3000);
         }
      
    }
}
