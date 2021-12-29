package com.syntax.class08.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class HW_01 {
    /*  goto http://syntaxprojects.com/window-popup-modal-demo.php
      click on follow on instagram
      get the title and of new window and print it on the console */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/window-popup-modal-demo.php");
        driver.manage().window().maximize();

        WebElement instaBtn = driver.findElement(By.xpath("//a[contains(@title, 'Instagram')]"));
        instaBtn.click();

        Set<String> allWindowsHandles = driver.getWindowHandles();

        Iterator<String> iterator = allWindowsHandles.iterator();
        while (iterator.hasNext()) {
            String handle = iterator.next();
            driver.switchTo().window(handle);

            if (driver.getCurrentUrl().equalsIgnoreCase("https://www.instagram.com/Syntaxtechs/")) {
                System.out.println(driver.getTitle());
                break;
            }
        }

    }
}
