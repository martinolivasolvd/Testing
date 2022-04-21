package net.phptravels.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class DashboardPage extends AbstractPage {

    @FindBy(tagName = "h2")
    private ExtendedWebElement messageTitle;

    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    public void compareTitle() {
        if (!driver.getTitle().equals("Hi, Demo Welcome Back")) {
            throw new IllegalStateException("This is not the dashboard of logged in user," +
                    " current page is: " + driver.getCurrentUrl());
        }
    }

    public String getMessageText() {
        return messageTitle.getText();
    }
}