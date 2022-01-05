package com.syntax.POM.test;

import com.syntax.POM.pages.LoginPage;
import com.syntax.POM.testBase.BaseClass;
import com.syntax.POM.utils.CommonMethods;
import org.openqa.selenium.WebElement;

public class LoginPageTest {

    public static void main(String[] args) {
        // open the browser and navigate to url
        BaseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");

        // locate the Element and send Keys
        LoginPage loginPage = new LoginPage();
        WebElement username = loginPage.usernameField;
        CommonMethods.sentText(username, "Admin");
        WebElement password = loginPage.passwordFiled;
        CommonMethods.sentText(password, "Hum@nhrm123");
        loginPage.loginBtn.click();


      /* or we can write like this:
        loginPage.usernameField.sendKeys("Admin");
        loginPage.passwordFiled.sendKeys("Hum@nhrm123");
        loginPage.loginBtn.click(); */
    }
}
