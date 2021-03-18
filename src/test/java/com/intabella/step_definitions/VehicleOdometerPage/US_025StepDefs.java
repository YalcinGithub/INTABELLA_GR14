package com.intabella.step_definitions.VehicleOdometerPage;

import com.intabella.pages.VehicleOdometerPage;
import com.intabella.pages.VehicleCostsPage;
import com.intabella.utilities.BrowserUtils;
import com.intabella.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class US_025StepDefs {

        // VehicleOdometerPage navigate = new VehicleOdometerPage();

        //US-025 Truck driver can see vehicle costs informations once navigate to vehicle page

    @When("the user navigated to  {string} and {string} sees")
    public void the_user_navigated_to_and_sees(String string, String string2) {

        VehicleOdometerPage navigate = new VehicleOdometerPage();
        navigate.fleetlink.click();
        BrowserUtils.waitFor(3); //expilicit wait

        JavascriptExecutor jse=(JavascriptExecutor) Driver.get();
        jse.executeScript("arguments[0].click();", navigate.vehiclecostlink);
        BrowserUtils.waitFor(2);

        // navigate.vehiclecostlink.click();
        //BrowserUtils.waitFor(3);

    }

    @Then("the user verify that  {string} informations  page openned.")
    public void the_user_verify_that_informations_page_openned(String string) {
        VehicleCostsPage navigate = new VehicleCostsPage();
        String expected ="Vehicle Costs";
        //System.out.println(navigate.textvehiclecost.getText());
        BrowserUtils.waitFor(15);
        Assert.assertEquals(expected,navigate.textvehiclecost.getText());
    }
        //US-025 Truck driver can change page number for getting following vehicle costs informations

    @When("the user clicks the right arrow")
    public void the_user_clicks_the_right_arrow() {

        BrowserUtils.waitFor(15);

        VehicleCostsPage vehiclecost = new VehicleCostsPage();
        vehiclecost.rightarrow.click();
        BrowserUtils.waitFor(10);

    }

    @Then("the user verify sees the page number changed to two")
    public void the_user_verify_sees_the_page_number_changed_to_two() {

        VehicleCostsPage vehiclecost = new VehicleCostsPage();

        // System.out.println(vehiclecost.numberone.getText());
        //Assert.assertEquals(expected,vehiclecost.numbertwo.getText());
        BrowserUtils.waitFor(10);

        //  System.out.println(vehiclecost.numbertwo.getAttribute("value"));
        Assert.assertEquals("2",vehiclecost.numbertwo.getAttribute("value"));

        vehiclecost.rightarrow.click();
        BrowserUtils.waitFor(3);//expilicit wait yap
    }

    @Then("the user verify sees the page number changed to three")
    public void the_user_verify_sees_the_page_number_changed_to_three() {

        BrowserUtils.waitFor(3);
        //System.out.println("the user verify sees the page number changed to three");
        VehicleCostsPage vehiclecost = new VehicleCostsPage();

        System.out.println(vehiclecost.numbertwo.getAttribute("value"));
        //String expected ="Of 3"; //2-1 i assert et.
        // System.out.println(vehiclecost.numbertwo.getText());
        //  Assert.assertEquals(expected,vehiclecost.numberthree.getText());
    }

        //US-025 Truck driver can change the entity number by clicking the View Per Page dropdown(10,25,50,100)

    @When("the user clicks {string} on the top right of the page")
    public void the_user_clicks_on_the_top_right_of_the_page(String string) {

        VehicleCostsPage vehiclecost = new VehicleCostsPage();
        BrowserUtils.waitFor(3);

        JavascriptExecutor jse=(JavascriptExecutor) Driver.get();
        jse.executeScript("arguments[0].click();", vehiclecost.dropdowntablesize);
        BrowserUtils.waitFor(2);

    }

    @When("the user select {int} forum options")
    public void the_user_select_forum_options(Integer int1) {

        VehicleCostsPage vehiclecost =new VehicleCostsPage();

        if (int1!=10){
            vehiclecost.dropdowntablesize.click();

        }
BrowserUtils.waitFor(5);
        vehiclecost.getdropdown(int1).click();
        BrowserUtils.waitFor(3);

    }

    @Then("verify row number on the table declared {int}")
    public void verify_row_number_on_the_table_declared(Integer int1) {
        //saydakı sayıları karsılastırıdk
        VehicleCostsPage vehiclecost =new VehicleCostsPage();
        int tablesize = vehiclecost.vehiclecosttable.size();
        System.out.println("tablesize = " + tablesize);

        if (int1==tablesize){
            Assert.assertTrue("tablesize",int1==tablesize);
        } else {
            Assert.assertTrue("tablesize",int1==Integer.parseInt(vehiclecost.dropdowntablesize.getText()));

        }

    }

    @Then("the user sees View per page options appear {string},{string},{string},{string}")
    public void the_user_sees_View_per_page_options_appear(String string, String string2, String string3, String string4) {

        VehicleCostsPage change = new VehicleCostsPage();
        for (WebElement option : change.table) {
            System.out.println(option.getText());

        }

        for (WebElement option : change.table) {
            System.out.println(option.getAttribute("data-size"));

        }

        BrowserUtils.waitFor(5);

    }

        //US-025 Truck driver can get all informations to her/his own email address by using Export Grid button in csv and xlsx formats

    @When("the user clicks {string} button in the upper left corner of the page")
    public void the_user_clicks_button_in_the_upper_left_corner_of_the_page(String string) {

        VehicleCostsPage vehiclecost = new VehicleCostsPage();
        BrowserUtils.waitFor(3);
        vehiclecost.exportgrid.click();
        BrowserUtils.waitFor(3);

    }

    @Then("the user sees options appear csv and xlsx formats")
    public void the_user_sees_options_appear_csv_and_xlsx_formats() {

        VehicleCostsPage change = new VehicleCostsPage();
        for (WebElement option : change.table2) {
            System.out.println(option.getText());

        }

        for (WebElement option : change.table2) {
            System.out.println(option.getAttribute("data-index"));

        }

        BrowserUtils.waitFor(5);

    }
/*
    VehicleCostPage options = new VehicleCostPage();
        options.type.isDisplayed();
        BrowserUtils.waitFor(3);

    }
*/

    @When("the user click {string} view forum options")
    public void the_user_click_view_forum_options(String string) {

        VehicleCostsPage vehiclecost = new VehicleCostsPage();
        BrowserUtils.waitFor(6);

        JavascriptExecutor jse=(JavascriptExecutor) Driver.get();
        jse.executeScript("arguments[0].click();", vehiclecost.csv);
        BrowserUtils.waitFor(1);
        // vehiclecost.csv.click();
        // BrowserUtils.waitFor(3);

        vehiclecost.exportgrid.click();
        BrowserUtils.waitFor(3);

    }

    @Then("the user verify export started successfully")
    public void the_user_verify_export_started_successfully() {

        //    System.out.println("the user verify export started successfully");
        VehicleCostsPage vehiclecost = new VehicleCostsPage();
        vehiclecost.xlsx.click();
        BrowserUtils.waitFor(3);


        // String expected ="Export started successfully. You will receive email notification upon completion.";
        System.out.println(vehiclecost.mesaj3.getText()); //xpath tekrar bak

        Assert.assertEquals("Export started successfully. You will receive email notification upon completion.",vehiclecost.mesaj3.getText());

     /*   Alert alert= Driver.get().switchTo().alert();
        System.out.println("alert.getText() = " + alert.getText());
        String expected="Export started successfully. You will receive email notification upon completion.";
        Assert.assertEquals(expected,alert.getText());
*/
    }

}