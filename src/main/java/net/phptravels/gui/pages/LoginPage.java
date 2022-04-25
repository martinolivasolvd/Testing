package net.phptravels.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.PageOpeningStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.gui.AbstractPage;

public class LoginPage extends AbstractPage {

  @FindBy(xpath = "//div[@class='form-group']/input[@name='email']")
  private ExtendedWebElement emailField;
  
  @FindBy(xpath = "//div/input[@name='password']")
  private ExtendedWebElement passwordField;
  
  @FindBy(xpath = "//div/input[@name='password']")
  private ExtendedWebElement rememberMeCheckButton;
  
  @FindBy(xpath = "//div[@class = 'btn-box pt-3 pb-4']//button[@type='submit']")
  private ExtendedWebElement loginButton;

  public LoginPage(WebDriver driver){
      super(driver);
      setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
      setUiLoadedMarker(emailField);
  }

  public DashboardPage loginFillForm(String email,String password) {
	  emailField.click();
	  emailField.type(email);
	  passwordField.click();
	  passwordField.type(password);
	  loginButton.click();
   
    return new DashboardPage(driver);
  }
}

