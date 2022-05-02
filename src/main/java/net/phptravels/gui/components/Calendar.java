package net.phptravels.gui.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class Calendar extends AbstractUIObject {
    @FindBy(xpath = "/html/body/div[8]/div[1]/table/thead/tr[1]/th[3]/i")
    private ExtendedWebElement nextMonthArrowButton;

    @FindBy(xpath = "//*[@id='fadein']/div[2]/div[1]/table/thead/tr[1]/th[1]")
    private ExtendedWebElement previousMonthArrowButton;

    @FindBy(xpath = "/html/body/div[8]/div[1]/table/tbody/tr[4]/td[4]")
    private ExtendedWebElement availableCalendarDays;

    public Calendar(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public void clickNextMonthArrowButton(){
        nextMonthArrowButton.click();
    }

    public void clickPreviousMonthArrowButton(){
        previousMonthArrowButton.click();
    }

    public void clickavailableCalendarDays(){
        availableCalendarDays.clickByJs();
    }
}
