package com.syntax.class07;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class authenticationAlert {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // we used login: admin & pass: admin to access to the page
        // it automatically entered to the need page which use login/password
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");



    }
}
