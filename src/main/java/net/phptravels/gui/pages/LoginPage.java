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

    public ExtendedWebElement getEmailField() {
        return emailField;
    }

    public void setEmailField(String emailField) {
        this.emailField.type(emailField);
    }

    public ExtendedWebElement getPasswordField() {
        return passwordField;
    }

    public void setPasswordField(String passwordField) {
        this.passwordField.type(passwordField);
    }

    public ExtendedWebElement getRememberMeCheckButton() {
        return rememberMeCheckButton;
    }

    public void setRememberMeCheckButton(ExtendedWebElement rememberMeCheckButton) {
        this.rememberMeCheckButton = rememberMeCheckButton;
    }

    public ExtendedWebElement getLoginButton() {
        return loginButton;
    }

    public void setLoginButton(ExtendedWebElement loginButton) {
        this.loginButton = loginButton;
    }
}

