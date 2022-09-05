package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SortBy extends BasePage{

    public SortBy() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="TitleButton")
    public WebElement titleButton;
}
