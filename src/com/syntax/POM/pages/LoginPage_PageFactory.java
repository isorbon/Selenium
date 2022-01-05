package com.syntax.POM.pages;

import com.syntax.POM.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PageFactory extends CommonMethods {
    // public WebElement username = driver.findElement(By.id("username"));
    // we can use instead this method PageFactory method '@Findby'. Instead, 1 long line we do 2 short lines
    @FindBy(id = "txtUsername")  // xpath, id, cssSelector and etc.
    public WebElement username;

    @FindBy(id = "txtPassword")
    public WebElement password;

    @FindBy(id = "btnLogin")
    public WebElement loginBtn;

//  initElements() - method for initialize all the webElements located by @FindBy
    public LoginPage_PageFactory(){ // constructor
        PageFactory.initElements(driver, this);
    }


}
