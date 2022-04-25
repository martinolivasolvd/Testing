package net.phptravels;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import net.phptravels.gui.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class WebLogin implements IAbstractTest {
    Properties properties = new Properties();
    {
        try {
            FileInputStream inputstream = new FileInputStream("/Users/solvd/Testing/src/main/resources/_testdata.properties");
            properties.load(inputstream);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @Test()
    public void testLoginPage() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
        LoginPage loginPage = homePage.loginForm();
        Assert.assertTrue(loginPage.isPageOpened(), "SignIn page is not opened");
        DashboardPage userDashboard = loginPage.loginFillForm(properties.getProperty("testEmail"),properties.getProperty("testPassword"));
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
