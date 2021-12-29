package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Practice {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://daramal.tj/ru/");
        driver.manage().window().maximize();

        String originalWindow = driver.getWindowHandle();

        assert driver.getWindowHandles().size() == 1;

        driver.findElement(By.cssSelector("ul#unite_carousel_1_1 li:nth-child(2) a")).click();

        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        for (String windowHandle : driver.getWindowHandles()
             ) {
            if (!originalWindow.contentEquals(windowHandle)){
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        driver.switchTo().window(originalWindow);

    }
}
