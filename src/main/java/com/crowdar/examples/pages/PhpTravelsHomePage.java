package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class PhpTravelsHomePage extends PageBasePhpTravels {

    private final String ABOUT_BUTTON_XPATH = "/html/body/footer/div/div/div[6]/a[2]";

    public PhpTravelsHomePage(RemoteWebDriver driver) {
        super(driver);
        this.url = ""; //here you can define the custom paths For example:"/search" --> www.googe.com/search
    }

    public void go() {
        navigateToCompleteURL();
    }
    
    
    public void clickAboutButton() {
        clickElement(By.xpath(ABOUT_BUTTON_XPATH));
    }
    
}
