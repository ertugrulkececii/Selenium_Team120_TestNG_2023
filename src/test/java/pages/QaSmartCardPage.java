package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QaSmartCardPage {

    public QaSmartCardPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@data-turbo='false'])[1]")
    public WebElement smartCardSignIn;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordBox;   //

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton2; //

    @FindBy(xpath = "(//a[@class='link-info fs-6 text-decoration-none'])[2]")
    public WebElement creatAccountSignIn;  // signIn sayfasindaki creat account tiklama elementi

    @FindBy(id = "first_name")
    public WebElement creatAccountNameBox;

    @FindBy(xpath = "//*[text()='Submit']")
    public WebElement getCreatAccountSignIn; // creat account'un icindeki submit butonu //input[@type='checkbox']

    @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement policyCreatAccountButton;

    @FindBy(xpath = "(//span[@style='cursor: pointer;'])[1]")
    public WebElement passwordVisibilityElementi1;
    @FindBy(xpath = "(//span[@style='cursor: pointer;'])[2]")
    public WebElement passwordVisibilityElementi2;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement CreatAccoutSubmitButton1;
}
