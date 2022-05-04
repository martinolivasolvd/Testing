package net.phptravels.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.PageOpeningStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

import net.phptravels.gui.components.Topbar;

public class VisaFormPage extends AbstractPage {

	 @FindBy(xpath = "//header[@class ='header-area']")
	 	private Topbar topbar;

	@FindBy(xpath = "//h3[text() = 'Submission Form']")
	private ExtendedWebElement visaTitle;
	 @FindBy(xpath = "//input[@name = 'first_name']")
	    private ExtendedWebElement firstNameInput;
	 
	 @FindBy(xpath = "//input[@name = 'last_name']")
	    private ExtendedWebElement lastNameInput;
	  
	 @FindBy(xpath = "//input[@name = 'email']")
	    private ExtendedWebElement emailInput;
	 
	 @FindBy(xpath = "//input[@name = 'phone']")
	    private ExtendedWebElement phoneInput;

	 @FindBy(xpath = "//input[@name = 'date']")
	    private ExtendedWebElement dateInput;

	 @FindBy(xpath = "//div//textarea[@name='notes']")
	    private ExtendedWebElement notesInput;
	 
	 @FindBy(xpath = "//div//button[@id = 'submit']")
	    private ExtendedWebElement submitButton;
	 
	 
public VisaFormPage(WebDriver driver){
	super(driver);
	setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
	setUiLoadedMarker(visaTitle);
  }

public VisaFormSuccessPage fillVisaForm(String firstName, String lastName, String email, String phone, String date, String notes) {
	firstNameInput.type(firstName);
	lastNameInput.type(lastName);
	emailInput.type(email);
	phoneInput.type(phone);
	dateInput.click();
	notesInput.type(notes);
	submitButton.click();
	
	return new VisaFormSuccessPage(driver);
}
}