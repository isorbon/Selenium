package com.syntax.class12.utils;

import com.syntax.class12.base.BaseClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;

public class CommonMethods extends BaseClass {

    public static void sendKeys(WebElement element, String text) {
        element.clear();
        element.sendKeys(text);
    }

    public static void printGetText(WebElement element) {
        System.out.println(element.getText());
    }

    public static void takeScreenShot(String fileName) {
        TakesScreenshot screen = (TakesScreenshot) driver;
        File sourceFile = screen.getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(sourceFile, new File("screenshots/login/" + fileName + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
