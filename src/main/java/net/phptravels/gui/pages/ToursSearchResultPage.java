package net.phptravels.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.PageOpeningStrategy;
import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.support.FindBy;

public class ToursSearchResultPage extends AbstractPage {
    @FindBy(xpath = "//h2[contains(text(),'Search Tours in')]")
    private ExtendedWebElement titleSearchResult;

    public ToursSearchResultPage(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        setUiLoadedMarker(titleSearchResult);
    }
}
