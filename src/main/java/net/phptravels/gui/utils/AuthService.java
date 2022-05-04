package net.phptravels.gui.utils;


import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.webdriver.IDriverPool;
import net.phptravels.gui.pages.DashboardPage;
import net.phptravels.gui.pages.HomePage;
import net.phptravels.gui.pages.LoginPage;

import org.testng.Assert;


public class AuthService implements IDriverPool {

    public DashboardPage loginFillForm(String email,String password) {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.setEmailField(email);
        loginPage.setPasswordField(password);
        loginPage.clickLoginButton();

        return new DashboardPage(getDriver());
    }
}
