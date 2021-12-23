package com.syntax.class08.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HW_02 {
   /* goto https://chercher.tech/practice/implicit-wait-example
    the checkbox take 10 seconds to populate
    use implicit wait to check only the first checkbox that populates
    close the browser */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://chercher.tech/practice/implicit-wait-example");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//div[@id='q']/input[1]")).click();

        driver.quit();
    }
}
