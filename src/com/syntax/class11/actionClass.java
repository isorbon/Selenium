package com.syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class actionClass {
    public static String url = "https://jqueryui.com/droppable/";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        driver.switchTo().frame(0);
        // locate the draggable
        WebElement draggable = driver.findElement(By.cssSelector("div#draggable"));
        // locate the dropOff location
        WebElement dropOff = driver.findElement(By.cssSelector("div#draggable"));

        Actions action = new Actions(driver);
        // drag the source to drop off
        // action.dragAndDrop(draggable,dropOff).perform();

        // whenever more than two methods used build
        action.clickAndHold(draggable).moveToElement(dropOff).release().build().perform();

    }
}
