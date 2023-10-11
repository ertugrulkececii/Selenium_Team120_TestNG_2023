package tests.day16_testNG_framework;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class C05_QualitydemyNegatifLoginTesti {

        //1- https://www.qualitydemy.com/ anasayfasina gidin
        //2- login linkine basin
        // 3-  3 farkli test method’u olusturun.
        // - gecerli username, gecersiz password
        // - gecersiz username, gecerli password
        // - gecersiz username, gecersiz password.
        //4- Login butonuna basarak login olun
        //5- Basarili olarak giris yapilamadigini test edin
        QualitydemyPage qualitydemyPage;
        @Test(groups = {"e2e1","regression"})
        public void gecersizPasswordTest(){

            Driver.getDriver().get("https://www.qualitydemy.com/");

            qualitydemyPage= new QualitydemyPage();
            qualitydemyPage.ilkLoginButonu.click();

            qualitydemyPage.emailKutusu.sendKeys("anevzatcelik@gmail.com");
            qualitydemyPage.passwordKutusu.sendKeys("12345");
            QualitydemyPage qualitydemyPage=new QualitydemyPage();
            qualitydemyPage.acceptCookies.click();
            ReusableMethods.bekle(3);
            qualitydemyPage.loginButonu.click();

            ReusableMethods.bekle(1);
            Assert.assertTrue(qualitydemyPage.emailKutusu.isDisplayed());

            Driver.closeDriver();
        }

        @Test(groups = {"regression"})
        public void gecersizEmailTesti(){
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
            Driver.closeDriver();
        }

        @Test(groups = {"e2e1","smoke"})
        public void gecersizEmailPasswordTesti(){
            Driver.getDriver().get("https://www.qualitydemy.com/ ");

            qualitydemyPage= new QualitydemyPage();
            qualitydemyPage.acceptCookies.click();
            ReusableMethods.bekle(2);
            qualitydemyPage.ilkLoginButonu.click();
            qualitydemyPage.emailKutusu.sendKeys("alican@gmail.com");
            qualitydemyPage.passwordKutusu.sendKeys("12345");
            qualitydemyPage.loginButonu.click();

            ReusableMethods.bekle(1);
            Assert.assertTrue(qualitydemyPage.emailKutusu.isDisplayed());
            Driver.closeDriver();
        }
    }

