package com.intabella.step_definitions.VehicleCostPage;

import com.intabella.pages.VehicleCostsPage;
import com.intabella.pages.VehicleOdometerPage;
import com.intabella.utilities.BrowserUtils;
import com.intabella.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class US_026_StepDefs {

    VehicleCostsPage vehicleCostsPage =new VehicleCostsPage(); //her methodda kullanılacağı için en başa yazdım.

    @When("the user clicks on the {string} on the right.")
    public void the_user_clicks_on_the_on_the_right(String string) {


        //vehicleCostsPage.gridSettingsButtonn.click();
        JavascriptExecutor jse=(JavascriptExecutor) Driver.get();
        jse.executeScript("arguments[0].click();", vehicleCostsPage.gridSettingsButtonn);
        BrowserUtils.waitFor(2);


    }

    @Then("the user verify that  {string} informations page openned.")
    public void the_user_verify_that_informations_page_openned(String string) {

        String expected="Grid Settings";
        //System.out.println(vehicleCostsPage.gridSettings.getText());
        Assert.assertEquals(expected, vehicleCostsPage.gridSettings.getText());

    }

    @When("the user {string} is clicked.")
    public void the_user_is_clicked(String string) {

        JavascriptExecutor jse=(JavascriptExecutor) Driver.get();
        jse.executeScript("arguments[0].click();", vehicleCostsPage.selectall);
        BrowserUtils.waitFor(2);
        //vehicleCostsPage.selectall.click();


        jse.executeScript("arguments[0].click();", vehicleCostsPage.Type);
        BrowserUtils.waitFor(4);


        jse.executeScript("arguments[0].click();", vehicleCostsPage.TotalPrice);
        //jse.executeScript("arguments[0].click();", vehicleCostsPage.TotalPrice);
        BrowserUtils.waitFor(4);


        jse.executeScript("arguments[0].click();", vehicleCostsPage.Date);
        BrowserUtils.waitFor(4);


    }

    @Then("the user verify sees {string} properties appear on the vehicle cost page page.")
    public void the_user_verify_sees_properties_appear_on_the_vehicle_cost_page_page(String string) {

        String expected = "ID";
        //System.out.println(vehicleCostsPage.ID.getText());
        Assert.assertEquals(expected,vehicleCostsPage.ID.getText());

    }

    @Then("the user verify sees {string} properties don't appear on the vehicle cost page page.")
    public void the_user_verify_sees_properties_don_t_appear_on_the_vehicle_cost_page_page(String string) {

        vehicleCostsPage.waitUntilLoaderScreenDisappear();
       Assert.assertFalse(vehicleCostsPage.TYPE.isDisplayed());


        vehicleCostsPage.waitUntilLoaderScreenDisappear();
        Assert.assertFalse(vehicleCostsPage.TOTALPRICE.isDisplayed());
    }

    @Then("the user verify sees {string} properties appear don't on the vehicle cost page.")
    public void the_user_verify_sees_properties_appear_don_t_on_the_vehicle_cost_page(String string) {

        vehicleCostsPage.waitUntilLoaderScreenDisappear();
        Assert.assertFalse(vehicleCostsPage.DATE.isDisplayed());

    }


    @When("the user clicks on the Filters on the right.")
    public void the_user_clicks_on_the_Filters_on_the_right() {


        JavascriptExecutor jse=(JavascriptExecutor) Driver.get();
        jse.executeScript("arguments[0].click();", vehicleCostsPage.filtersButtonn);
        BrowserUtils.waitFor(2);
    }

    @Then("the user verify that {string} openned on the left side.")
    public void the_user_verify_that_openned_on_the_left_side(String string) {

        String expected = "Manage filters";
        //System.out.println(vehicleCostsPage.ID.getText());
        Assert.assertEquals(expected,vehicleCostsPage.managefilters.getText());


    }

    @Then("the user verify {string} {string} {string} search appears.")
    public void the_user_verify_search_appears(String string, String string2, String string3) {

        String expected = "Type";
        //System.out.println(vehicleCostsPage.ID.getText());
        Assert.assertEquals(expected,vehicleCostsPage.typetext.getText());

    }

    @Then("the user verify sees {string} all option appears at the top.")
    public void the_user_verify_sees_all_option_appears_at_the_top(String string) {

        String expected = "Type: All";
        //System.out.println(vehicleCostsPage.TypeAll.getText());
        Assert.assertEquals(expected,vehicleCostsPage.TypeAll.getText());

       // vehicleCostsPage.waitUntilLoaderScreenDisappear();
        //Assert.assertFalse(vehicleCostsPage.TypeAll.isDisplayed());


    }

    @When("the user click on choose values and click the first one.")
    public void the_user_click_on_choose_values_and_click_the_first_one() {

     //   List<String> menuOptions
        JavascriptExecutor jse=(JavascriptExecutor) Driver.get();
        jse.executeScript("arguments[0].click();", vehicleCostsPage.choose);
        BrowserUtils.waitFor(4);

      //  List<String> actualOptions = BrowserUtils.getElementsText(vehicleCostsPage.dropdownList);

        //Assert.assertEquals(menuOptions,actualOptions);


        jse.executeScript("arguments[0].click();", vehicleCostsPage.road);
        BrowserUtils.waitFor(4);

    //    List<String> expectedOptions = BrowserUtils.getElementsText(vehicleCostsPage.road);

      //  Assert.assertEquals(menuOptions,expectedOptions);

        //vehicleCostsPage.road.click();

    }


    @Then("the user verify that the result appears on the page.")
    public void the_user_verify_that_the_result_appears_on_the_page() {

        String expected = "Tax Roll";
        //System.out.println(vehicleCostsPage.Road.getText());
       Assert.assertEquals(expected,vehicleCostsPage.Road.getText());

    }


    @When("the user Manage filters is clicked.")
    public void the_user_Manage_filters_is_clicked() {

        JavascriptExecutor jse=(JavascriptExecutor) Driver.get();
        jse.executeScript("arguments[0].click();", vehicleCostsPage.managefilters);
        BrowserUtils.waitFor(4);

    }

    @When("the user Type is clicked.")
    public void the_user_Type_is_clicked() {

        JavascriptExecutor jse=(JavascriptExecutor) Driver.get();
        jse.executeScript("arguments[0].click();", vehicleCostsPage.typeclick);
        BrowserUtils.waitFor(4);

    }

    @When("the user Type:All is clicked.")
    public void the_user_Type_All_is_clicked() {

        JavascriptExecutor jse=(JavascriptExecutor) Driver.get();
        jse.executeScript("arguments[0].click();", vehicleCostsPage.TypeAll);
        BrowserUtils.waitFor(4);

    }

    @When("the user Update is clicked.")
    public void the_user_Update_is_clicked() {

        JavascriptExecutor jse=(JavascriptExecutor) Driver.get();
        jse.executeScript("arguments[0].click();", vehicleCostsPage.update);
        BrowserUtils.waitFor(4);
    }

    @Then("the user verify see that Type:All are not visible")
    public void the_user_verify_see_that_Type_All_are_not_visible() {

        vehicleCostsPage.waitUntilLoaderScreenDisappear();
        Assert.assertFalse(vehicleCostsPage.type.isDisplayed());


    }




}
