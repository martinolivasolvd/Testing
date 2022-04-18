package net.phptravels.gui.components;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.gui.pages.HomePage;

public class Topbar extends AbstractUIObject {
	
	@FindBy(linkText = "Home")
    private ExtendedWebElement homeLink;

    @FindBy(linkText = "Hotels")
    private ExtendedWebElement hotelsLink;
    
    @FindBy(linkText = "Flights")
    private ExtendedWebElement flightsLink;
    
    @FindBy(linkText = "Tours")
    private ExtendedWebElement toursLink;
    
    @FindBy(linkText = "Visa")
    private ExtendedWebElement visaLink;
    
    @FindBy(linkText = "Blog")
    private ExtendedWebElement blogLink;
    
    @FindBy(linkText = "Offer")
    private ExtendedWebElement offerLink;

    @FindBy(linkText = "Company")
    private ExtendedWebElement companyLink;
    
    @FindBy(xpath = "//a[contains(text(),'Signup')]")
    private ExtendedWebElement signupButton;
    
    @FindBy(xpath = "//a[contains(text(),'Login')]")
    private ExtendedWebElement loginButton;

    public Topbar(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public HomePage openHomePage() {
        homeLink.click();
        return new HomePage(driver);
    }
}
