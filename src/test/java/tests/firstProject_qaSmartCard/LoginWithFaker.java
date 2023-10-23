package tests.firstProject_qaSmartCard;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import pages.QaSmartCardPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;


public class LoginWithFaker {

    Actions actions = new Actions(Driver.getDriver());
    static Faker faker = new Faker();

    QaSmartCardPage qaSmartCardPage = new QaSmartCardPage();
    WebElement webElement;


    @Test
    public void Test01() {
        //get(ConfigReader.getProperty("qaSmartCardLink"));
        Driver.getDriver().get(ConfigReader.getProperty("qaSmartCardLink"));
        qaSmartCardPage.smartCardSignIn.click();
        qaSmartCardPage.creatAccountSignIn.click();
        qaSmartCardPage.creatAccountNameBox.sendKeys(faker.name().firstName());
        actions.sendKeys(Keys.TAB).perform();
        ReusableMethods.bekle(2);
        actions.sendKeys(faker.name().lastName()).perform();
        actions.sendKeys(Keys.TAB).perform();
        String fakerEmail = faker.internet().emailAddress();
        System.out.println("Faker email: " + fakerEmail);
        actions.sendKeys(fakerEmail).perform();
        actions.sendKeys(Keys.TAB).perform();
        String password = faker.internet().password();
        password=password+".1";
        System.out.println("Password : " + password);
        actions.sendKeys(password).perform();
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(password).perform();
        qaSmartCardPage.passwordVisibilityElementi1.click();
        qaSmartCardPage.passwordVisibilityElementi2.click();
        if (password.length()>=8) {
            ReusableMethods.tumSayfaFotografCek("CreatAccountFoto");
        }
        Assert.assertTrue(password.length()>=8);
        qaSmartCardPage.policyCreatAccountButton.click();
        ReusableMethods.bekle(2);
        qaSmartCardPage.CreatAccoutSubmitButton1.sendKeys(Keys.ENTER);
        ReusableMethods.bekle(2);
        qaSmartCardPage.emailBox.sendKeys(fakerEmail);
        qaSmartCardPage.passwordBox.sendKeys(password);
        qaSmartCardPage.submitButton2.click();

    }

    @Test
    @Ignore
    public void Test02() {
        qaSmartCardPage.emailBox.sendKeys(faker.internet().emailAddress());
        qaSmartCardPage.passwordBox.sendKeys(faker.internet().password());
        ReusableMethods.bekle(2);
        qaSmartCardPage.submitButton2.click();
    }
}
