package com.syntax.Review03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Class1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/basic-radiobutton-demo.php");
        driver.manage().window().maximize();

        WebElement radioBtn = driver.findElement(By.xpath("(//*[@value='Male'])[2]"));
        System.out.println(radioBtn.isDisplayed());

        System.out.println(radioBtn.isEnabled());

        if (radioBtn.isEnabled()){
            radioBtn.click();
        }

        driver.quit();

    }

}
