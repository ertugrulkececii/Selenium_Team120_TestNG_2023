package tests.day17_testNGFramework_assertions;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.security.Key;

public class C01_configurationPropertiesKullanimi {
    @Test
    public void test01(){
      //// amazon anasayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        //// arama kutusuna aranacak kelimeyi yazdirin ve aratin
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.aramaKutusu.sendKeys(ConfigReader.getProperty("amazonAranacakKelime")+ Keys.ENTER);
        //// arama sonuclarinin aranan kelimeyi icerdigini test edin
        String expectedIcerik=ConfigReader.getProperty("amazonAranacakKelime");
        String actualAramaSonucu=amazonPage.sonucYaziElementi.getText();
        Assert.assertTrue(actualAramaSonucu.contains(expectedIcerik));

        ReusableMethods.webElementFotografCek(amazonPage.sonucYaziElementi, "amazon");
        //// sayfayi kapatin
        Driver.closeDriver();
    }
}
