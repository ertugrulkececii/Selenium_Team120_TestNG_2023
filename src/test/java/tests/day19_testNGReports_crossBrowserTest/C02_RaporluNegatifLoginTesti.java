package tests.day19_testNGReports_crossBrowserTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class C02_RaporluNegatifLoginTesti extends TestBaseRapor {
    //1- https://www.qualitydemy.com/ anasayfasina gidin
    //2- login linkine basin
    // 3-  3 farkli test method’u olusturun.
    // - gecerli username, gecersiz password
    // - gecersiz username, gecerli password
    // - gecersiz username, gecersiz password.
    //4- Login butonuna basarak login olun
    //5- Basarili olarak giris yapilamadigini test edin
    QualitydemyPage qualitydemyPage;
    @Test
    public void gecersizPasswordTest(){
extentTest =extentReports.createTest("Gecersiz Password Test","gecerli username, gecersiz password");
        Driver.getDriver().get("https://www.qualitydemy.com/");
extentTest.info("Kullsnici qualtydemy anasayfasina gider");
        qualitydemyPage= new QualitydemyPage();
        qualitydemyPage.ilkLoginButonu.click();
extentTest.info("ilk sayfadaki login butonuna tiklar");
        qualitydemyPage.emailKutusu.sendKeys("anevzatcelik@gmail.com");
        qualitydemyPage.passwordKutusu.sendKeys("12345");
        QualitydemyPage qualitydemyPage=new QualitydemyPage();
        qualitydemyPage.acceptCookies.click();
        ReusableMethods.bekle(3);
        qualitydemyPage.loginButonu.click();

        ReusableMethods.bekle(1);
        Assert.assertTrue(qualitydemyPage.emailKutusu.isDisplayed());
extentTest.pass("giris yapilamadigini test eder.");
        Driver.closeDriver();
        extentTest.info("Driver'i kapatir");
    }

    @Test
    public void gecersizEmailTesti(){
        extentTest =extentReports.createTest("Gecersiz Email Test","gecersiz username, gecerli password");
        Driver.getDriver().get("https://www.qualitydemy.com/");

        qualitydemyPage= new QualitydemyPage();
        qualitydemyPage.ilkLoginButonu.click();
        qualitydemyPage.emailKutusu.sendKeys("alican@gmail.com");
        qualitydemyPage.passwordKutusu.sendKeys("Nevzat152032");
        qualitydemyPage.acceptCookies.click();
        ReusableMethods.bekle(2);
        qualitydemyPage.loginButonu.click();

        ReusableMethods.bekle(1);
        Assert.assertTrue(qualitydemyPage.emailKutusu.isDisplayed());
        extentTest.pass("Giris yapilamadigini test eder.");
        Driver.closeDriver();
    }

    @Test
    public void gecersizEmailPasswordTesti(){
        extentTest =extentReports.createTest("Gecersiz Email Password Test","gecersiz username, gecersiz password");
        Driver.getDriver().get("https://www.qualitydemy.com/ ");
extentTest.info("sayfaaya gidildi");
        qualitydemyPage= new QualitydemyPage();
        qualitydemyPage.acceptCookies.click();
        ReusableMethods.bekle(2);
        qualitydemyPage.ilkLoginButonu.click();
        qualitydemyPage.emailKutusu.sendKeys("alican@gmail.com");
        qualitydemyPage.passwordKutusu.sendKeys("12345");
        qualitydemyPage.loginButonu.click();

        ReusableMethods.bekle(1);
        Assert.assertTrue(qualitydemyPage.emailKutusu.isDisplayed());
        extentTest.pass("Giris yapilamadigini test eder.");
        Driver.closeDriver();
    }
}
