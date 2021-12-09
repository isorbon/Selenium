package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cssSelector {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "Driver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://syntaxprojects.com/basic-first-form-demo.php");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("input#sum1")).sendKeys("25");
        driver.findElement(By.cssSelector("input#sum2")).sendKeys("15");
        driver.findElement(By.cssSelector("button[onclick $= 'total()']")).click();
        WebElement result = driver.findElement(By.cssSelector("span#displayvalue"));
        System.out.println(result.getText());

        driver.quit();
    }
}
