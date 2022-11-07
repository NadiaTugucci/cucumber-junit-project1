package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBearPages {
    public SmartBearPages(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@id='ctl00_MainContent_username']")
    public WebElement username;
    @FindBy(xpath = "//input[@id='ctl00_MainContent_password']")
    public WebElement password;
    @FindBy(xpath = "//input[@id='ctl00_MainContent_login_button']")
    public WebElement login;
    @FindBy(xpath = "//a[normalize-space()='Order']")
    public WebElement Order;
    @FindBy(xpath = "//select[@id='ctl00_MainContent_fmwOrder_ddlProduct']")
    public WebElement FamilyDropDown;

    @FindBy(xpath = "//input[@id='ctl00_MainContent_fmwOrder_txtQuantity']")
    public WebElement quantity;







}
