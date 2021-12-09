package com.syntax.class03.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test02 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "Driver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://syntaxprojects.com");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[contains(@id,'btn')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='list-group-item' and text()='Check Box Demo']")).click();
        driver.findElement(By.xpath("//input[@id='isAgeSelected']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='check1']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@value='Option-1']")).click();
        driver.findElement(By.xpath("//input[@value='Option-2']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='myCheck']")).click();
        Thread.sleep(5000);
        driver.quit();
    }
}
