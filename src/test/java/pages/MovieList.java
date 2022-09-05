
package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class MovieList extends BasePage {
    public MovieList() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="SortButton")
    public WebElement sortButton;

    @FindBy(id="MovieTitle")
    public List <WebElement> movieTitles;

}
