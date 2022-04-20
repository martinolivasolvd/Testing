package net.phptravels.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.PageOpeningStrategy;
import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.support.FindBy;

public class FlightsSearchResultPage extends AbstractPage {
	@FindBy(xpath = "//a[text() = 'Total Flights ']")
	private ExtendedWebElement titleSearchResult;
	public FlightsSearchResultPage(WebDriver driver) {
		super(driver);
		setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
		setUiLoadedMarker(titleSearchResult);
	}
}
