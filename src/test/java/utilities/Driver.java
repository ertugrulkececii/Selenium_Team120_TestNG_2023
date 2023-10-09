package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {
    // JUnit'te WebDriver objemizi TestBase'den aliyorduk, TestNG extends ile baglanma zorunlulugununu ortadan kaldirmak
    //ve kontrolu testerlara vermek icin testbase yerine driver classínda statik 2 method ile
    // driver olusturma ve kapatma islemlerini tercih etmistir.
    static WebDriver driver;
    public static WebDriver getDriver(){

        WebDriverManager.chromedriver().setup();
        if (driver==null){
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        return driver;
    }
    public static void closeDriver(){
        if (driver!=null){
            driver.close();
            driver = null;
        }
    }
}
