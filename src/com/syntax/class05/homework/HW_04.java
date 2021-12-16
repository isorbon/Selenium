package com.syntax.class05.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW_04 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");

        Thread.sleep(2000);

        // get All Categories and print them in the console
        List<WebElement> list = driver.findElements(By.cssSelector("select#gh-cat option"));

        String selectedCategory = "Computers/Tablets & Networking";
        for (WebElement getCategories:list){
            String textOfCategory = getCategories.getText();
            System.out.println(textOfCategory);

            // select Computers/Tablets & Networking
            if (textOfCategory.equalsIgnoreCase(selectedCategory)){
                getCategories.click();
            }
        }
        Thread.sleep(2000);
        // click on search
        WebElement searchBtn = driver.findElement(By.xpath("//input[@value='Search']"));
        searchBtn.click();

        Thread.sleep(2000);
        System.out.println("-------------------------------");

        // verify the title of page
        String pageTitle = driver.getTitle();
        if (pageTitle.equalsIgnoreCase(selectedCategory)){
            System.out.println("The Title of Page is the same with Category name");
        }else {
            System.out.println("The title of page does not match with Category name");
        }

        Thread.sleep(2000);

        driver.quit();
    }
}
