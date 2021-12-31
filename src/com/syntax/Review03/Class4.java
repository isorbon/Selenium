package com.syntax.Review03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.uitestpractice.com/Students/Switchto");
        driver.manage().window().maximize();

        driver.switchTo().frame("frame1");
        WebElement text = driver.findElement(By.xpath("//*[@id='sampleHeading']"));
        String actualText = text.getText();
        System.out.println(actualText);

        driver.quit();

    }
}
