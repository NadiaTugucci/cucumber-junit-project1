package com.cydeo.step_definitions;

import com.cydeo.pages.HiOscarPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class HiOscar_StepDefs {
     Select select;
     HiOscarPage hiOscarPage= new HiOscarPage();
    @Given("User is on the homepage of HiOscar")
    public void user_is_on_the_homepage_of_hi_oscar() {
        Driver.getDriver().get("https://www.hioscar.com/care-options ");
    }
    @When("Click Search network")
    public void click_search_network() {
     hiOscarPage.searchNetwork.click();
    }
    @When("From Coverage year dropdown Select {string} option")
    public void from_coverage_year_dropdown_select_option(String num) {

        hiOscarPage.coverageYearDropdown.click();
        hiOscarPage.year2023.click();
    }
    @When("From Coverage access dropdown Select Employer-provided option")
    public void from_coverage_access_dropdown_select_employer_provided_option() {
        hiOscarPage.coverageAccessDropdown.click();
        hiOscarPage.employerProvided.click();
    }
    @When("From Network partner dropdown Select Oscar option")
    public void from_network_partner_dropdown_select_oscar_option() {
         hiOscarPage.networkPartnerDropdown.click();
         hiOscarPage.oscarOption.click();
    }
    @When("From Coverage area dropdown Select New Jersey")
    public void from_coverage_area_dropdown_select_new_jersey() {
        hiOscarPage.coverageAreaDropDown.click();
        hiOscarPage.newJersey.click();
    }
    @When("Click Continue button")
    public void click_continue_button() {
    hiOscarPage.continueButton.click();
    }
    @Then("Verify title contains Oscar")
    public void verify_title_contains_oscar() {
         String actualTittle = Driver.getDriver().getTitle();
         String expected = "Oscar";
         Assert.assertTrue(actualTittle.contains(expected));
    }

}
/*public void oscar_care_options_test(){

        Driver.getDriver().get("https://www.hioscar.com/care-options");

        Driver.getDriver().findElement(By.xpath("//span[.='Search network']")).click();

        Set<String> allWindowHandles = Driver.getDriver().getWindowHandles();

        for(String each: allWindowHandles){
            Driver.getDriver().switchTo().window(each);
        }

        Driver.getDriver().findElement(By.xpath("//div[@class='Dropdown_visibleContent__NGHUm']")).click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.elementToBeClickable( Driver.getDriver().findElement(By.xpath("//li[@id='20232023']"))));
        Driver.getDriver().findElement(By.xpath("//li[@id='20232023']")).click();

        Driver.getDriver().findElement(By.xpath("(//div[@class='Dropdown_visibleContent__NGHUm'])[2]")).click();
        wait.until(ExpectedConditions.elementToBeClickable( Driver.getDriver().findElement(By.cssSelector("#SMALL_GROUPEmployer-provided"))));
        Driver.getDriver().findElement(By.cssSelector("#SMALL_GROUPEmployer-provided")).click();

        Driver.getDriver().findElement(By.xpath("(//div[@class='Dropdown_visibleContent__NGHUm'])[3]")).click();
        wait.until(ExpectedConditions.elementToBeClickable( Driver.getDriver().findElement(By.xpath("//div[.='Oscar']"))));
        Driver.getDriver().findElement(By.xpath("//div[.='Oscar']")).click();

        Driver.getDriver().findElement(By.xpath("(//div[@class='Dropdown_visibleContent__NGHUm'])[4]")).click();
        wait.until(ExpectedConditions.elementToBeClickable( Driver.getDriver().findElement(By.xpath("//div[.='New Jersey']"))));
        Driver.getDriver().findElement(By.xpath("//div[.='New Jersey']")).click();

        wait.until(ExpectedConditions.elementToBeClickable( Driver.getDriver().findElement(By.xpath("//button[@type='button'][2]"))));
        Driver.getDriver().findElement(By.xpath("//button[@type='button'][2]")).click();

        Assert.assertTrue(Driver.getDriver().getTitle().contains("Oscar"));

 */
