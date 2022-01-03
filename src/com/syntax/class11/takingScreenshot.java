package com.syntax.class11;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class takingScreenshot {
    public static String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        // login to the website
        WebElement username = driver.findElement(By.cssSelector("input#ctl00_MainContent_username"));
        WebElement password = driver.findElement(By.cssSelector("input#ctl00_MainContent_password"));

        // using the KEYS
        username.sendKeys("Tester", Keys.TAB);
        password.sendKeys("test", Keys.ENTER);

        // taking the screenshot
        TakesScreenshot ts = (TakesScreenshot) driver;
        // to take the screenshot, this step takes the screenshot
        File sourceFile = ts.getScreenshotAs(OutputType.FILE);

        // save the screenshot in our computer
        try {
            // copy the screenshot to a new directory inside the project and
            // give the path to that particular screenshot
            FileUtils.copyFile(sourceFile, new File("screenshot/login/adminlogin.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
