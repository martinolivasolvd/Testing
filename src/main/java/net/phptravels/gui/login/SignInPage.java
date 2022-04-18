package net.phptravels.gui.login;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.gui.AbstractPage;

public class SignInPage extends AbstractPage {
  protected WebDriver driver;

  @FindBy(name = "email")
  private ExtendedWebElement emailField;
  
  @FindBy(name = "password")
  private ExtendedWebElement passwordField;
  
  @FindBy(xpath = "//button[@type='submit']")
  private ExtendedWebElement loginButton;

  public SignInPage(WebDriver driver){
    super(driver);
  }

  public DashboardPage loginValidUser(String email, String password) {
	  emailField.type(email);
	  passwordField.type(password);
	  loginButton.click();
   
    return new DashboardPage(driver);
  }
}

