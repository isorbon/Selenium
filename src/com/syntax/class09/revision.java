package com.syntax.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class revision {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://facebook.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        driver.findElement(By.partialLinkText("Create")).click();

        driver.findElement(By.name("firstname")).sendKeys("Homer");
        driver.findElement(By.name("lastname")).sendKeys("Simpson");
        driver.findElement(By.name("reg_email__")).sendKeys("homer@simpson.com");

        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("homer@simpson.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("pass1234");

        //Finding Dropdowns
        WebElement month=driver.findElement(By.cssSelector("select#month"));
        month.click();
        Select selectM=new Select(month);

        selectM.selectByVisibleText("Jan");
        WebElement day=driver.findElement(By.cssSelector("select#day"));
        Select selectD=new Select(day);
        selectD.selectByVisibleText("17");
        WebElement year=driver.findElement(By.cssSelector("select#year"));
        Select selectY=new Select(year);
        selectY.selectByVisibleText("1987");

        //Click male Radio button
        WebElement maleRadio=driver.findElement(By.xpath("(//input[@name='sex'])[2]"));
        maleRadio.click();

// driver.findElement(By.name("websubmit")).click();


    }
}
