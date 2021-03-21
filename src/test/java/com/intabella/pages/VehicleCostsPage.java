package com.intabella.pages;

import com.intabella.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VehicleCostsPage extends BasePage {

    public VehicleCostsPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//h1[@class='oro-subtitle']")
    public WebElement textvehiclecost;

    @FindBy(xpath = "//i[@class=\"fa-chevron-right hide-text\"]")
    public WebElement rightarrow;

    @FindBy(xpath = "(//div[@class=\"pagination pagination-centered\"]//li)[2]/input")
    public WebElement numbertwo;

    @FindBy(xpath = "(//button[@data-toggle=\"dropdown\"])[1]")
    public WebElement dropdowntablesize;

    @FindBy(xpath = "(//a[@class=\"dropdown-item\"])[1]")
    public WebElement ten;

    @FindBy(xpath = "(//a[@class=\"dropdown-item\"])[2]")
    public WebElement twentyfive;

    @FindBy(xpath = "(//a[@class=\"dropdown-item\"])[3]")
    public WebElement fifty;

    @FindBy(xpath = "(//a[@class=\"dropdown-item\"])[4]")
    public WebElement hundred;

    @FindBy(xpath = "(//div[@class=\"btn-group\"])/a")
    public WebElement exportgrid;

    @FindBy(xpath = "//a[contains(@title,'CSV')]")
    public WebElement csv;

    @FindBy(xpath = "//a[contains(@title,'XLSX')]")
    public WebElement xlsx;

    @FindBy(xpath = "(//ul[@class=\"dropdown-menu pull-right\"])[2]")
    public List<WebElement> table;

    @FindBy(xpath = "(//td[@class='number-cell grid-cell grid-body-cell grid-body-cell-TotalPrice'])[1]")
    public WebElement text;

    @FindBy(xpath = "(//ul[@class='dropdown-menu'])[3]")
    public List<WebElement> table2;

    @FindBy(xpath = "//div[@class='message']")
    public WebElement mesaj3;

    @FindBy(xpath = "//table[@class='grid table-hover table table-bordered table-condensed']/tbody/tr")
    public List<WebElement> vehiclecosttable;

    @FindBy(xpath = "//*[@id='mCSB_1_container']/div/div")
    public List<WebElement> sidebarWidgetsList;

    @FindBy(xpath = "//button[@class='sidebar__add-widget']")
    public WebElement addWidgetButton;

    @FindBy(xpath = "/html/body/div[6]/div[2]/div[2]/div[1]/table/tbody/tr[1]/td[4]/a")
    public WebElement recentEmailAddButton;

    @FindBy(xpath = "/html/body/div[6]/div[2]/div[2]/div[2]/table/tbody/tr[1]/td[4]/a")
    public WebElement stickyNoteAddButton;

    @FindBy(xpath = "/html/body/div[6]/div[2]/div[2]/div[3]/table/tbody/tr[1]/td[4]/a")
    public WebElement taskListAddButton;

    @FindBy(xpath = "//a[@class='btn cancel']")
    public WebElement closeThePopupButton;

    @FindBy(xpath = "//*[@id=\"bookmark-buttons\"]/div/div/button[2]/i")
    public WebElement pinButton;

    @FindBy(xpath = "//*[@id=\"bookmark-buttons\"]/div/div/button[1]/i")
    public WebElement favouriteButton;

    @FindBy(xpath = "//*[@id=\"favorite-content\"]/ul/li/a")
    public List<WebElement> favoritesList;

    @FindBy(xpath = "//div[2]/div[1]/div/div/div[1]/div[1]/div[2]/a")
    public WebElement addEventButton;

    @FindBy(xpath = "//*[starts-with(@id,'oro_calendar_event_form_title')]")
    public WebElement addEventFormTitleBox;

    @FindBy(css = ".btn.btn-primary")
    public WebElement addEventFormSaveButton;

    @FindBy(xpath = "//a[normalize-space()='Activity']")
    public WebElement activityTab;




    public WebElement getdropdown(int size) {
        WebElement number;
        //if-switch case
        switch (size) {
            case 10:
                number = ten;
                break;
            case 25:
                number = twentyfive;
                break;
            case 50:
                number = fifty;
                break;
            case 100:
                number = hundred;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + size);
        }
        return number;


    }
}
