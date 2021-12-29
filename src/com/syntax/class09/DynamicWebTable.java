package com.syntax.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DynamicWebTable {
    public static String url = "http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        // print all the rows of the webtable in the console

        // login to the website
        driver.findElement(By.cssSelector("input#ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.cssSelector("input#ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.cssSelector("input#ctl00_MainContent_login_button")).click();

        // get all the rows
        List<WebElement> rows = driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr"));
        // print all the rows
        for (int i = 1; i < rows.size(); i++) {
            // get the text
            String rowText = rows.get(i).getText();
            System.out.println(rowText);

            // check the checkbox if the row has the product 'ScreenSaver'
            if (rowText.contains("ScreenSaver")) {
                List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
                checkBoxes.get(i - 1).click();
            }
        }

    }
}
