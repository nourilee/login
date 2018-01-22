package com.exercise.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationPage {

    private WebDriver driver;

    //Page URL
    private static String PAGE_URL="http://localhost:8085/javapointers/";

    //Locators

    @FindBy(xpath = "//*[text()='User Login']")
    public WebElement pageTitle;

    @FindBy(xpath = "//input[@type='text'][@placeholder='Username']")
    public WebElement inputUserName;

    @FindBy(xpath = "//input[@type='password'][@placeholder='Password']")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[text()='Login']")
    public WebElement buttonLogin;

    //Constructor
    public ApplicationPage(WebDriver driver){
        this.driver=driver;
        driver.get(PAGE_URL);
        //Initialise Elements
        PageFactory.initElements(driver, this);
    }

    //Page Actions

    public boolean isPageLoaded(){
        return pageTitle.getText().toString().contains("User Login");
    }

    public void setUserName(String userName){
        inputUserName.clear();
        inputUserName.sendKeys(userName);
    }

    public void setPassword(String password){
        inputPassword.clear();
        inputPassword.sendKeys(password);
    }

    public void clickLogin(){
        buttonLogin.click();
    }
}

