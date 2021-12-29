package com.syntax.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class StaticWebTable {
    public static String url = "https://syntaxprojects.com/table-search-filter-demo.php";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        // print all the rows of the webtable in the console

        // 1. locate the rows in the table using xpath and save it in a variable
        List<WebElement> tableRows = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
        // print the number of rows
        System.out.println("The number of rows in the table are: " + tableRows.size());

        // 2. iterate through each webElement and get the text out of it
        for (WebElement row:tableRows
             ) {
            String text = row.getText();
            System.out.println(text);
        }

        System.out.println("***************************");

        // 3. print all the headers
        List<WebElement> headers = driver.findElements(By.xpath("//table[@id='task-table']/thead/tr"));
        for (WebElement head:headers
             ) {
            String textHeader = head.getText();
            System.out.println(textHeader);
        }

        System.out.println("***************************");

        // 4. print just the second column
        // locate the column using a locator
        List<WebElement> column2 = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td[2]"));
        for (WebElement col2:column2
             ) {
            System.out.println("the data of column 2: " + col2.getText());
        }


    }
}
