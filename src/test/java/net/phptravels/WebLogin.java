package net.phptravels;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.core.foundation.utils.tag.Priority;
import com.qaprosoft.carina.core.foundation.utils.tag.TestPriority;
import net.phptravels.gui.pages.*;
import com.zebrunner.agent.core.annotation.TestLabel;
import org.testng.Assert;
import org.testng.annotations.Test;


public class WebLogin implements IAbstractTest {

    @Test()
    public void testHotelsFillForm() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        HotelsSearchResultPage hotelSearch = homePage.hotelFillForm("Coffee",  "24-04-2022", "25-04-2022", "5", "3", "1");
        Assert.assertTrue(hotelSearch.isPageOpened(), "Hotels search page is not opened");
    }
    @Test()
    public void testFlightsFillForm() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        FlightsSearchResultPage flightSearch = homePage.flightsFillForm("ask",  "asd", "25-04-2022", "28-04-2022", "5", "3", "1");
        Assert.assertTrue(flightSearch.isPageOpened(), "Flights search page is not opened");
    }

    @Test()
    public void testToursFillForm() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        ToursSearchResultPage toursSearch = homePage.toursFillForm("ght",  "25-04-2022", "3", "6");
        Assert.assertTrue(toursSearch.isPageOpened(), "Tours search page is not opened");
    }

    @Test()
    public void testVisaFillForm() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        VisaFormPage visaSearch = homePage.visaFillForm("al",  "Man", "25-04-2022");
        Assert.assertTrue(visaSearch.isPageOpened(), "Visa form page is not opened");
        VisaFormSuccessPage visaSuccess =visaSearch.fillVisaForm("Jhon", "Doe","asd@gmail.com","123456","28-04-2022", "This is a note");
        Assert.assertTrue(visaSuccess.isPageOpened(), "Visa success form page is not opened");
    }
}
