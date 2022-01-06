package com.syntax.class12.utils;

import com.syntax.class12.base.BaseClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;

public class CommonMethods extends BaseClass {

//    sendKeys() method
    public static void sendKeys(WebElement element, String text) {
        element.clear();
        element.sendKeys(text);
    }
//    print getText() method
    public static void printGetText(WebElement element) {
        System.out.println(element.getText());
    }

//     select by VisibleText
    public static void dropDownByText(WebElement element, String text){
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }

//     take a screenshot
    public static void takeScreenShot(String folderName, String fileName) {
        TakesScreenshot screen = (TakesScreenshot) driver;
        File sourceFile = screen.getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(sourceFile, new File("screenshots/" + folderName + "/" + fileName + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
