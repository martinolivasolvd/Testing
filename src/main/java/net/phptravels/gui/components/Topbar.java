package net.phptravels.gui.components;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.gui.pages.HomePage;

public class Topbar extends AbstractUIObject {
	
	@FindBy(xpath = "//a[text()='Home']")
    private ExtendedWebElement homeLink;

    @FindBy(xpath = "//a[text()='Hotels']")
    private ExtendedWebElement hotelsLink;
    
    @FindBy(xpath = "//a[text()='flights']")
    private ExtendedWebElement flightsLink;
    
    @FindBy(xpath = "//a[text()='Tours']")
    private ExtendedWebElement toursLink;
    
    @FindBy(xpath = "//a[text()='visa']")
    private ExtendedWebElement visaLink;
    
    @FindBy(xpath = "//a[text()='Blog']")
    private ExtendedWebElement blogLink;
    
    @FindBy(xpath = "//a[text()='Offers']")
    private ExtendedWebElement offerLink;

    @FindBy(xpath = "//div/nav/ul//li/a[text()='Company ']")
    private ExtendedWebElement companyLink;
    
    @FindBy(xpath = "//div/a[contains(text(),'Signup')]")
    private ExtendedWebElement signupButton;
    
    @FindBy(xpath = "//div/a[contains(text(),'Login')]")
    private ExtendedWebElement loginButton;

    public Topbar(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }
    public HomePage openHomePage() {
        homeLink.click();
        return new HomePage(driver);
    }
    public void clickLogin(){
        loginButton.click();
    }
}
