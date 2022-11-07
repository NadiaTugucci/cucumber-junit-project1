package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HiOscarPage {
    public HiOscarPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='Button_contentyNdi7']")
    public WebElement searchNetwork;

    @FindBy(xpath = "//div[@class='DropdownOverlayAttachment_triggerContainer129mH']")
    public WebElement coverageYearDropdown;

    @FindBy(xpath = "//div[@aria-label='2023']")
    public WebElement year2023;

    @FindBy(xpath = "(//div[@class='Dropdown_visibleContentNGHUm'])[2]")
    public WebElement coverageAccessDropdown;

    @FindBy(xpath = "//div[@aria-label='Employer-provided']")
    public WebElement employerProvided;

    @FindBy(xpath = "(//div[@class='Dropdown_visibleContentNGHUm'])[3]" )
    public WebElement networkPartnerDropdown;

    @FindBy(xpath = "//div[@aria-label='Oscar']")
    public WebElement oscarOption;

    @FindBy(xpath = "(//div[@class='Dropdown_visibleContent__NGHUm'])[4]")
    public WebElement coverageAreaDropDown;

    @FindBy(xpath = "//div[@aria-label='New Jersey']")
    public WebElement newJersey;

    @FindBy(xpath = "(//button[@type='button'])[2]")
    public WebElement continueButton;

}

