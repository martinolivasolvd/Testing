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

    @FindBy(xpath = "//header[@class ='header-area']")
    private Topbar topbar;
    
    @FindBy(xpath ="//div//li[@data-position =1]")
    private ExtendedWebElement hotelButton;
    
    @FindBy(xpath = "//form[@id = 'hotels-search']//input[@data-select2-id = 1]")
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

    @FindBy(xpath = "//div//li[@data-position =2]")
    private ExtendedWebElement flightButton;
    
    @FindBy(xpath = "//div[@id = 'flights']//input[@id = 'one-way']")
    private ExtendedWebElement flightsOneWayRadiobutton;
    
    @FindBy(xpath = "//div[@id = 'flights']//input[@id = 'round-trip']")
    private ExtendedWebElement flightsRoundTripRadioButton;
    
    @FindBy( xpath = "//div[@id = 'flights']//select[@id = 'flight_type']")
    private ExtendedWebElement flightsTypeDropdown;
    
    @FindBy( xpath = "//input[@id = 'autocomplete']")
    private ExtendedWebElement flightsFlyingFromCombobox;
    
    @FindBy( xpath = "//input[@id = 'autocomplete2']")
    private ExtendedWebElement flightsFlyingToCombobox;
    
    @FindBy(xpath = "//div[@id = 'flights']//input[@class = 'depart form-control']")
    private ExtendedWebElement flightsDepartureDate;
    
    @FindBy(xpath ="//div[@id = 'flights']//a[@class = 'dropdown-toggle dropdown-btn waves-effect']")
    private ExtendedWebElement flightsPassengersDropdown;
    
    @FindBy(xpath = "//div[@id = 'flights']//input[@id = 'fadults']")
    private ExtendedWebElement flightsAdults;
    
    @FindBy(xpath = "//div[@id = 'flights']//input[@id = 'fchilds']")
    private ExtendedWebElement flightsChilds;
    
    @FindBy(xpath = "//div[@id = 'flights']//input[@id = 'finfant']")
    private ExtendedWebElement flightsInfants;
    
    @FindBy( xpath = "//div[@class='autocomplete-wrapper _1 row_1']//div[@class = 'autocomplete-location']")
    private ExtendedWebElement flightsFlyingFromSearch;
    
    @FindBy( xpath = "//div[@class='autocomplete-wrapper _1 row_2']//div[@class = 'autocomplete-location']")
    private ExtendedWebElement flightsFlyingToSearch;
    
    @FindBy(xpath = "//div[@id = 'flights']//button[@id = 'flights-search']")
    private ExtendedWebElement flightsSearchFlightButton;
    
    @FindBy(xpath = "//div//button[@id = 'tours-tab']")
    private ExtendedWebElement toursButton;
    
    @FindBy(xpath ="//form[@id = 'tours-search']//span[@data-select2-id = 3]")
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
    
    @FindBy(xpath ="//div[@id='visa']//input[@id = 'date']")
    private ExtendedWebElement visaDate;
    
    @FindBy(xpath = "//div[@id='visa']//button[@type = 'submit']")
    private ExtendedWebElement visaSubmitButton;
     
    @FindBy(xpath = "//input[@class='select2-search__field']")
    private ExtendedWebElement universalInputField;
    
    @FindBy(xpath = "//span[@class='select2-results']//li")
    private ExtendedWebElement universalSearchResult;
    
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public Topbar topbar() {
        return topbar;
    }
    
    
    public void hotelSearchForm(String cityName, String checkin, String checkout, String rooms, String adults, String childs) {
    	
    	hotelDestinationCombobox.click();
    	universalInputField.type(cityName);
    	universalSearchResult.click();
    	
    	hotelCheckinDate.click();
    	hotelCheckinDate.type(checkin);
    	hotelCheckoutDate.click();
    	hotelCheckoutDate.type(checkout);
    	
    	hotelTravellersCombobox.click();
    	hotelRoomsInput.type(rooms);
    	hotelAdultsInput.type(adults);
    	hotelCheckinDate.type(childs); 
    	hotelNationalitySelect.click();
    	hotelNationalitySelect.select("Argentina");
    	
    	hotelSearchButton.click();
    }
    
    public void flightsSearchForm(String flyingFrom, String toDestination, String departureDate, String adults, String childs, String infants) {
    	
    	flightsRoundTripRadioButton.click();
    	
    	flightsFlyingFromCombobox.click();
    	flightsFlyingFromCombobox.type(flyingFrom);
    	flightsFlyingFromSearch.click();
    	
    	flightsFlyingToCombobox.click();
    	flightsFlyingToCombobox.type(toDestination);
    	flightsFlyingToSearch.click();
    	
    	flightsDepartureDate.click();
    	flightsDepartureDate.type(departureDate);
    	
    	flightsTypeDropdown.click();
    	flightsTypeDropdown.select("Business");
    	
    	flightsPassengersDropdown.click();
    	flightsAdults.type(adults);
    	flightsChilds.type(childs);
    	flightsInfants.type(infants);
    	
    	flightsSearchFlightButton.click();
    
    	
    }
    
    public void toursSearchForm(String destination, String date, String adults, String childs) {
    	
    	toursDestinationTextbox.click();
    	universalInputField.type(destination);
    	universalSearchResult.click();
    	
    	toursDate.click();
    	toursDate.type(date);
    	
    	toursTravellersDropdown.click();
    	toursAdultsInput.type(adults);
    	toursChildsInput.type(childs);
    	
    	toursSearchButton.click();
    	
    	
    }
   
    
    public void visafillVisaSearchForm(String fromCountry, String toCountry, String date) {
    	
    	visaFromCountryComboBox.click();
    	universalInputField.type(fromCountry);
    	universalSearchResult.click();
    	
    	visaToCountryComboBox.click();
    	universalInputField.type(toCountry);
    	universalSearchResult.click();
    	
    	visaDate.click();
    	visaDate.type(date);
    	
    	visaButton.click();		
    }
    


}