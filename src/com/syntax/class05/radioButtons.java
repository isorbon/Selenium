package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class radioButtons {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "Driver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://syntaxprojects.com/basic-radiobutton-demo.php");
        driver.manage().window().maximize();

        //getting the radiobutton
        WebElement femaleRadioBtn = driver.findElement(By.xpath("//input[@value = 'Female'][@name='optradio']"));
        // femaleRadioBtn.click();

        //check if the radio btn is displayed
        boolean isDisplayed = femaleRadioBtn.isDisplayed();
        System.out.println("The female radio Btn is Displayed on the webpage: " + isDisplayed);

        //check if the radio btn is enabled
        boolean isEnabled = femaleRadioBtn.isEnabled();
        System.out.println("The female radio Btn is Enabled on the webpage: " + isEnabled);

        //check if the radio btn is selected
        boolean isSelected = femaleRadioBtn.isSelected();
        System.out.println("The female radio Btn is Selected on the webpage: " + isSelected);

        //Select the female the radio btn only if its Enabled
        if(isEnabled){
            femaleRadioBtn.click();
        }
        // after clicking the radio btn if its Selected or not
        isSelected=femaleRadioBtn.isSelected();
        System.out.println("The female radio Btn is Selected on the webpage: " + isSelected);

        driver.quit();
    }
}
