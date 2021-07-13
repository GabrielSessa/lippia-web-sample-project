package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.PhpTravelsHomePage;
import com.crowdar.examples.pages.PhpTravelsAboutPage;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class PhpTravelsSteps extends PageSteps {

    @Given("The client is in phptravels page")
    public void home() {
        Injector._page(PhpTravelsHomePage.class).go();
    }

    @When("The client access to about page")
    public void about() {
        Injector._page(PhpTravelsHomePage .class).clickAboutButton();
    }
    @Then("The client verify that is in about page")
    public void statVerfication() {
        Assert.assertTrue(Injector._page(PhpTravelsAboutPage.class).IsDisplayedAboutTitle());
    }
}
