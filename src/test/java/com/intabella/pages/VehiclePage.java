package com.intabella.pages;

import com.intabella.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class VehiclePage {
    public VehiclePage() {
        PageFactory.initElements(Driver.get(), this);
    }
}
