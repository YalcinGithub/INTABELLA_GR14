package com.intabella.step_definitions.VehicleCostPage;

import com.intabella.pages.DashboardPage;
import com.intabella.pages.VehicleCostsPage;
import com.intabella.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US_032_StepDefs {

    DashboardPage dashboardPage = new DashboardPage();
    VehicleCostsPage vehicleCostsPage = new VehicleCostsPage();

    @When("the user clicks first column of Type row")
    public void the_user_clicks_first_column_of_Type_row() {
        BrowserUtils.waitFor(3);
        vehicleCostsPage.firstTypeColumn.click();
    }

    @Then("the user should be able to see General Information of chosen type")
    public void the_user_should_be_able_to_see_General_Information_of_chosen_type() {
        String GenInfo = "General Information";
        Assert.assertEquals(vehicleCostsPage.generalInformationButton.getText(), GenInfo);
    }

    @When("the user clicks Add Attachment button")
    public void the_user_clicks_Add_Attachment_button() {
        BrowserUtils.waitFor(4);
        vehicleCostsPage.addAttachmentButton.click();

    }

    @Then("Add Attachment Window should popup")
    public void add_Attachment_Window_should_popup() {
        String AddAttachmentPopUp = "Add Attachment";

        BrowserUtils.waitFor(3);
        System.out.println(vehicleCostsPage.AddAttachmentPopUp.getText());
        Assert.assertEquals(vehicleCostsPage.AddAttachmentPopUp.getText(), AddAttachmentPopUp);
    }

    @When("the user clicks Choose File button")
    public void the_user_clicks_Choose_File_button() {
        BrowserUtils.waitFor(4);

        String ProjectPath = System.getProperty("user.dir");
        System.out.println(System.getProperty("user.dir"));

        String FilePath = "src\\test\\resources\\features\\TestFile.feature";
        System.out.println(FilePath);
        System.out.println("--------------------------------------------");
        String FullPath = ProjectPath+"\\"+FilePath;
        System.out.println(FullPath);


        vehicleCostsPage.ChooseFile.sendKeys("C:\\Users\\anvar\\Desktop\\Common Interview Questions  (1).pdf");

    }

    @When("the user chooses file from his PC")
    public void the_user_chooses_file_from_his_PC() {

    }

    @When("the user clicks Save button")
    public void the_user_clicks_Save_button() {
        vehicleCostsPage.saveButton.click();
        BrowserUtils.waitFor(3);
    }

    @Then("the user should be able to see {string} message")
    public void the_user_should_be_able_to_see_message(String string) {
        String message = "Attachment created successfully";
        Assert.assertEquals(vehicleCostsPage.attachmentCreatedMessage.getText(), message);

    }

    @Then("the user should be able to see the update in vehicle cost general information page")
    public void the_user_should_be_able_to_see_the_update_in_vehicle_cost_general_information_page() {
        String generalInformation = "General Information";
        Assert.assertEquals(vehicleCostsPage.GeneralInformationPage.getText(), generalInformation);
    }


}
