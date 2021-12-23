package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class implicitWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "Driver/geckodriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/dynamic-data-loading-demo.php");
        driver.manage().window().maximize();

        // declaring a implicit wait for finding elements
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        // 12-15 - it's max amount of time to wait before to get exception

        // find the btn to get new user
        WebElement getNewUser = driver.findElement(By.cssSelector("button#save"));
        getNewUser.click();

        // get new user first name
        WebElement firstName = driver.findElement(By.xpath("//div[@id='First-Name']/p"));
        System.out.println(firstName.getText());

        // get new user last name
        WebElement lastName = driver.findElement(By.xpath("//div[@id='Last-Name']/p"));
        System.out.println(firstName.getText());


    }
}
