package com.syntax.class09.homework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HW_01 {
    // goto https://chercher.tech/practice/explicit-wait
    public static String url = "https://chercher.tech/practice/explicit-wait";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

       // 1.click on open an alert after 5 sec and then using explicit wait manage that alert
        driver.findElement(By.cssSelector("button#alert")).click();

        WebDriverWait wait = new WebDriverWait(driver,12);
        wait.until(ExpectedConditions.alertIsPresent());
        Alert simpleAlert = driver.switchTo().alert();
        simpleAlert.accept();

        //2.click on display button after 10 sec and once the button is displayed  print the status of isDisplayed()
        driver.findElement(By.cssSelector("button#display-other-button")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button#hidden")));
        WebElement enabledBtn = driver.findElement(By.cssSelector("button#hidden"));
        System.out.println("the status of button is: " + enabledBtn.isDisplayed());

        driver.quit();
    }
}
