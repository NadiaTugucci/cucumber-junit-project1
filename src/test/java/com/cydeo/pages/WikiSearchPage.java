package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiSearchPage {
    public WikiSearchPage(){
        PageFactory.initElements(Driver.getDriver(),this); // we're initializing our
    }

    @FindBy(id="searchInput")
    public WebElement searchBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement searchButton;

    @FindBy(xpath = "//span[@class='mw-page-title-main']")
    public WebElement headerText;

    @FindBy (xpath = "//div[@class='fn']")
    public WebElement headerImageText;


}
