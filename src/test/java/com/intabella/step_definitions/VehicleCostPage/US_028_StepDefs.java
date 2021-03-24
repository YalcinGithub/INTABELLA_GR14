package com.intabella.step_definitions.VehicleCostPage;

import com.intabella.utilities.BrowserUtils;
import com.intabella.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class US_028_StepDefs {

    Actions actions = new Actions(Driver.get());

    @When("move your mouse on the three dot on the top of the  vehicle cost line's right sign")
    public void move_your_mouse_on_the_three_dot_on_the_top_of_the_vehicle_cost_line_s_right_sign() {



        BrowserUtils.waitFor(5);
        WebElement points = Driver.get().findElement(By.xpath("//div[2]/div[2]/div[2]/div/table/tbody/tr[1]/td[4]/div/div/a"));
        actions.moveToElement(points).perform();
        BrowserUtils.waitFor(5);

    }

    @When("click  view button by using eye sign inside … sign.")
    public void click_view_button_by_using_eye_sign_inside_sign() {

        WebElement viewButton = Driver.get().findElement(By.xpath("//i[@class='fa-eye hide-text']"));
        actions.moveToElement(viewButton).perform();
        viewButton.click();
        BrowserUtils.waitFor(5);


    }

    @Then("verify view general information page")
    public void verify_view_general_information_page() {


        String actualMessage = Driver.get().findElement(By.xpath("//div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/h5/span")).getText();
        String expectedMessage = "General Information";
        Assert.assertEquals(expectedMessage,actualMessage);


    }

    @When("click  edit  button by using edit inside … sign.")
    public void click_edit_button_by_using_edit_inside_sign() {
        WebElement editButton = Driver.get().findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu__action-cell launchers-dropdown-menu detach dropdown-menu__floating']//i[@class='fa-pencil-square-o hide-text']"));
        actions.moveToElement(editButton).perform();
        editButton.click();
        BrowserUtils.waitFor(5);

    }

    @Then("verify seen {string} message top of and middle of the page")
    public void verify_seen_message_top_of_and_middle_of_the_page(String string) {

        String actualMessage = Driver.get().findElement(By.xpath("//*[@id=\"flash-messages\"]/div/div/div/div")).getText();
        String expectedMessage = "You do not have permission to perform this action.";
        Assert.assertEquals(expectedMessage,actualMessage);

    }

    @When("move your mouse …sign on the top of the  vehicle cost line's right sign")
    public void move_your_mouse_sign_on_the_top_of_the_vehicle_cost_line_s_right_sign() {
        BrowserUtils.waitFor(5);
        WebElement points = Driver.get().findElement(By.xpath("//div[2]/div[2]/div[2]/div/table/tbody/tr[1]/td[4]/div/div/a"));
        actions.moveToElement(points).perform();
        BrowserUtils.waitFor(5);


    }

    @When("click  delete  button by using recycle bin inside … sign.")
    public void click_delete_button_by_using_recycle_bin_inside_sign() {

        WebElement eraseButton = Driver.get().findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu__action-cell launchers-dropdown-menu detach dropdown-menu__floating']//i[@class='fa-trash-o hide-text']"));
        actions.moveToElement(eraseButton).perform();
        eraseButton.click();


    }

    @When("click yes,delete button.")
    public void click_yes_delete_button() {

        WebElement acceptButton = Driver.get().findElement(By.xpath("//a[normalize-space()='Yes, Delete']"));
        BrowserUtils.waitFor(5);
        acceptButton.click();
        BrowserUtils.waitFor(5);


    }





}





