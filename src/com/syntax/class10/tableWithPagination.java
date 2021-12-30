package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class tableWithPagination {
    public static String url = "http://syntaxprojects.com/table-pagination-demo.php";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        //print the row that contains the student name "Archy J"
        // 1. local the table rows
        List<WebElement> tableRows = driver.findElements(By.cssSelector("table.table-hover tr"));
        // 1.2 locate the next button on the table
        WebElement nextBtn = driver.findElement(By.xpath("//a[@class='next_link']"));

        // 2. iterate over the list and see if the desired row is there or nor

        int i = 1;
        boolean notFound = true;
        while (notFound) {
            for (WebElement row : tableRows) {
                String textOfRow = row.getText();
                if (textOfRow.contains("Archy J")) {
                    System.out.println(textOfRow);
                    System.out.println(": the page number is : " + i);
                    notFound = false;
                    break;
                }
            }
            if (notFound) {
                nextBtn.click();
                i++;
            }
        }

    }
}
