package com.intabella.step_definitions.VehicleCostPage;

import com.intabella.pages.DashboardPage;
import com.intabella.pages.VehicleCostsPage;
import com.intabella.utilities.BrowserUtils;
import com.intabella.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

public class US_030_GeneralInfoAboutVehicleCost {

    VehicleCostsPage vehicleCostsPage = new VehicleCostsPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Given("the user click on {string} and click on {string}")
    public void the_user_click_on_and_click_on(String string, String string2) {
        dashboardPage.navigateToModule(string, string2);
        BrowserUtils.waitFor(2);
    }

    @When("the user should navigate to {string} page")
    public void the_user_should_navigate_to_page(String string) {
        BrowserUtils.waitFor(2);
        String ActualTitle = Driver.get().getTitle();
        Assert.assertEquals("Vehicle Costs - Entities - System - Car - Entities - System", ActualTitle);
    }

    @Then("the user click on specific vehicle cost")
    public void the_user_click_on_specific_vehicle_cost() {
        BrowserUtils.waitFor(2);
        vehicleCostsPage.firstVehicleCost.click();
    }

    @Then("the user should see all informations about that vehicle cost")
    public void the_user_should_see_all_informations_about_that_vehicle_cost() {
        BrowserUtils.waitFor(2);
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("Item #1 - Vehicle Costs - Entities - System - Car - Entities - System", actualTitle);
    }


    @Then("the user click on {string}")
    public void the_user_click_on(String string) {
        BrowserUtils.waitFor(2);
        vehicleCostsPage.filtersButtonn.click();
    }

    @Then("the user should see {string} button")
    public void the_user_should_see_button(String string) {
        BrowserUtils.waitFor(2);
        Assert.assertTrue(vehicleCostsPage.managefilters.isEnabled());
    }

    @When("the user click on the {string} button")
    public void the_user_click_on_the_button(String string) {
        BrowserUtils.waitFor(2);
        vehicleCostsPage.managefilters.click();
    }

    @Then("the user should see three options")
    public void the_user_should_see_three_options() {
        BrowserUtils.waitFor(2);
        Assert.assertTrue(vehicleCostsPage.typeN.isEnabled());
        Assert.assertTrue(vehicleCostsPage.totalPriceN.isEnabled());
        Assert.assertTrue(vehicleCostsPage.dateN.isEnabled());
    }

    @When("the user should be able to change entity number at the current page by clicking the {string} dropdown")
    public void the_user_should_be_able_to_change_entity_number_at_the_current_page_by_clicking_the_dropdown(String string) {

    }

    @When("the user select {string} and {string}")
    public void the_user_select_and(String string, String string2) {
        BrowserUtils.waitFor(2);
        vehicleCostsPage.typeN.click();
        vehicleCostsPage.dateN.click();
    }

    @Then("the user should see {string} and {string} menus next to the {string} button")
    public void the_user_should_see_and_menus_next_to_the_button(String string, String string2, String string3) {
        BrowserUtils.waitFor(2);
        Assert.assertTrue(vehicleCostsPage.TypeAll.isEnabled());
        Assert.assertTrue(vehicleCostsPage.dateAllN.isEnabled());
    }

    @Then("the user should be able to click Activities Refresh button")
    public void the_user_should_be_able_to_click_button1(String string) {
        BrowserUtils.waitFor(2);
//        if (string == "Refresh") {
            vehicleCostsPage.refreshBtn.click();
//        } else if (string == "Grid Settings") {
//            //vehicleCostsPage.gridSettingsButtonn.click();
//            JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
//            jse.executeScript("arguments[0].click();", vehicleCostsPage.gridSettingsButtonn);
//            BrowserUtils.waitFor(2);
//        }
    }

    @Then("the event should be refreshed")
    public void the_event_should_be_refreshed() {

    }

    @Then("the user should be able to see older activities by clicking the {string} button")
    public void the_user_should_be_able_to_see_older_activities_by_clicking_the_button(String string) {
        vehicleCostsPage.olderBtn.click();

    }

    @Then("the user should be able to see newer all activities by clicking the {string} button")
    public void the_user_should_be_able_to_see_newer_all_activities_by_clicking_the_button(String string) {
        vehicleCostsPage.newerBtn.click();
    }

    @When("the user click on the next button")
    public void the_user_click_on_the_next_button() {
        vehicleCostsPage.nextBtn.click();

    }

    @Then("the user should be able to see the following attachment information")
    public void the_user_should_be_able_to_see_the_following_attachment_information() {


    }

    @Then("the user should be able to see {string} window")
    public void the_user_should_be_able_to_see_window(String string) {


    }

    @When("the user selects one of the options at show column")
    public void the_user_selects_one_of_the_options_at_show_column() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the user should be able to see the only options that selected on the {string} window")
    public void the_user_should_be_able_to_see_the_only_options_that_selected_on_the_window(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the page should be refreshed")
    public void the_page_should_be_refreshed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user should navigate to {string} pageThen the user click on {string}")
    public void the_user_should_navigate_to_pageThen_the_user_click_on(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the click {string} button")
    public void the_click_button(String string) {


    }

    @Then("{string} and {string} menus should disappear")
    public void and_menus_should_disappear(String string, String string2) {


    }

}
