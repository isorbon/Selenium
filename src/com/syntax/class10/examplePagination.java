package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class examplePagination {
    public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        // login
        driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
        driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.cssSelector("input#btnLogin")).click();

        // navigate to PIM -> Employee List page
        driver.findElement(By.cssSelector("a#menu_pim_viewPimModule")).click();
        driver.findElement(By.cssSelector("a#menu_pim_viewEmployeeList")).click();

        // ----------------------dealing with the table --------------------
        // look for id 26335A
        // 1. locate the table
        List<WebElement> tableRows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));

        // 1.2. locate the next button
        WebElement nextBtn = driver.findElement(By.xpath("(//a[text()='Next'])[1]"));

        // 2. iterate through the list and look for the required id 26335A

        // declare a boolean tha will be a flag to control
        boolean notFound = true;
        int j = 1;
        while (notFound) {
            // relocate the rows after the page is refreshed to avoid state element exception
            tableRows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));

            for (int i = 0; i < tableRows.size(); i++) {
                String text = tableRows.get(i).getText();
                if (text.contains("26335A")) {
                    System.out.println("We found the data on page: " + j);
                    // we found the data, and we stop the loop and say to next btn not to click
                    notFound = false;
                    // check the checkbox associate with the id
                    driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (i + 1) + "]/td/input")).click();
                    break;
                }
            }
            if (notFound) {
                // relocate the next button after the page is refreshed to avoid state element exception
                nextBtn = driver.findElement(By.xpath("(//a[text()='Next'])[1]"));
                // click on next btn if the data is not found
                nextBtn.click();
                j++;
            }
        }
    }
}

