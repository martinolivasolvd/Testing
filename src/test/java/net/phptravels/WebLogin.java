package net.phptravels;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.R;
import net.phptravels.gui.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import net.phptravels.gui.utils.AuthService;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class WebLogin implements IAbstractTest {
    @Test()
    public void testLoginPage() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        LoginPage loginPage = homePage.clickLoginButton();
        Assert.assertTrue(loginPage.isPageOpened(), "SignIn page is not opened");
        DashboardPage userDashboard = new AuthService().loginFillForm(R.TESTDATA.get("testEmail"),R.TESTDATA.get("testPassword"));
        Assert.assertTrue(userDashboard.isPageOpened(), "Dashboard page is not opened");
    }
    @Test()
    public void testHotelsFillForm() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        HotelsSearchResultPage hotelsSearchResultPage = homePage.hotelFillForm("Coffee",  "24-04-2022", "25-04-2022", "5", "3", "1");
        Assert.assertTrue(hotelsSearchResultPage.isPageOpened(), "Hotels search page is not opened");
    }
    @Test()
    public void testFlightsFillForm() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        FlightsSearchResultPage flightsSearchResultPage = homePage.flightsFillForm("ask",  "asd", "25-04-2022", "28-04-2022", "5", "3", "1");
        Assert.assertTrue(flightsSearchResultPage.isPageOpened(), "Flights search page is not opened");
    }
    @Test()
    public void testToursFillForm() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        ToursSearchResultPage toursSearchResultPage = homePage.toursFillForm("ght",  "25-04-2022", "3", "6");
        Assert.assertTrue(toursSearchResultPage.isPageOpened(), "Tours search page is not opened");
    }
    @Test()
    public void testVisaFillForm() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        VisaFormPage visaSearchResultPage = homePage.visaFillForm("al",  "Man", "25-04-2022");
        Assert.assertTrue(visaSearchResultPage.isPageOpened(), "Visa form page is not opened");
        VisaFormSuccessPage visaFormSuccessPageResult = visaSearchResultPage.fillVisaForm("Jhon", "Doe","asd@gmail.com","123456","28-04-2022", "This is a note");
        Assert.assertTrue(visaFormSuccessPageResult.isPageOpened(), "Visa success form page is not opened");
    }
}
