package net.phptravels.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

/**
 * Page Object encapsulates the Home Page
 */
public class Dashboard extends AbstractPage {
  protected WebDriver driver;

  @FindBy(tagName =  "h2")
  private ExtendedWebElement messageTitle;


  public Dashboard(WebDriver driver){
    super(driver);
    if (!driver.getTitle().equals("Hi, Demo Welcome Back")) {
      throw new IllegalStateException("This is not the dashboard of logged in user," +
            " current page is: " + driver.getCurrentUrl());
    }
  }

  /**
    * Get message (h2 tag)
    *
    * @return String message text
    */
  public String getMessageText() {
    return messageTitle.getText();
  }

  public Dashboard manageProfile() {
    // Page encapsulation to manage profile functionality
    return new Dashboard(driver);
  }
  /* More methods offering the services represented by Home Page
  of Logged User. These methods in turn might return more Page Objects
  for example click on Compose mail button could return ComposeMail class object */
}