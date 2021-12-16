package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class checkBoxes {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "Driver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");
        driver.manage().window().maximize();

        // check the first checkbox
        WebElement singleCheckBox = driver.findElement(By.cssSelector("input#isAgeSelected"));
        singleCheckBox.click();
        Thread.sleep(2000);
        //uncheck box
        singleCheckBox.click();

        // Task 2. check all the text boxes simultaneously
        List<WebElement> checkBoxes = driver.findElements(By.cssSelector("input.cb1-element"));
        // print the number of checkBoxes
        int size = checkBoxes.size();
        System.out.println("The total number of checkboxes: " + size);

        for (WebElement checkBox : checkBoxes) {
            // select the boxes with the text
            // get text by the attribute "value"
            String textOfBox = checkBox.getAttribute("value");
            System.out.println(textOfBox);

            //check only whose value is "Option-3"
            if(textOfBox.equalsIgnoreCase("Option-3")){
                checkBox.click();
            }
        }


    }
}
