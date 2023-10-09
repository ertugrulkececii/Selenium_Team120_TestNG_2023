package tests.day16_testNG_framework;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C02_PageClassKullanimi {
    @Test
    public void nutellaTesti(){

        Driver.getDriver().get("https://www.amazon.com");

        AmazonPage amazonPage=new AmazonPage();

        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
        String expectedIcerik="Nutella";
        String actualSonucYazisi=amazonPage.sonucYaziElementi.getText();
        Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik));

        Driver.closeDriver();
    }
}
