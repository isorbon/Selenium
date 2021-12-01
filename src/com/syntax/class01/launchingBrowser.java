package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchingBrowser {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        //return the current url loaded in the browser
        String url = driver.getCurrentUrl();
        System.out.println("The current URL loaded in browser is : " + url);

        //return the title of the current page in the browser
        String title = driver.getTitle();
        System.out.println("The current title of the page is : " + title);

        //close the browser
        driver.quit();

    }
}
