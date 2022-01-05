package com.syntax.POM.utils;

import com.syntax.POM.testBase.BaseClass;
import org.openqa.selenium.WebElement;

public class CommonMethods extends BaseClass {

    /*
    * sends text to a given Element
    * @param element --> webElement
    * @param text --> the text that you want to send
    */
    public static void sentText(WebElement element, String text){
        element.clear();
        element.sendKeys(text);
    }

    /*
     * this method is used to switch frames
     * @param index
     */
    public void switchToFrame(int index){
        driver.switchTo().frame(index);
    }
}
