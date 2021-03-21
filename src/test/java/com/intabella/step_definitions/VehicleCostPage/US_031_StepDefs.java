package com.intabella.step_definitions.VehicleCostPage;

import com.github.javafaker.Faker;
import com.intabella.pages.BasePage;
import com.intabella.pages.VehicleCostsPage;
import com.intabella.utilities.BrowserUtils;
import com.intabella.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US_031_StepDefs {

    VehicleCostsPage vehicleCostsPage = new VehicleCostsPage();
    Faker faker = new Faker();

    public void clickXpath(String xpath) {
        WebElement element = Driver.get().findElement(By.xpath(xpath));
        while (!BrowserUtils.isClickable(element) || vehicleCostsPage.loaderMask.isDisplayed()) {
            BrowserUtils.waitFor(1);
        }
        Driver.get().findElement(By.xpath(xpath)).click();
    }

    @When("the user clicks the first row of the table")
    public void theUserClicksTheFirstRowOfTheTable() {
        Driver.get().findElement(By.xpath("//div[2]/div[2]/div[2]/div/table/tbody/tr[3]/td[1]")).click();

    }

    @Then("the user enters Event info")
    public void theUserEntersEventInfo() {
        String title = faker.name().title();
        vehicleCostsPage.addEventFormTitleBox.sendKeys(title);
        BrowserUtils.waitFor(5);
        vehicleCostsPage.addEventFormSaveButton.click();
    }


    @When("the user creates Vehicle Costs")
    public void theUserCreatesVehicleCosts() {
BrowserUtils.waitFor(5);
        clickXpath("//*[@id=\"container\"]/div[2]/div/div/div[2]/a");
        BrowserUtils.waitFor(5);
        clickXpath("//div[1]/div/div/div[2]/div[1]/div[2]/div/button");

    }

    @Then("the user should be able too see the Calendar Event added")
    public void theUserShouldBeAbleTooSeeTheCalendarEventAdded() {
        String titleOfEvent = Driver.get().findElement(By.xpath("//div/div[2]/div/div[2]/div[1]/div/div/div[1]/div[4]/div[1]/strong")).getText();
        Assert.assertNotEquals("", titleOfEvent);
        BrowserUtils.waitFor(3);
    }
}
