package net.phptravels.gui.login;

import java.lang.invoke.MethodHandles;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import net.phptravels.gui.components.Topbar;


public class HomePage extends AbstractPage {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @FindBy(xpath = "//div/nav/ul")
    private Topbar topbar;
    
    @FindBy(id = "select2-tours_city-container")
    private ExtendedWebElement destinationCombobox;
    
    @FindBy(name = "checkin")
    private ExtendedWebElement checkinDate;
    
    @FindBy(name = "checkout")
    private ExtendedWebElement checkoutDate;
    
    @FindBy(xpath = "//a[text()= 'Rooms ']")
    private ExtendedWebElement travellersCombobox;
    
    @FindBy(id = "submit")
    private ExtendedWebElement searchButton;

    @FindBy(xpath ="//button[text()= ' Hotels']")
    private ExtendedWebElement hotelButton;
    
    @FindBy(xpath = "//button[text()= ' flights']")
    private ExtendedWebElement flightButton;
    
    @FindBy(id = "tours-tab")
    private ExtendedWebElement toursButton;
    
    @FindBy(id = "visa-tab")
    private ExtendedWebElement visaButton;
    
    @FindBy(id = "one-way")
    private ExtendedWebElement oneWayRadiobutton;
    
    @FindBy(id = "round-trip")
    private ExtendedWebElement roundTripRadioButton;
    
    @FindBy(id = "flight_type")
    private ExtendedWebElement flightTypeDropdown;
    
    @FindBy(id = "autocomplete")
    private ExtendedWebElement flyingFromCombobox;
    
    @FindBy(id = "autocomplete2")
    private ExtendedWebElement flyingToCombobox;
    
    @FindBy(name = "depart")
    private ExtendedWebElement departureDate;
    
    @FindBy(xpath ="//a//span[text()= '1']")
    private ExtendedWebElement passengersDropdown;
    
    @FindBy(id = "flights-search")
    private ExtendedWebElement searchFlightButton;
    
    @FindBy(xpath ="//span[text()= ' Search by City']")
    private ExtendedWebElement destinationTextbox;
    
    @FindBy(id = "date")
    private ExtendedWebElement toursDate;
    
    @FindBy(xpath = "//a//p[text()= 'Travellers ']")
    private ExtendedWebElement travellersDropdown;
    
    @FindBy(id = "select2-from_country-container")
    private ExtendedWebElement fromCountryTextbox;
    
    @FindBy(id = "select2-to_country-container")
    private ExtendedWebElement toCountryTextbox;
    
    @FindBy(xpath ="//div[text()= '28-04-2022']")
    private ExtendedWebElement visaDate;
    
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public Topbar topbar() {
        return topbar;
    }

}