package tests.day19_testNGReports_crossBrowserTest;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C01_RaporluTest extends TestBaseRapor {

    @Test
    public void nutellaTesti(){

        extentTest = extentReports.createTest("Amazon Arama Testi", "Kullanici Amazonda urun aratip ilk urune gidebilmeli");
        // amazon anasayfaya gidelim
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        extentTest.info("Kullanici Amazon anasayfaya gider.");
// url'in amazon icerdigini test edelim
        String expectedIcerik="amazon";
        String actualIcerik=Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualIcerik.contains(expectedIcerik));
        extentTest.pass("url'in Amazon icerdigini test eder.");
// aranacak kelimeyi aratalim
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.aramaKutusu.sendKeys(ConfigReader.getProperty("amazonAranacakKelime")+ Keys.ENTER);
        extentTest.info("Test datasi olarak belirlenen kelimeyi aratir.");
// sonuclarin aranacak kelimeyi icerdigini test edelim
        String expectedSonucIcerik=ConfigReader.getProperty("amazonAranacakKelime");
        String actualSonucYazisi=amazonPage.sonucYaziElementi.getText();

        Assert.assertTrue(actualSonucYazisi.contains(expectedSonucIcerik));
        extentTest.pass("Amazon arama sonuclarinin aranan kelimeyi icerdigini test eder.");
// ilk urune tiklayalim
        amazonPage.ilkUrunElementi.click();
        extentTest.info("ilk urunu tiklar");
// ilk urun isminde aranacak kelime bulundugunu test edelim
        String expectedSonucIsim=ConfigReader.getProperty("amazonAranacakKelime");
        String actualIsim=amazonPage.ilkUrunIsimElementi.getText();
        Assert.assertTrue(actualIsim.contains(expectedSonucIsim));
        extentTest.pass("ilk urun isminde aranacak kelime bulundugunu test eder");
// sayfayi kapatalim

        Driver.closeDriver();
extentTest.info("sayfayi kapatir.");
    }
}
