package com.syntax.Review01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        System.out.println("Browser launched");

        driver.get("https://google.com/");

        System.out.println(driver.getCurrentUrl());

        System.out.println(driver.getTitle());

        driver.quit();
    }
}
