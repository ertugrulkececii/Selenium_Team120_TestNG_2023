package tests.day17_testNGFramework_assertions;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C04_Assertions {
    @Test
    public void test01() {
        // amazon anasayfaya gidelim
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
// url'in amazon icerdigini test edelim
String expectedIcerik="amazon";
String actualIcerik=Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualIcerik.contains(expectedIcerik));
// aranacak kelimeyi aratalim
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.aramaKutusu.sendKeys(ConfigReader.getProperty("amazonAranacakKelime")+ Keys.ENTER);
// sonuclarin aranacak kelimeyi icerdigini test edelim
String expectedSonucIcerik=ConfigReader.getProperty("amazonAranacakKelime");
String actualSonucYazisi=amazonPage.sonucYaziElementi.getText();

Assert.assertTrue(actualSonucYazisi.contains(expectedSonucIcerik));
// ilk urune tiklayalim
amazonPage.ilkUrunElementi.click();
// ilk urun isminde aranacak kelime bulundugunu test edelim
        String expectedSonucIsim=ConfigReader.getProperty("amazonAranacakKelime");
        String actualIsim=amazonPage.ilkUrunIsimElementi.getText();
        Assert.assertTrue(actualIsim.contains(expectedSonucIsim));
// sayfayi kapatalim

        Driver.closeDriver();

    }
}
