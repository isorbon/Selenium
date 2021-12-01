package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "Driver/geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com/");
    }
}
