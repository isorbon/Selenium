package com.syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Calendars {
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

        // navigate to Leave -> Employee List page
        driver.findElement(By.cssSelector("a#menu_leave_viewLeaveModule")).click();

        // ******************** dealing with Calendars **********************
        // open the calendar
        driver.findElement(By.cssSelector("input#calFromDate")).click();

        // select month
        WebElement month = driver.findElement(By.cssSelector("select.ui-datepicker-month"));
        // use Select class
        Select select = new Select(month);
        select.selectByVisibleText("Aug");

        // select the year
        WebElement year = driver.findElement(By.cssSelector("select.ui-datepicker-year"));
        Select selectYear = new Select(year);
        selectYear.selectByValue("2012");

        // select the day
        List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));

        for (WebElement date:dates) {

            String dateText = date.getText();
            if (dateText.equals("15")){
                date.click();
            }
        }

    }
}
