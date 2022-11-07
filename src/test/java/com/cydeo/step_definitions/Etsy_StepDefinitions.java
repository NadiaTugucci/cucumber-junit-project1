package com.cydeo.step_definitions;

import com.cydeo.pages.EtsySearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static org.junit.Assert.assertTrue;

public class Etsy_StepDefinitions {

    EtsySearchPage search = new EtsySearchPage();

    @Given("User is on etsy search page")
    public void user_is_on_etsy_search_page() {
        Driver.getDriver().get("https://www.etsy.com");
    }
    @When("user sees title is as expected")
    public void user_sees_title_is_as_expected() {
        String expectedTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals("Title verification is failed!",expectedTitle,actualTitle);
    }
   @Then("user types Wooden Spoon in the search box")
    public void user_types_wooden_spoon_in_the_search_box() {
        search.searchBox.sendKeys("Wooden Spoon");
    }
    @When("User clicks search button")
    public void user_clicks_search_button() {
        search.searchButton.click();
    }
    @Then("User sees Wooden Spoon is in the title")
    public void user_sees_wooden_spoon_is_in_the_title() {
        String expectedTitle = "Wooden spoon";
      //  String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue("Title verification Failed", Driver.getDriver().getTitle().contains(expectedTitle));
    }
    @When("User types {string} in the search box")
    public void user_types_in_the_search_box(String str) {
         search.searchBox.sendKeys(str);

    }
    @Then("User sees {string} is in the title")
    public void user_sees_is_in_the_title(String expectedTitle) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedTitle));    }

}
