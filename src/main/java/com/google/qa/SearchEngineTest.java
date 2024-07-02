package com.google.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class SearchEngineTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver(); //selenium for browser open
        driver.get("https://www.google.com/" ); // selenium for google url copy
        driver.manage().window().maximize();  // selenium for full window
        Thread.sleep(5000); // pure java for delay time
driver.findElement(By.name("q")).sendKeys("CoxsBazar"); // selenium for search locator code "q" here for only coxsbazar
        Thread.sleep(5000);
driver.findElement(By.name("btnk")).submit(); // selenium for button search code "btnk" here for only coxsbazar
        Thread.sleep(5000);

    }
}
