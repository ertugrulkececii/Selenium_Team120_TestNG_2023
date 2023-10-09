package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLInputElement;
import utilities.Driver;

public class FacebookPage {


    public FacebookPage() {

        PageFactory.initElements(Driver.getDriver(), this);


    }

    @FindBy(id = "email")
    public WebElement emailKutusu;
    @FindBy(id = "pass")
    public WebElement passwordKutusu;
    @FindBy(xpath = "//button[@name='login']")
    public WebElement loginButonu;
    @FindBy(xpath = "//*[@*='accept_button']")
    public WebElement cookiesKabulButonu;
    @FindBy(xpath = "//div[@class='_9ay7']")
    public WebElement girisYapilamadiYaziElementi;
}
