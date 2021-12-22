package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class windowHandle {
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
        signUpPageHandle = iterator.next();
        String helpPageHandle = iterator.next();
        String privacyPageHandle = iterator.next();
        String termPageHandle = iterator.next();

        System.out.println("The handles for signup page is: " + signUpPageHandle);
        System.out.println("The handles for help page is: " + helpPageHandle);
        System.out.println("The handles for privacy page is: " + privacyPageHandle);
        System.out.println("The handles for term page is: " + termPageHandle);

        //switch to help page
        driver.switchTo().window(helpPageHandle);
        System.out.println(driver.getTitle());

        // driver.quit();

    }
}
