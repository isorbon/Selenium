package com.syntax.class12.pages;

import com.syntax.class12.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory extends CommonMethods {
    @FindBy(id = "txtUsername") public WebElement username;
    @FindBy(id = "txtPassword") public WebElement password;
    @FindBy(id = "btnLogin") public WebElement btnLogin;

    public LoginPageFactory(){
        PageFactory.initElements(driver, this);
    }
}
