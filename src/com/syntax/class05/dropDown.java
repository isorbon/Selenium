package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "Driver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();

     // find the drop down
        WebElement dropDownDays= driver.findElement(By.cssSelector("select#select-demo"));

        // use the select class to select from drop down
        Select select = new Select(dropDownDays);

// select the value od drop down by index
   /*   select.selectByIndex(1);
        Thread.sleep(2000);
        select.selectByIndex(2);
        Thread.sleep(2000);
        select.selectByIndex(7); */

// select by VisibleText
     /*   select.selectByVisibleText("Thursday"); */

// select by Value
        select.selectByValue("Friday");

    }
}
