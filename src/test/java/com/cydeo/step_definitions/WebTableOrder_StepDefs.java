package com.cydeo.step_definitions;

import com.cydeo.pages.Base_Page;
import com.cydeo.pages.ViewAllOrdersPage;
import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.pages.WebTableOrderPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class WebTableOrder_StepDefs {
    WebTableLoginPage webTableLoginPage =new WebTableLoginPage();
    Base_Page basePage= new Base_Page();
    WebTableOrderPage webTableOrderPage= new WebTableOrderPage();
     ViewAllOrdersPage viewAllOrdersPage = new ViewAllOrdersPage();
 Select select;

     @Given("user is already logged in and on order page")
    public void user_is_already_logged_in_and_on_order_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
       webTableLoginPage.login(ConfigurationReader.getProperty("username"),ConfigurationReader.getProperty("password"));
        basePage.orderButtonNavItem.click();
    }
    @When("user selects product type {string}")
    public void user_selects_product_type(String string) {
        Select select = new Select(webTableOrderPage.productDropdown);
        select.selectByVisibleText(string);
    }
    @When("user enters quantity {int}")
    public void user_enters_quantity(Integer int1) {
         // default there was already number in this input
         //first we need to clean that input and we will send keys later

   // webTableOrderPage.inputQuantity.clear();// clear will delete everything
        webTableOrderPage.inputQuantity.sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);// how many item we have this in how many Keys,Backspace we will use
    // we need use the value of method, or concatenation
   // accepting int arg and sending test using sendKeys method
   //send keys () method only accepts String, we need to either concatenate with " or send String.valueOf(int)

      //  webTableOrderPage.inputQuantity.sendKeys(String.valueOf(int1));  we can use this way or the other way
        webTableOrderPage.inputQuantity.sendKeys(int1+"");
    }
    @When("user enters customer name {string}")
    public void user_enters_customer_name(String string) {
    webTableOrderPage.inputName.sendKeys(string);
    }
    @When("user enters street {string}")
    public void user_enters_street(String string) {
    webTableOrderPage.inputStreet.sendKeys(string);
    }
    @When("user enters city {string}")
    public void user_enters_city(String string) {
    webTableOrderPage.inputCity.sendKeys(string);
    }
    @When("user enters state {string}")
    public void user_enters_state(String string) {
    webTableOrderPage.inputState.sendKeys(string);
    }
    @When("user enters zipcode {string}")
    public void user_enters_zipcode(String string) {
   webTableOrderPage.inputZip.sendKeys(string);
    }
    @When("user selects credit card type {string}")
    public void user_selects_credit_card_type(String string) {
//        for(WebElement each: webTableOrderPage.cardType){// go into the loop and find and click not returning anything
//            if(each.getAttribute("value").equalsIgnoreCase(string)){
//                each.click();
//            }
        //instead of having the for loop here we created in BrowserUtills and call it from there
        BrowserUtils.clickRadioButton(webTableOrderPage.cardType,string);
    }

    @When("user enters credit card number {string}")
    public void user_enters_credit_card_number(String string) {
    webTableOrderPage.inputCardNumber.sendKeys(string);
    }
    @When("user enters expiry date {string}")
    public void user_enters_expiry_date(String string) {
    webTableOrderPage.inputExpDate.sendKeys(string);
    }
    @When("user enters process order button")
    public void user_enters_process_order_button() {
    webTableOrderPage.processOrderButton.click();
    }
    @Then("user should see {string} in first row of the web table")
    public void user_should_see_in_first_row_of_the_web_table(String expectedCustomerName) {

         String actualCustomerName = viewAllOrdersPage.newCustomerCell.getText();

        Assert.assertEquals(expectedCustomerName,actualCustomerName);
}
        }
