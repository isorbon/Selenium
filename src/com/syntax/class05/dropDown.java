package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

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
        //select.selectByValue("Friday");

// select by .getOptions and gets all from tag Option
        List<WebElement> allOptions = select.getOptions();
        int Size = allOptions.size();
        System.out.println(Size);

        // iterate through list all options and get the text of each option
     /*   for (WebElement all:allOptions) {
            System.out.println(all.getText());
        }*/
        //or do like this:
        for (int i=1; i<Size; i++){
            String optionText = allOptions.get(i).getText();
            System.out.println(optionText);
        }

    }
}
