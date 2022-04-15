package net.phptravels.login;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.gui.AbstractPage;

/**
 * Page Object encapsulates the Sign-in page.
 */
public class SignInPage extends AbstractPage {
  protected WebDriver driver;

  // <input name="user_name" type="text" value="">
  @FindBy(name = "email")
  private ExtendedWebElement emailField;
  
  // <input name="password" type="password" value="">
  @FindBy(name = "password")
  private ExtendedWebElement passwordField;
  
  // <input name="sign_in" type="submit" value="SignIn">
  @FindBy(xpath = "//button[@type='submit']")
  private ExtendedWebElement loginButton;

  public SignInPage(WebDriver driver){
    super(driver);
  }

  /**
    * Login as valid user
    *
    * @param userName
    * @param password
    * @return HomePage object
    */
  public Dashboard loginValidUser(String email, String password) {
	  emailField.type(email);
	  passwordField.type(password);
	  loginButton.click();
   
    return new Dashboard(driver);
  }
}

