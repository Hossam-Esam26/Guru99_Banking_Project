import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NewCustomerTest extends BaseTest{
    NewCustomer newCustomer;
    Login login;

    @Test
    public void data() throws InterruptedException {
        newCustomer = new NewCustomer(driver);
        login = new Login(driver);
        login.enterLoginData("mngr528751");
        login.enterPassword("YjAgupU");
        login.clickLoginButton();
        newCustomer.clickNewCustomerPage();
        boolean teest = driver.findElement(By.xpath("//input[@name = 'name']")).isDisplayed();
        if (teest) {
            newCustomer.enterCustomerName("hossam");
            newCustomer.claickGender();
            newCustomer.enterBirth("02042002");
            newCustomer.enterAddress("tesst");
            newCustomer.enterCity("cairo");
            newCustomer.enterState("how are you");
            newCustomer.enterPIN("111225");
            newCustomer.enterPhoneNumber("01111223543");
            newCustomer.enterEmail("sada0ad@gmail.com");
            newCustomer.enterPassword("123456789");
            newCustomer.clickSubmitButton();

        }else {//*[@id="dismiss-button"]

            WebElement frame1 = driver.findElement(By.id("google_ads_iframe_/24132379/INTERSTITIAL_DemoGuru99_0"));
            driver.switchTo().frame(frame1);
            WebElement frame2 = driver.findElement(By.id("ad_iframe"));
            driver.switchTo().frame(frame2);
            driver.findElement(By.xpath("//*[@id=\"dismiss-button\"]/div/svg")).click();
            driver.switchTo().defaultContent();
            newCustomer.enterCustomerName("hossam22");
            newCustomer.claickGender();
            newCustomer.enterBirth("02042002");
            newCustomer.enterAddress("gnkl0d444gkfmglkmfldkmkglk");
            newCustomer.enterCity("cairo");
            newCustomer.enterState("how are you");
            newCustomer.enterPIN("111225");
            newCustomer.enterPhoneNumber("01111223543");
            newCustomer.enterEmail("aaada000ad@gmail.com");
            newCustomer.enterPassword("123456789");
            newCustomer.clickSubmitButton();

        }

    }
}
