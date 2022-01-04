package com.syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class uploadFile {
    public static String url = "https://the-internet.herokuapp.com/upload";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        // locate the choose file button
        WebElement chooseFile = driver.findElement(By.cssSelector("input#file-upload"));

        // in order to upload the file from computer, we use sendKeys method
        chooseFile.sendKeys("C:\\Users\\DarAmal\\Selenium\\screenshots\\login\\adminlogin.png");

        // locate to submit btn and click upload
        driver.findElement(By.cssSelector("input#file-submit")).click();

    }
}
