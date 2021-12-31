package com.syntax.Review03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Class2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/basic-checkbox-demo.php");
        driver.manage().window().maximize();

        WebElement checkBox = driver.findElement(By.xpath("//*[@value='Option-1']"));

        if (checkBox.isSelected()){
            System.out.println("It is already selected");
        }else {
            checkBox.click();
        }

        Thread.sleep(2000);
        driver.quit();

    }
}
