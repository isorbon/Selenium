package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alerts {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "Driver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://www.uitestpractice.com/Students/Switchto");

        // enable the Simple alert
        driver.findElement(By.cssSelector("button#alert")).click();
        Thread.sleep(2000);
        Alert simpleAlert = driver.switchTo().alert();
        simpleAlert.accept(); // method accept() - we click to button OK

        Thread.sleep(2000);

        // enable the Confirmation alert
        driver.findElement(By.cssSelector("button#confirm")).click();
        Thread.sleep(2000);
        Alert confirmAlert = driver.switchTo().alert();
        System.out.println(confirmAlert.getText()); // method to get text from alert
        confirmAlert.dismiss(); // method dismiss() - we click to the Cancel button

        Thread.sleep(2000);

        //enable the Prompt alert
        driver.findElement(By.cssSelector("button#prompt")).click();
        Thread.sleep(2000);
        Alert promptAlert = driver.switchTo().alert();
        System.out.println(promptAlert.getText()); // getting text from alert
        promptAlert.sendKeys("Any Text"); // sending text to alert
        promptAlert.accept();  // click to the OK button

    }
}
