package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriverCommands {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.manage().window().maximize();

 // navigate to the website; fill the username "AON"; delete the username; fill the new username "Tester"
        WebElement userName = driver.findElement(By.cssSelector("input#ctl00_MainContent_username"));
        userName.sendKeys("AON");
        Thread.sleep(1500);
        userName.clear();
        Thread.sleep(1500);
        userName.sendKeys("Tester");
        Thread.sleep(1500);

        driver.quit();
    }
}
