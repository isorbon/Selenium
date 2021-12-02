package com.syntax.class02.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork01 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("Sorbon");
        driver.findElement(By.id("customer.lastName")).sendKeys("Imomnazarov");
        driver.findElement(By.id("customer.address.street")).sendKeys("4, Bohdanivska");
        driver.findElement(By.id("customer.address.city")).sendKeys("Kyiv");
        driver.findElement(By.id("customer.address.state")).sendKeys("Kyiv");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("03049");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("+380974058883");
        driver.findElement(By.id("customer.ssn")).sendKeys("523976651");
        driver.findElement(By.id("customer.username")).sendKeys("isorbon");
        driver.findElement(By.id("customer.password")).sendKeys("69sasfca9s6");
        driver.findElement(By.id("repeatedPassword")).sendKeys("69sasfca9s6");
        driver.findElement(By.cssSelector("input[value='Register']")).click();
        Thread.sleep(3000);
        driver.quit();
    }
}
