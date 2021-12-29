package com.syntax.class09.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HW_02 {

    public static String url = "http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        //and delete all the entries which have product 'my money' and lives in 'us' state

        // login to the website
        driver.findElement(By.cssSelector("input#ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.cssSelector("input#ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.cssSelector("input#ctl00_MainContent_login_button")).click();

        // get all the rows
        List<WebElement> rows = driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr"));

        for (int i = 1; i < rows.size(); i++) {
            // get the text
            String rowText = rows.get(i).getText();

            // check the checkbox if the row has the product 'MyMoney' or 'US'
            if (rowText.contains("MyMoney") && rowText.contains("US")) {
                List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
                checkBoxes.get(i - 1).click();
            }
        }
        // deleting the entries
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        // print info about solving the task
        System.out.println("The selected entries have been deleted");
        driver.quit();
    }
}
