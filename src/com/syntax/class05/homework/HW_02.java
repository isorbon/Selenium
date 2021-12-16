package com.syntax.class05.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW_02 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        // Enter valid username
        WebElement userName = driver.findElement(By.cssSelector("input#txtUsername"));
        userName.sendKeys("Admin");
        // Leave password field empty
        WebElement passWord = driver.findElement(By.cssSelector("input#txtPassword"));
        passWord.sendKeys("");
        // Click on login button
        WebElement loginBtn = driver.findElement(By.cssSelector("input#btnLogin"));
        loginBtn.click();
        // Verify error message with text “Password cannot be empty” is displayed.
        WebElement message = driver.findElement(By.cssSelector("span#spanMessage"));
        System.out.println(message.getText());

        Thread.sleep(2000);
        driver.quit();
    }
}
