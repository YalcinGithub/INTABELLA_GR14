package com.intabella.step_definitions.VehicleOdometerPage;

import com.intabella.pages.DashboardPage;
import com.intabella.pages.LoginPage;
import com.intabella.pages.VehicleOdometerPage;
import com.intabella.utilities.BrowserUtils;
import com.intabella.utilities.ConfigurationReader;
import com.intabella.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US_022_StepDefs {

    VehicleOdometerPage vehiclesOdometersPage = new VehicleOdometerPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Given("the user is logged in as {string}")
    public void the_user_is_logged_in_as(String userType) {
        String url = ConfigurationReader.get("url");
        //WebDriver driver = Driver.get();
        Driver.get().get(url);
        String username = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);


    }


    @When("the driver navigates to {string}, {string}")
    public void the_driver_navigates_to(String tab, String module) {
        dashboardPage.navigateToModule("Fleet", "Vehicle Odometer");


    }

    @Then("{string} page should be displayed")
    public void page_should_be_displayed(String string) throws InterruptedException {

        String currentSubtitle = vehiclesOdometersPage.getPageSubTitle();
        BrowserUtils.waitFor(7);
        Assert.assertEquals("Vehicles Odometers", vehiclesOdometersPage.getPageSubTitle());
        System.out.println(vehiclesOdometersPage.getPageSubTitle());

    }
    @When("the user clicks first odometer information on the table")
    public void the_user_clicks_first_odometer_information_on_the_table() {

        vehiclesOdometersPage.firstRowInformation.click();
        System.out.println(Driver.get().getTitle());

    }

    @Then("information Edit page should be opened")
    public void information_Edit_page_should_be_opened() {
        String expectedPage = "Vehicle Odometer - Entities - System - Car - Entities - System";
        Assert.assertEquals(expectedPage, Driver.get().getTitle());
        DashboardPage entitiesPage = new DashboardPage();
        System.out.println(entitiesPage.getPageSubTitle());
    }

    @When("the user clicks the Edit button")
    public void the_user_clicks_the_Edit_button() {
        BrowserUtils.waitFor(4);
        vehiclesOdometersPage.editButton.click();
    }

    @When("the driver clears the Odometer Value inbox and enters a new value {string}")
    public void the_driver_clears_the_Odometer_Value_inbox_and_enters_a_new_value(String value) {
        vehiclesOdometersPage.odometerValueInbox.clear();
        vehiclesOdometersPage.odometerValueInbox.sendKeys(value);
    }

    @When("the driver clicks the {string} button on the right")
    public void the_driver_clicks_the_button_on_the_right(String string) {
        BrowserUtils.waitFor(5);
        vehiclesOdometersPage.saveAndCloseButton.click();
    }

    @Then("{string} message should be displayed")
    public void message_should_be_displayed(String string) {
        vehiclesOdometersPage.entitySavedMessage.isDisplayed();
        String message = "Entity saved";
        Assert.assertEquals(message, vehiclesOdometersPage.entitySavedMessage.getText());
    }
    @Then("{string} validation message should be displayed")
    public void validation_message_should_be_displayed(String expected) {
        String validationMessage = vehiclesOdometersPage.validationMessage.getText();
        Assert.assertEquals(expected, validationMessage);

    }


}