package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.MovieList;
import pages.SortBy;
import utilities.Driver;

import java.util.*;

public class US_001_TC_002StepDefs {
    private MovieList movieList= new MovieList();
    private SortBy sortBy = new SortBy();
    private List<String> unsortedTitles = new ArrayList<String>();
    @Given("User lauches the movie app")
    public void user_lauches_the_movie_app() {
        Driver.getDriver().get("www.MovieApp.com");
    }

    @Then("Verify that movie list screen is visible")
    public void verify_that_movie_list_screen_is_visible() {
       String title = Driver.getDriver().getTitle();
        Assert.assertEquals(title,"Movie List");
        List<WebElement> movieTitles = movieList.movieTitles;
        for (WebElement w:movieTitles){
            unsortedTitles.add(w.getText());
        }
    }
    @When("Click Sort Button which is on the right top corner")
    public void click_sort_button_which_is_on_the_right_top_corner() {
        movieList.sortButton.click();

    }
    @Then("Verify that Sort By screen is visible")
    public void verify_that_sort_by_screen_is_visible() {
        String title = Driver.getDriver().getTitle();
        Assert.assertEquals(title,"Sort By");

    }
    @Then("Verify that Title Button is on the Sort By Screen")
    public void verify_that_title_button_is_on_the_sort_by_screen() {
        Assert.assertTrue(sortBy.titleButton.isDisplayed());

    }
    @When("Click Title Button on Sort By Screen")
    public void click_title_button_on_sort_by_screen() {
        sortBy.titleButton.click();
    }
    @Then("Verify that movie list is sorted by title")
    public void verify_that_movie_list_is_sorted_by_title() {
        List<String> sortedTitles = new ArrayList<String>();
        List<WebElement> movieTitles = movieList.movieTitles;
        for (WebElement w:movieTitles){
            sortedTitles.add(w.getText());
        }

        Collections.sort(unsortedTitles);
        Assert.assertEquals(unsortedTitles,sortedTitles);

    }

}
