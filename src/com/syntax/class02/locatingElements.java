package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatingElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://facebook.com");
        driver.findElement(By.id("email")).sendKeys("isorbon@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("pass");
        driver.findElement(By.name("login")).click();
        // or do
        // driver.findElement(By.name("login")).sendKeys(Keys.ENTER);
        //driver.findElement(By.linkText("Forgot password?")).click();
       // driver.findElement(By.partialLinkText("Forgot")).click();
    }
}
