package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframes {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/frames");

        //switch to desired frame as our desired webElement is inside that frame
        driver.switchTo().frame("frame1");

        //getting the webElement
        WebElement text1 = driver.findElement(By.cssSelector("h1#sampleHeading"));
        System.out.println("the text is: " + text1.getText());

        // switch to original webpage
        driver.switchTo().defaultContent();

        // switch to frame2
        driver.switchTo().frame("frame2");

        WebElement text2 = driver.findElement(By.cssSelector("h1#sampleHeading"));
        System.out.println("the text2 is: " + text2.getText());

        // in order to click webElement "Form"
        // switch the focus

        
        driver.quit();
    }
}
