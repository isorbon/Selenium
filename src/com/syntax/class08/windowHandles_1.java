package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class windowHandles_1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp&hl=en");
        driver.manage().window().maximize();

        // get the address/handle of the page/window
        String signUpPageHandle = driver.getWindowHandle();
        System.out.println("The window handle for signup page is: " + signUpPageHandle);

        //locate the btns help, privacy, term
        WebElement helpBtn = driver.findElement(By.xpath("//a[text()='Help']"));
        WebElement privacyBtn = driver.findElement(By.xpath("//a[text()='Privacy']"));
        WebElement termBtn = driver.findElement(By.xpath("//a[text()='Terms']"));

        //click on them to open up new Windows
        helpBtn.click();
        privacyBtn.click();
        termBtn.click();

        // we haven't switched the focus, so it is still on the main/home/signup page
        Set<String> allWindowsHandles = driver.getWindowHandles();
        //print the size of allWindowsHandles
        System.out.println("Number of windows handles is: " + allWindowsHandles.size());

        //in order to print all windows handles we need to iterate over the SET
        Iterator<String> iterator = allWindowsHandles.iterator();
        while (iterator.hasNext()) {
            //switch ti terms page
            String handle = iterator.next();
            //now switch to this particular handle/window
            driver.switchTo().window(handle);
            // I need to make sure this is my desired window/tab
            String title = driver.getTitle();
            if (title.equalsIgnoreCase("Google Terms of Service – Privacy & Terms – Google")) {
                System.out.println(title);
                break;
            }
        }


    }
}
