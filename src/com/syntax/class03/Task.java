package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "Driver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://syntaxprojects.com");
        driver.manage().window().maximize();

       // driver.findElement(By.xpath("//a[@id='btn_basic_example']")).click();
        // or
        driver.findElement(By.xpath("//a[contains(@id,'btn')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='list-group-item' and text()='Simple Form Demo']")).click();
        driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("SelSel sd");
        driver.findElement(By.xpath("//button[text()='Show Message']")).click();

        driver.quit();

    }
}
