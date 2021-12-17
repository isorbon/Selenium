package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://syntaxprojects.com/javascript-alert-box-demo.php");

        // simple / Alert Box
        driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']")).click();
        Thread.sleep(2000);
        Alert simpleAlert = driver.switchTo().alert();
        System.out.println(simpleAlert.getText());
        simpleAlert.accept();

        Thread.sleep(2000);
        // confirmation / Confirm Box
        driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']")).click();
        Thread.sleep(2000);
        Alert confirmAlert = driver.switchTo().alert();
        System.out.println(confirmAlert.getText());
        confirmAlert.dismiss();

        Thread.sleep(2000);
        // prompt / Prompt Box
        driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
        Thread.sleep(2000);
        Alert promptAlert = driver.switchTo().alert();
        promptAlert.sendKeys("Prompt Text");
        promptAlert.accept();

    }
}
