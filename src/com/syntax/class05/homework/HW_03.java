package com.syntax.class05.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW_03 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://fb.com");

        // click on "create new account" page
        WebElement newAccount = driver.findElement(By.xpath("//a[text()='Create new account']"));
        newAccount.click();
        Thread.sleep(3000);

        // Fill out the whole form
        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys("Johnny");
        WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys("English");

        WebElement mobEmail = driver.findElement(By.xpath("//input[@name='reg_email__']"));
        mobEmail.sendKeys("+380687423344");
        WebElement passWord = driver.findElement(By.cssSelector("input#password_step_input"));
        passWord.sendKeys("pass123eng654");

        WebElement dropDownMonth = driver.findElement(By.cssSelector("select#month"));
        new Select(dropDownMonth).selectByValue("10");

        WebElement dropDownDay = driver.findElement(By.cssSelector("select#day"));
        new Select(dropDownDay).selectByValue("14");

        WebElement dropDownYear = driver.findElement(By.cssSelector("select#year"));
        new Select(dropDownYear).selectByValue("1984");

        WebElement radioBtn = driver.findElement(By.xpath("//input[@value='1']"));
        radioBtn.click();

        // Click signup
        WebElement signupBtn = driver.findElement(By.xpath("//button[@name='websubmit']"));
        signupBtn.click();

        Thread.sleep(4000);

    }
}
