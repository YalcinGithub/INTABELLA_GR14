package com.intabella.step_definitions.VehicleOdometerPage;

import com.intabella.pages.VehicleOdometerPage;
import com.intabella.utilities.BrowserUtils;
import com.intabella.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US_020StepDefs {

        //US-020 Truck Driver can see all informations about specific vehicle odometer.

    @When("the user navigated to {string} and \"Vehicle Odometers\"sees")
    public void the_user_navigated_to_and_Vehicle_Odometers_sees(String string) {

        VehicleOdometerPage navigate = new VehicleOdometerPage();
        BrowserUtils.waitFor(5);
        navigate.fleetlink.click();


        navigate.vehicleodometer.click();
        BrowserUtils.waitFor(3);
    }

    @Then("the user verify sees all informations about specific {string} page.")
    public void the_user_verify_sees_all_informations_about_specific_page(String string) {

        VehicleOdometerPage vehicleOdometerPage = new VehicleOdometerPage();
        String expected="Vehicles Odometers";
        // System.out.println(vehicleOdometerPage.title.getText());
        Assert.assertEquals(expected, vehicleOdometerPage.title.getText());

    }

}