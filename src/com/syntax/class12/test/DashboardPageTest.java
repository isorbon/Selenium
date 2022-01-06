package com.syntax.class12.test;

import com.syntax.class12.base.BaseClass;
import com.syntax.class12.pages.DashboardPage;
import com.syntax.class12.pages.LoginPageFactory;
import com.syntax.class12.utils.CommonMethods;
import org.openqa.selenium.WebElement;

public class DashboardPageTest {
    public static void main(String[] args) {

        BaseClass.openURL("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");

        LoginPageFactory loginPF = new LoginPageFactory();
        WebElement username = loginPF.username;
        CommonMethods.sendKeys(username, "Admin");
        WebElement password = loginPF.password;
        CommonMethods.sendKeys(password, "Hum@nhrm123");
        loginPF.btnLogin.click();

        DashboardPage dashboardPage = new DashboardPage();
        WebElement welcomeElem = dashboardPage.welcome;
        CommonMethods.printGetText(welcomeElem);

        CommonMethods.takeScreenShot("hrms", "dashboard");

    }
}
