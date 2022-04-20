package net.phptravels.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

import net.phptravels.gui.components.Topbar;

public class VisaFormSuccessPage extends AbstractPage {

    @FindBy(xpath = "//header[@class ='header-area']")
    private Topbar topbar;

    @FindBy(xpath = "//h2[text() ='Your visa form has been submitted']")
    private ExtendedWebElement messageTitle;

    public VisaFormSuccessPage(WebDriver driver) {
        super(driver);
    }
    public boolean isVisaFormSubmittedMessagePresent() {
        return messageTitle.isElementPresent();
        }
    }



