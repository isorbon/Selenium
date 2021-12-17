package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;

public class multipleSelect {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "Driver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");

        // find the webElement drop down
        WebElement statesDD = driver.findElement(By.cssSelector("select#multi-select"));

        // we can use select class, so we  will make an object of select class
        Select select = new Select(statesDD);

        // check if the drop down is multiple
        boolean isMul = select.isMultiple();
        System.out.println(isMul);

        select.selectByIndex(2);
        Thread.sleep(2000);
        select.selectByVisibleText("Texas");
        Thread.sleep(2000);
        select.selectByValue("Ohio");
        Thread.sleep(2000);

        select.deselectByIndex(2);
        Thread.sleep(2000);
        select.deselectByVisibleText("Texas");
        Thread.sleep(2000);
        select.deselectByValue("Ohio");
        Thread.sleep(2000);
        select.deselectAll(); // deselectAll selected options

// to use iterator to get all the options text and print in console
        List<WebElement> option = select.getOptions();

        Iterator<WebElement> iterator = option.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().getText());
        }


    }
}
