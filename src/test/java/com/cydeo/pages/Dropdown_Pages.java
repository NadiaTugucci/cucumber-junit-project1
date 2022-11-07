package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dropdown_Pages {
public Dropdown_Pages(){
    PageFactory.initElements(Driver.getDriver(),this);
}
    @FindBy(id="month")
    public static WebElement monthDropdown;
}
