package com.syntax.class04.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW02 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();

        WebElement userName = driver.findElement(By.xpath("//div[@id='divUsername']/input"));
        userName.sendKeys("Admin");
        WebElement passWord = driver.findElement(By.xpath("//div[@id='divPassword']/input"));
        passWord.sendKeys("Hum@nhrm456");
        WebElement loginBtn = driver.findElement(By.xpath("//div[@id='divLoginButton']/input"));
        loginBtn.click();
        Thread.sleep(2000);
        WebElement message = driver.findElement(By.xpath("//div[@id='divLoginButton']/span"));
        System.out.println(message.getText());

        driver.quit();
    }
}
