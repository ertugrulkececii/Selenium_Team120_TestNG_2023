package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {
    /*
    TestNG'de page class'lari surekli kullandigimiz bir sayfa/webSitesi'ndeki
    locate'leri
    ilgili sayfada kullanilacak login gibi basit method'lari icerir.

    TestNG page class'larindaki locate'lere erisim icin Test class'larinda page class'indan obje olusuturulmasini
    benimsemistir.
     */
    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id="twotabsearchtextbox")
    public WebElement aramaKutusu;

    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement sonucYaziElementi;
}