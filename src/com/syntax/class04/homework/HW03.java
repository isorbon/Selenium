package com.syntax.class04.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HW03 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "Driver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://syntaxprojects.com/input-form-demo.php");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("input[name *= 'first']")).sendKeys("John");
        driver.findElement(By.cssSelector("input[name *= 'last']")).sendKeys("Bold");
        driver.findElement(By.cssSelector("input[name = 'email']")).sendKeys("jbold@gmail.com");
        driver.findElement(By.cssSelector("input[name = 'phone']")).sendKeys("+1325875683");
        driver.findElement(By.cssSelector("input[name = 'address']")).sendKeys("42, 546 str.");
        driver.findElement(By.cssSelector("input[name = 'city']")).sendKeys("Miami");
        driver.findElement(By.cssSelector("select.form-control")).click();
        driver.findElement(By.xpath("//select[contains(@class,'form-control')]/option[11]")).click();
        driver.findElement(By.cssSelector("input[name='zip']")).sendKeys("3256");
        driver.findElement(By.cssSelector("input[name='website']")).sendKeys("www.jbold.com");
        driver.findElement(By.cssSelector("input[value = 'yes']")).click();
        driver.findElement(By.cssSelector("textarea[name = 'comment']")).sendKeys("Just test text. Just test text. " +
                "Just test text. Just test text. Just test text. Just test text.");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button.btn[type= 'submit']")).click();
        Thread.sleep(3000);
        driver.quit();
    }
}
