package com.intabella.step_definitions.VehicleCostPage;

import com.intabella.pages.VehicleCostsPage;
import com.intabella.step_definitions.VehicleOdometerPage.US_017_StepDefs;
import com.intabella.utilities.BrowserUtils;
import com.intabella.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class US_027_StepDefs {

    VehicleCostsPage vehicleCostsPage = new VehicleCostsPage();

    @Then("the user should be able to see the {string} widget")
    public void theUserShouldBeAbleToSeeTheWidget(String expectedWidgetName) {
        BrowserUtils.waitFor(2);
        int sizeOfSidebar = vehicleCostsPage.sidebarWidgetsList.size();
        System.out.println("sizeOfSidebar = " + sizeOfSidebar);
        String actualWidget = vehicleCostsPage.sidebarWidgetsList.get(sizeOfSidebar - 1).getText();
        if (actualWidget.length() < 1) {
            System.out.println("loopa girdi");
            actualWidget = vehicleCostsPage.sidebarWidgetsList.get(sizeOfSidebar - 1).getAttribute("title");
        }
        Assert.assertEquals(expectedWidgetName, actualWidget);
        deleteAllTheWidgets();
    }

    @Then("the user should be able to see the Pin Menu Shortcut")
    public void theUserShouldBeAbleToSeeThePinMenuShortcut() {
        String expectedPageName = Driver.get().getTitle();
        String actualPinShortcutText = vehicleCostsPage.pinShortcutMenu.getAttribute("title");

        if (actualPinShortcutText.length() < 1) {
            actualPinShortcutText = vehicleCostsPage.pinShortcutMenu.getText();
        }
        Assert.assertEquals(expectedPageName, actualPinShortcutText);

    }

    @Then("the user should be able to see that Page is added to the Favorites")
    public void theUserShouldBeAbleToSeeThatPageIsAddedToTheFavorites() {

        BrowserUtils.waitFor(2);

        Driver.get().findElement(By.xpath("//i[@class='fa-bars']")).click();
        Driver.get().findElement(By.xpath("//*[@id=\"favorite-tab\"]/a")).click();
        BrowserUtils.waitFor(2);

        while (vehicleCostsPage.favoritesList.size() > 0) {
            Driver.get().findElement(By.xpath("//*[@id=\"favorite-content\"]/ul/li/button")).click();
        }
        Driver.get().findElement(By.xpath("//i[@class='fa-bars']")).click();

        new US_017_StepDefs().theUserClicksButton("Favorite Button");

        Driver.get().findElement(By.xpath("//i[@class='fa-bars']")).click();
        Driver.get().findElement(By.xpath("//*[@id=\"favorite-tab\"]/a")).click();
        BrowserUtils.waitFor(2);

        String expectedPageName = Driver.get().getTitle();
        String actualText = vehicleCostsPage.favoritesList.get(0).getText();


        Assert.assertEquals(expectedPageName, actualText);

    }

    public void deleteAllTheWidgets() {
        while (vehicleCostsPage.sidebarWidgetsList.size() > 0) {
            BrowserUtils.waitFor(1);
            Driver.get().findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/div/div[1]/div[2]/div/div[1]/div[3]/button")).click();
            BrowserUtils.waitFor(1);
            Driver.get().findElement(By.xpath("//div[@class='dropdown open']//a[@title='Remove'][normalize-space()='Remove']")).click();
            BrowserUtils.waitFor(1);
            Driver.get().findElement(By.xpath("//a[normalize-space()='Yes, Delete']")).click();
        }
    }
}
