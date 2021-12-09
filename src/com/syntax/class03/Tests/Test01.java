package com.syntax.class03.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test01 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "Driver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://syntaxprojects.com");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[contains(@id,'btn')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='list-group-item' and text()='Simple Form Demo']")).click();
        driver.findElement(By.xpath("//input[@id='sum1']")).sendKeys("15");
        driver.findElement(By.xpath("//input[@id='sum2']")).sendKeys("20");
        driver.findElement(By.xpath("//button[text()='Get Total']")).click();
        Thread.sleep(3000);
        driver.quit();
    }
}
