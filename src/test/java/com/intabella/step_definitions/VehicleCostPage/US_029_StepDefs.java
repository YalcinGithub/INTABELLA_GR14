package com.intabella.step_definitions.VehicleCostPage;

import com.intabella.pages.DashboardPage;
import com.intabella.pages.VehicleCostsPage;
import com.intabella.utilities.BrowserUtils;
import com.intabella.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US_029_StepDefs {

    VehicleCostsPage vehicleCostsPage = new VehicleCostsPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Given("the user is on the {string} page")
    public void the_user_is_on_the_page(String expectedTitle) {

        BrowserUtils.waitFor(5);
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);

    }

    @When("the user navigates to {string} {string}")
    public void the_user_navigates_to(String string, String string2) {
        dashboardPage.navigateToModule("Fleet", "Vehicle Costs");
        BrowserUtils.waitFor(6);
    }

    @When("the user clicks Create Vehicle Costs button")
    public void the_user_clicks_Create_Vehicle_Costs_button() {
            BrowserUtils.waitFor(4);
            vehicleCostsPage.CreateVehicleCosts.click();

    }

    @Then("the user should be able to click {string} button")
    public void the_user_should_be_able_to_click_button(String string) {
        BrowserUtils.waitFor(4);
        vehicleCostsPage.SaveAndCloseButton.click();
    }

    @Then("User verifies that Entity Saved message can be seen on page")
    public void user_verifies_that_Entity_Saved_message_can_be_seen_on_page() {
        vehicleCostsPage.EntitySavedMessage.isDisplayed();
        String message = "Entity saved";
        Assert.assertEquals(message, vehicleCostsPage.EntitySavedMessage.getText());
    }

    @When("the user clicks first plus button")
    public void the_user_clicks_first_plus_button() {
        BrowserUtils.waitFor(3);
        vehicleCostsPage.ChassisNumberPlusButton.click();
    }

    @Then("{string} window should pop up")
    public void window_should_pop_up(String string) {
        vehicleCostsPage.SelectCarreservationWindow.isDisplayed();
        String PopUpWindow = "";
        Assert.assertEquals(PopUpWindow, vehicleCostsPage.SelectCarreservationWindow.getText());
    }

    @When("the user clicks first chassis number and then clicks select")
    public void the_user_clicks_first_chassis_number_and_then_clicks_select() {
        vehicleCostsPage.FirstCheckbox.click();
        vehicleCostsPage.SelectButton.click();


    }

    @Then("Chassis Number should be shown on the {string} page")
    public void chassis_Number_should_be_shown_on_the_page(String string) {
        vehicleCostsPage.NewChassiName.isDisplayed();
        String NewChassiName = "Chassis Number: N/A";
        Assert.assertEquals(NewChassiName, vehicleCostsPage.NewChassiName.getText());
    }
        //Comment Adam corrected
        //No comment 2


}
