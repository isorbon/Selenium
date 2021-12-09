package com.syntax.class02.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork02 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://facebook.com");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Johnnn");
        driver.findElement(By.name("lastname")).sendKeys("Golddd");
        driver.findElement(By.name("reg_email__")).sendKeys("john_gggol13@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("john_gggol13@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("sccas8v56sdvs");
        driver.findElement(By.name("birthday_month")).sendKeys("Mar");
        driver.findElement(By.name("birthday_day")).sendKeys("23");
        driver.findElement(By.name("birthday_year")).sendKeys("1984");
        driver.findElement(By.cssSelector("input[value='2']")).click();
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("img[class='_8idr img']")).click();
        Thread.sleep(5000);
        driver.quit();

    }
}
