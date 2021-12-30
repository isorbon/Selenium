package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class staleElementExceptions {
    public static String url = "https://chercher.tech/practice/stale-element";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        WebElement refreshBtn = driver.findElement(By.cssSelector("button#refresh-button"));
        // wait for 11 sec and then click on btn
        Thread.sleep(11000);
        // in order to handle exception locate it again
        refreshBtn = driver.findElement(By.cssSelector("button#refresh-button"));

        refreshBtn.click();



    }
}
