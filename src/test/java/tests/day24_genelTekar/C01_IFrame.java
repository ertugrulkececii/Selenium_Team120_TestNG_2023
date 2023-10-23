package tests.day24_genelTekar;

import org.testng.annotations.Test;
import pages.WebUniPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_IFrame {

    @Test
    public void Test01(){
        //1.“http://webdriveruniversity.com/IFrame/index.html” sayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("webUniUrl"));
        //2.“Our Products” butonuna basin
        WebUniPage webUniPage=new WebUniPage();
        //3.“Cameras product”i tiklayin
        //4.Popup mesajini yazdirin
        //5.“close” butonuna basin
        //6.“WebdriverUniversity.com (IFrame)” linkini tiklayin
        //7.“http://webdriveruniversity.com/index.html” adresine gittigini test edin
    }

}
