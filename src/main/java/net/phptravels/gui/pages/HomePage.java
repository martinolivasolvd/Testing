package net.phptravels.gui.pages;

import java.lang.invoke.MethodHandles;

import com.qaprosoft.carina.core.foundation.utils.Configuration;
import com.qaprosoft.carina.core.foundation.utils.R;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.concurrent.TimeUnit;


import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import net.phptravels.gui.components.Topbar;


public class HomePage extends AbstractPage {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @FindBy(xpath = "//header[@class ='header-area']")
    private Topbar topbar;

    @FindBy(xpath = "//button[@id = 'hotels-tab']//span[text() = ' Hotels']")
    private ExtendedWebElement hotelButton;

    @FindBy(xpath = "//form[@id = 'hotels-search']//span[@data-select2-id = 1]")
    private ExtendedWebElement hotelDestinationCombobox;

    @FindBy(xpath = "//form[@id = 'hotels-search']//input[@id = 'checkin']")
    private ExtendedWebElement hotelCheckinDate;

    @FindBy(xpath = "//form[@id = 'hotels-search']//input[@id = 'checkout']")
    private ExtendedWebElement hotelCheckoutDate;

    @FindBy(xpath = "//form[@id = 'hotels-search']//a[@class ='dropdown-toggle dropdown-btn travellers waves-effect']")
    private ExtendedWebElement hotelTravellersCombobox;

    @FindBy(xpath = "//form[@id = 'hotels-search']//input[@id = 'rooms']")
    private ExtendedWebElement hotelRoomsInput;

    @FindBy(xpath = "//form[@id = 'hotels-search']//input[@id = 'adults']")
    private ExtendedWebElement hotelAdultsInput;

    @FindBy(xpath = "//form[@id = 'hotels-search']//input[@id = 'childs']")
    private ExtendedWebElement hotelChildsInput;

    @FindBy(xpath = "//form[@id = 'hotels-search']//select[@id = 'nationality']")
    private ExtendedWebElement hotelNationalitySelect;

    @FindBy(xpath = "//form[@id = 'hotels-search']//button[@type = 'submit']")
    private ExtendedWebElement hotelSearchButton;

    @FindBy(xpath = "//button[@id = 'hotels-tab']//span[text() = ' flights']")
    private ExtendedWebElement flightButton;

    @FindBy(xpath = "//div[@id = 'flights']//input[@id = 'one-way']")
    private ExtendedWebElement flightsOneWayRadiobutton;

    @FindBy(xpath = "//div[@id = 'flights']//input[@id = 'round-trip']")
    private ExtendedWebElement flightsRoundTripRadioButton;

    @FindBy(xpath = "//div[@id = 'flights']//select[@id = 'flight_type']")
    private ExtendedWebElement flightsTypeDropdown;

    @FindBy(xpath = "//input[@id = 'autocomplete']")
    private ExtendedWebElement flightsFlyingFromCombobox;

    @FindBy(xpath = "//input[@id = 'autocomplete2']")
    private ExtendedWebElement flightsFlyingToCombobox;

    @FindBy(xpath = "//div[@id = 'flights']//input[@class = 'depart form-control']")
    private ExtendedWebElement flightsDepartureDate;

    @FindBy(xpath = "//div[@id = 'flights']//a[@class = 'dropdown-toggle dropdown-btn waves-effect']")
    private ExtendedWebElement flightsPassengersDropdown;

    @FindBy(xpath = "//div[@id = 'flights']//input[@id = 'fadults']")
    private ExtendedWebElement flightsAdults;

    @FindBy(xpath = "//div[@id = 'flights']//input[@id = 'fchilds']")
    private ExtendedWebElement flightsChilds;

    @FindBy(xpath = "//div[@id = 'flights']//input[@id = 'finfant']")
    private ExtendedWebElement flightsInfants;

    @FindBy(xpath = "//div[@class='autocomplete-wrapper _1 row_1']//div[@class = 'autocomplete-location']")
    private ExtendedWebElement flightsFlyingFromSearchResult;

    @FindBy(xpath = "//div[@class='autocomplete-wrapper _1 row_2']//div[@class = 'autocomplete-location']")
    private ExtendedWebElement flightsFlyingToSearchResult;

    @FindBy(xpath = "//div[@id = 'flights']//button[@id = 'flights-search']")
    private ExtendedWebElement flightsSearchFlightButton;

    @FindBy(xpath = "//div//button[@id = 'tours-tab']")
    private ExtendedWebElement toursButton;

    @FindBy(xpath = "//form[@id = 'tours-search']//span[@data-select2-id = 3]")
    private ExtendedWebElement toursDestinationTextbox;

    @FindBy(xpath = "//form[@id = 'tours-search']//input[@id = 'date']")
    private ExtendedWebElement toursDate;

    @FindBy(xpath = "//form[@id = 'tours-search']//input[@id = 'tours_adults']")
    private ExtendedWebElement toursAdultsInput;

    @FindBy(xpath = "//form[@id = 'tours-search']//input[@id = 'tours_child']")
    private ExtendedWebElement toursChildsInput;

    @FindBy(xpath = "//form[@id = 'tours-search']//a[@class = 'dropdown-toggle dropdown-btn travellers waves-effect']")
    private ExtendedWebElement toursTravellersDropdown;

    @FindBy(xpath = "//form[@id = 'tours-search']//button[@id = 'submit']")
    private ExtendedWebElement toursSearchButton;

