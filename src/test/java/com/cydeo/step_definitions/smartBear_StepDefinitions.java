package com.cydeo.step_definitions;

import com.cydeo.pages.SmartBearPages;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

public class smartBear_StepDefinitions {
    SmartBearPages smartBearPages = new SmartBearPages();
    @Given("User is logged into SmartBear Tester account and on Order page")
    public void user_is_logged_into_smart_bear_tester_account_and_on_order_page() {
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
     smartBearPages.username.sendKeys("Tester");
     smartBearPages.password.sendKeys("test");
     smartBearPages.login.click();
     smartBearPages.Order.click();
    }
    @When("User fills out the form as followed:")
    public void user_fills_out_the_form_as_followed() {

    }
    @When("User selects FamilyAlbum from product dropdownAnd User enters {int} to quantity")
    public void user_selects_family_album_from_product_dropdown_and_user_enters_to_quantity(int int1) {
        Select select = new Select(smartBearPages.FamilyDropDown);
        select.selectByValue("FamilyAlbum");
        smartBearPages.quantity.sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END), int1+"");
    }
    @When("User enters {string} to costumer name")
    public void user_enters_to_costumer_name(String string) {

    }
    @When("User enters {string} to street")
    public void user_enters_to_street(String string) {

    }
    @When("User enters {string} to city")
    public void user_enters_to_city(String string) {

    }
    @When("User enters {string} to state")
    public void user_enters_to_state(String string) {

    }
    @When("User enters {string}")
    public void user_enters(String string) {

    }
    @When("User selects Visa as card type")
    public void user_selects_visa_as_card_type() {

    }
    @When("User enters {string} to card number")
    public void user_enters_to_card_number(String string) {

    }
    @When("User enters {string} to expiration date")
    public void user_enters_to_expiration_date(String string) {

    }
    @When("User clicks process button")
    public void user_clicks_process_button() {

    }
    @Then("User verifies {string} is in the list")
    public void user_verifies_is_in_the_list(String string) {

    }

}
