package com.intabella.step_definitions.VehicleOdometerPage;

import com.intabella.pages.VehicleOdometerPage;
import com.intabella.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US24SalesManagerCannotStepDefs {

    com.intabella.pages.VehicleOdometerPage VehicleOdometerPage =new VehicleOdometerPage();

    @When("the sales manager navigate to Fleet module and click on the Vehicle Odometer")
    public void the_user_navigate_to_Fleet_module_and_click_on_the_Vehicle_Odometer() {
        VehicleOdometerPage.navigateToModule("Fleet","Vehicle Odometer");
        System.out.println("the user navigate to Fleet module and click on the Vehicle Odometer");
    }

    @Then("{string} notification should be seen")
    public void notification_should_be_seen(String expected) {
        BrowserUtils.waitFor(6);

        try {
            String actualText = VehicleOdometerPage.dontHavePermissionWarning.getText();
            System.out.println(actualText);
            Assert.assertEquals(expected, actualText);
        }catch (Exception e) {
            String actualText = VehicleOdometerPage.dontHavePermissionFirstWarningMessage.getText();
            System.out.println(actualText);
            Assert.assertEquals(expected, actualText);
        }
    }

    @When("the store manager navigate to Fleet module and click on the Vehicle Odometer")
    public void the_store_manager_navigate_to_Fleet_module_and_click_on_the_Vehicle_Odometer() {
          VehicleOdometerPage.navigateToModule("Fleet","Vehicle Odometer");

//        Actions actions = new Actions(Driver.get());
//        actions.moveToElement(homePage.fleetTab).perform();
//        Driver.get().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//        homePage.vehicleOdometerModule.click();
        System.out.println("the user navigate to Fleet module and click on the Vehicle Odometer");
    }

//    @Then("You do not have permission to perform this action. notification should be seen")
//    public void you_do_not_have_permission_to_perform_this_action_notification_should_be_seen() {
//        BrowserUtils.waitFor(3);
//        CreateVehicleOdometerPage createVehicleOdometerPage =new CreateVehicleOdometerPage();
//        String actualText = createVehicleOdometerPage.dontHavePermissionWarning.getText();
//
//        Assert.assertEquals("You do not have permission to perform this action.", actualText);
//        System.out.println(actualText);
//
//    }



}