    @FindBy(xpath = "//div//button[@id = 'visa-tab']")
    private ExtendedWebElement visaButton;

    @FindBy(xpath = "//div[@id='visa']//span[@data-select2-id = 5]")
    private ExtendedWebElement visaFromCountryComboBox;

    @FindBy(xpath = "//div[@id='visa']//span[@data-select2-id = 7]")
    private ExtendedWebElement visaToCountryComboBox;

    @FindBy(xpath = "//div[@id='visa']//input[@id = 'date']")
    private ExtendedWebElement visaDate;

    @FindBy(xpath = "//div[@id='visa']//button[@type = 'submit']")
    private ExtendedWebElement visaSubmitButton;

    @FindBy(xpath = "//input[@class='select2-search__field']")
    private ExtendedWebElement universalInputField;

    @FindBy(xpath = "//span[@class='select2-results']//li")
    private ExtendedWebElement universalSearchResult;

    public HomePage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL(R.CONFIG.get(Configuration.Parameter.URL.getKey()));
    }

    public Topbar topbar() {
        return topbar;
    }


    public HotelsSearchResultPage hotelFillForm(String cityName, String checkin, String checkout, String rooms, String adults, String childs) {
        String nationality = "Argentina";
        hotelDestinationCombobox.click();
        universalInputField.type(cityName);
        pause(5);
        universalSearchResult.click();
        //hotelCheckinDate.click();
        //hotelCheckinDate.type(checkin);
        //hotelCheckoutDate.click();
        //hotelCheckoutDate.type(checkout);
        hotelTravellersCombobox.click();
        hotelRoomsInput.type(rooms);
        hotelAdultsInput.type(adults);
        hotelChildsInput.type(childs);
        hotelNationalitySelect.click();
        hotelNationalitySelect.select(nationality);
        hotelSearchButton.click();
        LOGGER.info("[HOTEL]Selected destination " + cityName + " in field destination");
        LOGGER.info("[HOTEL]Selected date " + checkin + " in field checkin");
        LOGGER.info("[HOTEL]Selected date " + checkout + " in field checkout");
        LOGGER.info("[HOTEL]Selected rooms " + rooms + " in field rooms");
        LOGGER.info("[HOTEL]Selected adults " + adults + " in field adults");
        LOGGER.info("[HOTEL]Selected childs " + childs + " in field childs");
        LOGGER.info("[HOTEL]Selected nationality " + nationality + " in field nationality");

        return new HotelsSearchResultPage(driver);
    }

    public FlightsSearchResultPage flightsFillForm(String flyingFrom, String flyingTo, String departureDate, String adults, String childs, String infants) {
        String ftype = "Business";
        flightButton.click();
        flightsRoundTripRadioButton.click();
        flightsFlyingFromCombobox.click();
        flightsFlyingFromCombobox.type(flyingFrom);
        flightsFlyingFromSearchResult.click();
        flightsFlyingToCombobox.click();
        flightsFlyingToCombobox.type(flyingTo);
        flightsFlyingToSearchResult.click();
        flightsDepartureDate.click();
        flightsDepartureDate.type(departureDate);
        flightsTypeDropdown.click();
        flightsTypeDropdown.select(ftype);
        flightsPassengersDropdown.click();
        flightsAdults.type(adults);
        flightsChilds.type(childs);
        flightsInfants.type(infants);
        flightsSearchFlightButton.click();
        LOGGER.info("[FLIGHTS]Selected city " + flyingFrom + " in field Flying from");
        LOGGER.info("[FLIGHTS]Selected city " + flyingTo + " in field Flying to");
        LOGGER.info("[FLIGHTS]Selected date " + departureDate + " in field Departure date");
        LOGGER.info("[FLIGHTS]Selected childs " + ftype + " in field childs");
        LOGGER.info("[FLIGHTS]Selected adults " + adults + " in field adults");
        LOGGER.info("[FLIGHTS]Selected childs " + childs + " in field childs");
        LOGGER.info("[FLIGHTS]Selected infants " + infants + " in field infants");

        return new FlightsSearchResultPage(driver);
    }

    public ToursSearchResultPage toursFillForm(String destination, String date, String adults, String childs) {
        toursButton.click();
        toursDestinationTextbox.click();
        universalInputField.type(destination);
        universalSearchResult.click();
        toursDate.click();
        toursDate.type(date);
        toursTravellersDropdown.click();
        toursAdultsInput.type(adults);
        toursChildsInput.type(childs);
        toursSearchButton.click();
        LOGGER.info("[TOURS]Selected destination " + destination + " in field destination");
        LOGGER.info("[TOURS]Selected date " + date + " in field date");
        LOGGER.info("[TOURS]Selected adults " + adults + " in field adults");
        LOGGER.info("[TOURS]Selected childs " + childs + " in field childs");

        return new ToursSearchResultPage(driver);
    }

    public VisaFormPage visaFillForm(String fromCountry, String toCountry, String date) {
        visaButton.click();
        visaFromCountryComboBox.click();
        universalInputField.type(fromCountry);
        universalSearchResult.click();
        visaToCountryComboBox.click();
        universalInputField.type(toCountry);
        universalSearchResult.click();
        visaDate.click();
        visaDate.type(date);
        visaButton.click();
        LOGGER.info("[VISA]Selected fromCountry " + fromCountry + " in field from Country");
        LOGGER.info("[VISA]Selected toCountry " + toCountry + " in field to Country");
        LOGGER.info("[VISA]Selected date " + date + " in field date");

        return new VisaFormPage(driver);
    }
}