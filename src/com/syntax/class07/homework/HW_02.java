package com.syntax.class07.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HW_02 {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "Driver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://demoqa.com/nestedframes");
        driver.manage().window().maximize();

        driver.switchTo().frame("frame1");

        WebElement childFrame = driver.findElement(By.xpath("//iframe[contains(@srcdoc, 'Child')]"));
        driver.switchTo().frame(childFrame);

        WebElement text = driver.findElement(By.xpath("//p[text()='Child Iframe']"));
        System.out.println(text.getText());

    }
}
