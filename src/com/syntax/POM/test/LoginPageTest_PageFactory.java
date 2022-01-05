package com.syntax.POM.test;

import com.syntax.POM.pages.LoginPage_PageFactory;
import com.syntax.POM.testBase.BaseClass;

public class LoginPageTest_PageFactory {
    public static void main(String[] args) {

        // open the browser and navigate to url
        BaseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");

        // create an object of loginPageWithPageFactory
        LoginPage_PageFactory loginTPF = new LoginPage_PageFactory();
        loginTPF.username.sendKeys("Admin");
        loginTPF.password.sendKeys("HRM@nhrm123");
        loginTPF.loginBtn.click();

        // close browser
        BaseClass.tearDown();
    }
}
