package pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WebappsecurityPage {

    public WebappsecurityPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }


}
