package com.syntax.Review02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Class1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/selenium/newtours/register.php");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        WebElement firstName = driver.findElement(By.xpath("//*[@name='firstName']"));
        firstName.clear();
        firstName.sendKeys("Hensha");

        WebElement lastName = driver.findElement(By.xpath(" //*[@name='lastName']"));
        lastName.clear();
        lastName.sendKeys("nicolae");

        WebElement phone = driver.findElement(By.cssSelector("input[name='phone']"));
        phone.clear();
        phone.sendKeys("4563231223");

        WebElement email = driver.findElement(By.cssSelector("input#userName"));
        email.clear();
        email.sendKeys("abc@123.com");

        WebElement address = driver.findElement(By.xpath("//*[@name='address1']"));
        address.clear();
        address.sendKeys("Large street");

        WebElement city = driver.findElement(By.xpath("//*[@name='city']"));
        city.clear();
        city.sendKeys("LA");

        WebElement state = driver.findElement(By.xpath("//*[@name='state']"));
        state.clear();
        state.sendKeys("CA");

        WebElement postalCode = driver.findElement(By.xpath("//*[@name='postalCode']"));
        postalCode.clear();
        postalCode.sendKeys("452003");

        WebElement country = driver.findElement(By.xpath("//*[@name='country']"));

        Select s = new Select(country);
        s.selectByVisibleText("UNITED STATES");

        WebElement username = driver.findElement(By.cssSelector("input#email"));
        username.clear();
        username.sendKeys("Hasim123");

        WebElement password = driver.findElement(By.xpath("//*[@name='password']"));
        password.clear();
        password.sendKeys("Test@123");

        WebElement confirmPassword = driver.findElement(By.xpath("//*[@name='confirmPassword']"));
        confirmPassword.clear();
        confirmPassword.sendKeys("Test@123");

        WebElement submitButton = driver.findElement(By.xpath("//*[@name='submit']"));
        submitButton.click();

     //   WebElement notificationMessage =  driver.findElement(By.cssSelector("td p:nth-child(2) font"));
        WebElement notificationMessage =  driver.findElement(By.xpath("//font[contains(text(),'Thank you')]"));
        WebElement notificationMessage1 =  driver.findElement(By.xpath("//b[contains(text(),'Your user name')]"));

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        if(notificationMessage.isDisplayed()){
            System.out.println("Task is done");
        }else{
            System.out.println("work more and fix it");
        }

        driver.quit();


    }
}
