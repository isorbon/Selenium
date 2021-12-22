package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomeWork {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "Driver/gecodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://syntaxprojects.com/window-popup-modal-demo.php");
        driver.manage().window().maximize();

        WebElement instaBtn = driver.findElement(By.xpath("//a[contains(@title,'Instagram')]"));
        WebElement fbBtn = driver.findElement(By.xpath("//a[contains(@title,'Facebook')]"));

        instaBtn.click();
        fbBtn.click();

    }
}
