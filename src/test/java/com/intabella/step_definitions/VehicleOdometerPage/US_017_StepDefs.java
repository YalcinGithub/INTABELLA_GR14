package com.intabella.step_definitions.VehicleOdometerPage;

import com.intabella.pages.BasePage;
import com.intabella.pages.VehicleCostsPage;
import com.intabella.pages.VehicleOdometerPage;
import com.intabella.utilities.BrowserUtils;
import com.intabella.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;

import java.util.ArrayList;
import java.util.List;

public class US_017_StepDefs {
    VehicleOdometerPage vehicleOdometerPage = new VehicleOdometerPage();
    VehicleCostsPage vehicleCostsPage = new VehicleCostsPage();
    JavascriptExecutor js = (JavascriptExecutor) Driver.get();


    @And("the user selects all columns")
    public void theUserSelectsAllColumns() {

        BrowserUtils.waitFor(1);
        js.executeScript("arguments[0].click();", vehicleOdometerPage.selectAllButton);
    }

    @And("the user navigates to {string} , {string}")
    public void theUserNavigatesTo(String arg0, String arg1) {

        vehicleOdometerPage.navigateToModule(arg0, arg1);
    }

    @Then("the user should be able to see the page {string}")
    public void theUserShouldBeAbleToSeeThePage(String expectedTitle) {
        BrowserUtils.waitFor(2);
        Assert.assertTrue(Driver.get().getTitle().contains(expectedTitle));
    }

    @When("the user clicks {string} button")
    public void theUserClicksButton(String buttonName) {

       BrowserUtils.waitFor(5);
        WebElement myButton;
        switch (buttonName) {
            case "Grid Settings" -> myButton = vehicleOdometerPage.gridSettingsButton;
            case "Reset" -> myButton = vehicleOdometerPage.resetButton;
            case "Filters" -> myButton = vehicleOdometerPage.filtersButton;
            case "Manage filters" -> myButton = vehicleOdometerPage.manageFiltersButton;
            case "Filter criteria" -> myButton = vehicleOdometerPage.filterCriteriaSelectorButton;
            case "Update" -> myButton = vehicleOdometerPage.updateButton;
            case "Refresh" -> myButton = vehicleOdometerPage.refreshButton;
            case "Add Widget" -> myButton = vehicleCostsPage.addWidgetButton;
            case "Recent emails" -> myButton = vehicleCostsPage.recentEmailAddButton;
            case "Sticky Note" -> myButton = vehicleCostsPage.stickyNoteAddButton;
            case "Task list" -> myButton = vehicleCostsPage.taskListAddButton;
            case "Pin Button" -> myButton = vehicleCostsPage.pinButton;
            case "Favorite Button" -> myButton = vehicleCostsPage.favouriteButton;
            case "Close the Sidebar Widgets Pop-up" -> myButton = vehicleCostsPage.closeThePopupButton;
            case "Add Event" -> myButton = vehicleCostsPage.addEventButton;
            case "Activity Tab" -> myButton = vehicleCostsPage.activityTab;

            default -> throw new IllegalStateException("Unexpected value: " + buttonName);
        }
        assert myButton != null;
        BrowserUtils.waitFor(1);
        myButton.click();




    }

    @Then("the user should see the columns in correct number and order")
    public void theUserShouldSeeTheColumnsInCorrectNumberAndOrder() {
        List<String> columnsExpected = new ArrayList<>();
        for (int i = 6; i < 12; i++) {
            String xpath = "(//label)[" + i + "]";
            columnsExpected.add(Driver.get().findElement(By.xpath(xpath)).getText().toUpperCase());
        }
        vehicleOdometerPage.gridSettingsButton.click();

        List<String> columnsActual = new ArrayList<>();

        for (WebElement webElement : vehicleOdometerPage.actualColumns) {
            if (webElement.getText().equals("")) {
            } else {
                columnsActual.add(webElement.getText());
            }
        }

        Assert.assertEquals(columnsExpected, columnsActual);
    }

    @Then("the user should be able to see the {string} menu")
    public void theUserShouldBeAbleToSeeTheMenu(String arg0) {

        WebElement element;
        switch (arg0) {
            case "Multiselect" -> element = vehicleOdometerPage.multiSelectMenu;
            case "Filter criteria dropdown" -> element = vehicleOdometerPage.filterCriteriaDropdownMenu;
            default -> throw new IllegalStateException("Unexpected value: " + arg0);
        }
        Assert.assertTrue(element.isDisplayed());
    }

    @When("the user selects {string} option")
    public void theUserSelectsOption(String arg0) {

        vehicleOdometerPage.selectOptionFromDropdown(arg0);
    }

    @Then("the user selects {string} option from the dropdown option menu")
    public void theUserSelectsOptionFromTheDropdownOptionMenu(String arg0) {
        vehicleOdometerPage.selectFromFilterCriteriaDropdownOptions(arg0);
    }

    @And("the user enters {string} keyword in to the  input box")
    public void theUserEntersKeywordInToTheInputBox(String arg0) {

        vehicleOdometerPage.inputBox.sendKeys(arg0);

    }

    @Then("the user should be able to see the results for filter type {string}, condition {string}, and input {string}")
    public void theUserShouldBeAbleToSeeTheResultsForFilterTypeConditionAndInput(String type, String condition, String input) {
        BrowserUtils.waitFor(3);
        String xpathOfResults = "//*[starts-with(@id,'grid-custom-entity-grid')]/div[2]/div[2]/div[2]/div/table/tbody/tr";
        List<WebElement> results = Driver.get().findElements(By.xpath(xpathOfResults));

        int indexColumnOfType = BrowserUtils.getIndexOfElementFromList(vehicleOdometerPage.actualColumns, type);

        List<WebElement> resultsOfColumnOfType = new ArrayList<>();

        for (WebElement resultRow : results) {

            resultsOfColumnOfType.add(Driver.get().findElement(By.xpath(xpathOfResults + "/td[" + (indexColumnOfType + 1) + "]")));
        }

        if ("Is Equal To".equals(condition)) {
            for (WebElement element : resultsOfColumnOfType) {
                Assert.assertEquals(input, element.getText());
            }
        }
    }

    @Then("the user should be able to see the Loader Mask and it disappears again")
    public void theUserShouldBeAbleToSeeTheLoaderMaskAndItDisappearsAgain() {
        Assert.assertTrue(vehicleOdometerPage.loaderMask.isDisplayed());
        vehicleOdometerPage.waitUntilLoaderScreenDisappear();
        Assert.assertFalse(vehicleOdometerPage.loaderMask.isDisplayed());
    }

    @Given("the user uses filtering options in Vehicle Odometer Page")
    public void theUserUsesFilteringOptionsInVehicleOdometerPage() {
        theUserClicksButton("Filters");
        theUserClicksButton("Manage filters");
        theUserShouldBeAbleToSeeTheMenu("Multiselect");
        theUserSelectsOption("Driver");
        Assert.assertTrue(vehicleOdometerPage.filterCriteriaSelectorButton.isDisplayed());
    }

    @Then("the user should be able to see that Filter Buttons are not visible")
    public void theUserShouldBeAbleToSeeThatFilterButtonsAreNotVisible() {
        Assert.assertFalse(vehicleOdometerPage.filterCriteriaSelectorButton.isDisplayed());
    }

    //http://qa.intabella.com/entity/Extend_Entity_VehiclesOdometer

}
