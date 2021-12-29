package com.syntax.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class revisionExplicit {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://chercher.tech/practice/explicit-wait");
        driver.manage().window().maximize();

        // locate enable button after 10 sec button and click on it
        WebElement btn = driver.findElement(By.cssSelector("button#enable-button"));
        btn.click();

        // print the state of the button after it is enabled
        WebDriverWait wait = new WebDriverWait(driver, 20);
        // condition
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button#disable")));

        // print weather the button is enables or not
        WebElement btn2 = driver.findElement(By.cssSelector("button#disable"));
        System.out.println(btn2.isEnabled());

    }
}
