package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WebTableOrderPage extends Base_Page {
    public WebTableOrderPage(){// create a constructor with PageFactory and initEmelents method

    PageFactory.initElements(Driver.getDriver(), this);//this key word for all my elements
}
    @FindBy (name="product")
    public WebElement productDropdown;

    @FindBy (name = "quantity")
    public WebElement inputQuantity;

    @FindBy (name = "name")
    public WebElement inputName;

    @FindBy(name = "street")
    public WebElement inputStreet;

    @FindBy (name = "city")
    public WebElement inputCity;

    @FindBy (name = "state")
    public WebElement inputState;

    @FindBy (name = "zip")
    public WebElement inputZip;

    @FindBy  (xpath = "//input[@name='card']")
    public List<WebElement> cardType;

    @FindBy  (name = "cardNo")
    public WebElement inputCardNumber;

    @FindBy  (name = "cardExp")
    public WebElement inputExpDate;

    @FindBy  (xpath = "//button[.='Process Order']")
    public WebElement processOrderButton;

    @FindBy  (xpath = "//table/tbody//td[.='Sherlock Holmes']")
    public WebElement sherlockHolmesCell;

}
