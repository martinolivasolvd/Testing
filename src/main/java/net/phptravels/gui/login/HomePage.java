package net.phptravels.gui.login;

import java.lang.invoke.MethodHandles;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.qaprosoft.carina.core.foundation.utils.Configuration;
import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.components.FooterMenu;
import com.qaprosoft.carina.demo.gui.components.ModelItem;
import com.qaprosoft.carina.demo.gui.components.WeValuePrivacyAd;
import com.qaprosoft.carina.demo.gui.pages.BrandModelsPage;

public class HomePage extends AbstractPage {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @FindBy(xpath = "//div/nav/ul")
    private FooterMenu footerMenu;
    
    @FindBy(id = "select2-tours_city-container")
    private ExtendedWebElement destinationCombobox;
    
    @FindBy(name = "checkin")
    private ExtendedWebElement checkinDate;
    
    @FindBy(name = "checkout")
    private ExtendedWebElement checkoutDate;
    
    @FindBy(xpath = "//div/a[@class='dropdown-toggle dropdown-btn travellers waves-effec'")
    private ExtendedWebElement travellersCombobox;
    
    @FindBy(id = "submit")
    private ExtendedWebElement searchButton;

    @FindBy(xpath = "//div/ul/li/button[1]")
    private ExtendedWebElement hotelButton;
    
    @FindBy(xpath = "//div/ul/li/button[2]")
    private ExtendedWebElement flightButton;
    
    @FindBy(id = "tours-tab")
    private ExtendedWebElement toursButton;
    
    @FindBy(id = "visa-tab")
    private ExtendedWebElement visaButton;
    
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public FooterMenu getFooterMenu() {
        return footerMenu;
    }

}