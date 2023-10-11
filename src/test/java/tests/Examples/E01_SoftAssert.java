package tests.Examples;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class E01_SoftAssert {

    @Test
    public void Test01(){
        //https://zero.webappsecurity.com/ adresine gidin.
        Driver.getDriver().get(ConfigReader.getProperty("webSecurityUrl"));
    }
}
