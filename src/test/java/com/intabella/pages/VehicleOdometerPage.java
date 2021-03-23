package com.intabella.pages;

import com.intabella.utilities.BrowserUtils;
import com.intabella.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class VehicleOdometerPage extends BasePage {


    public VehicleOdometerPage() {

        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = "div#container>div:nth-of-type(2)>div>div>div:nth-of-type(2)>a")
    public WebElement createVehicleOdometerBtn;

    @FindBy(xpath = "//div[@class='btn-group pull-right']//button")
    public WebElement saveAndCloseBtn;


    @FindBy(xpath = "//span[@class='title title-level-1']")
    public WebElement fleetTab;

    @FindBy(xpath = "(//span[@class='title title-level-2'])[2]")
    public WebElement vehicleOdometerModule;


    @FindBy(linkText = "Create Vehicle Odometer")
    public WebElement CreateVehOdomBtn;



    @FindBy(xpath = "//button[contains(@class,'btn btn-medium')]")
    public WebElement addBtn;

    @FindBy(xpath = "//div[contains(@class,'ui-dialog-titlebar ui-corner-all')]//span")
    public WebElement titleSelectCarReservation;

    @FindBy(xpath = "(//input[@type='checkbox'])[3]")
    public WebElement checkBox;

    @FindBy(xpath = "//button[text()='Select']")
    public WebElement selectBtn;

    @FindBy(xpath = " //button[@type='submit']")
    public WebElement saveAndCloseBtn2;

    @FindBy(xpath = "(//div[@class='message'])[2]" )
    public WebElement dontHavePermissionWarning;

    @FindBy(xpath = "(//div[@class='message'])" )
    public WebElement dontHavePermissionFirstWarningMessage;

    @FindBy(xpath = "" )
    public WebElement EntitySavedMessage;

    @FindBy(xpath = " (//div[@class='pull-left']//a)[3]" )
    public WebElement licensePlateBoard;

    @FindBy(xpath = "//td[text()='try001']" )
    public WebElement licensePlateSelectCarreservationPage;







    @FindBy(xpath = "//div[2]/div[2]/div[2]/div/table/tbody/tr[1]/td[2]")
    public WebElement firstRowInformation;

    @FindBy(xpath = "(//div[1]/div/div/div[1]/div[1]/div[1]/a)[1]")
    public WebElement editButton;

    @FindBy(xpath = "//input[@data-name='field__odometer-value']")
    public WebElement odometerValueInbox;

    @FindBy(xpath = "//div[1]/div/div/div[2]/div[1]/div[4]/div/button")
    public WebElement saveAndCloseButton;

    @FindBy(xpath = "//div[@class='message']")
    public WebElement entitySavedMessage;

    @FindBy(xpath = "//span[@class='validation-failed']")
    public WebElement validationMessage;


    @FindBy(xpath = "//div[@class='column-manager-filter']")
    public WebElement showAllGridsButton;

    @FindBy(xpath = "//a[normalize-space()='Select All']")
    public WebElement selectAllButton;

//    @FindBy(xpath = "//span[@class='grid-header-cell__label'][normalize-space()]")
//    public List<WebElement> actualColumns;

    @FindBy(xpath = "//div[2]/div[2]/div[2]/div/table/thead/tr/th")
    public List<WebElement> actualColumns;

    ////////////////////////////////////////

    @FindBy(xpath = "//a[normalize-space()='Manage filters']")
    public WebElement manageFiltersButton;

    @FindBy(xpath = "//*[starts-with(@id,'grid-custom-entity-grid')]/div[1]/div/div[2]/ul/li")
    public List<WebElement> manageFiltersList;

    ////////////////////////////////////////

    @FindBy(xpath = "//*[starts-with(@id,'grid-custom-entity-grid')]/div[1]/div/span/div")
    public List<WebElement> filterItemsList;

    @FindBy(xpath = "//*[starts-with(@id,'grid-custom-entity-grid')]/div[1]/div/span/div[3]/div[1]")
    public WebElement filterCriteriaSelectorButton;

    @FindBy(xpath = "//button[normalize-space()='contains']")
    public WebElement dropdownToggleButton;

    @FindBy(css = "span.title-level-1")
    public WebElement fleetlink;

    @FindBy(xpath = "//span[contains(text(),'Vehicle Costs')]")
    public WebElement vehiclecostlink;

    @FindBy(xpath = "//span[contains(text(),'Vehicle Odometer')]")
    public WebElement vehicleodometer;

    @FindBy(xpath = "//h1[contains(text(),'Vehicles Odometers')]")
    public WebElement title;


    public List<String> getFiltersList() {
        return BrowserUtils.getElementsText(manageFiltersList);
    }

    public List<String> getSelectedFiltersList() {
        List<String> selectedFilters = new ArrayList<>();
        for (WebElement element : manageFiltersList) {
            if (element.isSelected())
                selectedFilters.add(element.getText());
        }
        return selectedFilters;
    }

    public List<String> getFilterItemsListDisplayedText() {
        List<String> displayedItems = new ArrayList<>();
        for (WebElement element : filterItemsList) {
            if (element.isDisplayed())
                displayedItems.add(element.getText());
        }
        return displayedItems;
    }

    @FindBy(xpath = "//*[starts-with(@id,'grid-custom-entity-grid')]/div[1]/div/span/div[1]/div[2]/div/div[1]/button")
    public WebElement choiceFilterButton;

    public String getSelectedFilterChoice() {
        Select choiceDropdown = new Select(choiceFilterButton);
        return choiceDropdown.getFirstSelectedOption().getText();
    }

    @FindBy(xpath = "//*[starts-with(@id,'grid-custom-entity-grid')]/div[1]/div/div[2]")
    public WebElement multiSelectMenu;

    @FindBy(xpath = "//*[starts-with(@id,'grid-custom-entity-grid')]/div[1]/div/span/div[3]/div[2]")
    public WebElement filterCriteriaDropdownMenu;

    @FindBy(xpath = "//*[starts-with(@id,'grid-custom-entity-grid')]//span/div[3]/div[2]/div/div[1]/ul/li")
    public List<WebElement> filterCriteriaDropdownOptions;

    @FindBy(xpath = "//input[@name='value']")
    public WebElement inputBox;

    @FindBy(xpath = "//button[normalize-space()='Update']")
    public WebElement updateButton;

    public void selectOptionFromDropdown(String string) {
        manageFiltersList.get(BrowserUtils.getIndexOfElementFromList(manageFiltersList, string)).click();
    }

    public void selectFromFilterCriteriaDropdownOptions(String desiredOption) {
        dropdownToggleButton.click();

        for (WebElement option : filterCriteriaDropdownOptions) {
            if (option.getText().equals(desiredOption)) {
                option.click();
            }
        }
    }

}
