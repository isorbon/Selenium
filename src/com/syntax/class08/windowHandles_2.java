package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class windowHandles_2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();

        // Open up a new tab and a new window
        // switch to new tab and get the text
        WebElement newTab = driver.findElement(By.cssSelector("button#tabButton"));
        WebElement newWindow = driver.findElement(By.cssSelector("button#windowButton"));

        newTab.click();
        newWindow.click();

        //print the handle of the main page
        //getWindowHandle return us the handle of current window, so no sets
        String parentHandle = driver.getWindowHandle();
        System.out.println("Parent window handle : " + parentHandle);

        // in order to switch to another tab we need get all handles of windows
        // 1. get all handles
        Set<String> allWindowsHandles = driver.getWindowHandles();
        // 2. find the desired handle i.e of newtab by iterating through the set
        Iterator<String> iterator = allWindowsHandles.iterator();
        while (iterator.hasNext()) {
            String handle = iterator.next();
            driver.switchTo().window(handle);

            if (driver.getCurrentUrl().equalsIgnoreCase("https://demoqa.com/sample")) {
                System.out.println(driver.getCurrentUrl());
                break;
            }
        }
        // successful switch
        WebElement text = driver.findElement(By.cssSelector("h1#sampleHeading"));
        System.out.println(text.getText());

        // switch to main page
        driver.switchTo().window(parentHandle);

        // click on new window with message btn
        WebElement newWindowMessage = driver.findElement(By.cssSelector("button#messageWindowButton"));
        newWindowMessage.click();

        driver.quit();

        //switch ti newtab and get the text
        // driver.switchTo().window(newTab);

    }
}
