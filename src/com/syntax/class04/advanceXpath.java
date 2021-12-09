package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class advanceXpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        WebElement userName = driver.findElement(By.xpath("//span[text()='Username']/preceding-sibling::input"));
        userName.sendKeys("Admin");

        WebElement password = driver.findElement(By.xpath("//div[@id='divPassword']/input"));
        password.sendKeys("Hum@nhrm123");

        WebElement lgnBtn = driver.findElement(By.xpath("//input[starts-with(@value, 'LOGIN')]"));
        lgnBtn.click();
    }
}
