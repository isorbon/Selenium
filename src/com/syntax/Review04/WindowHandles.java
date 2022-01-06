package com.syntax.Review04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowHandles {
    public static String url = "https://accounts.google.com/signin/v2/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

//            click on the facebook link to open up a new facebook tab/ window
        WebElement fb = driver.findElement(By.xpath("//a[text()='Terms']"));
        fb.click();

// print or get the handle of default page

        String mainPageHandle = driver.getWindowHandle();
        System.out.println("The current page handle is " + mainPageHandle);

//           to switch to terms page and click on overview
//            get all the windows handles
//            select the one associated with Terms window
//            switch to it and click on overview
        Set<String> allHandles = driver.getWindowHandles();

//            find the one associated with page terms

        Iterator<String> it = allHandles.iterator();
        while (it.hasNext()) {
//                get the window from set
            String handle = it.next();
//                check it if it is the required one?
//                a.switch to that window handle
            driver.switchTo().window(handle);
//                now check if it is the desired window
            if (driver.getCurrentUrl().equalsIgnoreCase("https://policies.google.com/terms?gl=PK&hl=en-GB")) {
                System.out.println(driver.getTitle());
                break;
            }

        }
        driver.findElement(By.xpath("//a[text()='Overview']")).click();
        driver.switchTo().defaultContent();

    }

}
