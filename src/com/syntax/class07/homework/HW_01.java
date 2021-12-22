package com.syntax.class07.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Iterator;
import java.util.Set;

public class HW_01 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "Driver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://syntaxprojects.com/window-popup-modal-demo.php");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        WebElement instaBtn = driver.findElement(By.xpath("//a[contains(@title,'Instagram')]"));
        instaBtn.click();

        Thread.sleep(2000);
        driver.switchTo().defaultContent(); // switch to default/main window

        WebElement fbBtn = driver.findElement(By.xpath("//a[contains(@title,'Facebook')]"));
        fbBtn.click();

        Set<String> allWindowsHandles = driver.getWindowHandles();
        System.out.println("Number of windows handles is: " + allWindowsHandles.size());

        Iterator<String> iterator = allWindowsHandles.iterator();
        String mainHandle = iterator.next();
        String instaHandle = iterator.next();
        String fbHandle = iterator.next();

        System.out.println("The main window handle is: " + mainHandle);
        System.out.println("The Instagram handle is: " + instaHandle);
        System.out.println("The FB window handle is: " + fbHandle);


    }
}
