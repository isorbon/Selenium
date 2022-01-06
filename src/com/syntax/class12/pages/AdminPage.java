package com.syntax.class12.pages;

import com.syntax.class12.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage extends CommonMethods {
    @FindBy(css = "a#menu_admin_viewAdminModule") public WebElement adminURL;
    @FindBy(css = "input#searchSystemUser_userName")  public WebElement inputSearch;
    @FindBy(css = "select#searchSystemUser_userType") public WebElement select;
    @FindBy(css = "input#searchBtn") public WebElement searchBtn;


    public AdminPage(){
        PageFactory.initElements(driver, this);
    }
}
