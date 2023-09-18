import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class LoginTest extends BaseTest{
    Login login;


    @DataProvider (name = "test data")
          public static Object[][] datas(){
                return new Object[][]{
                        {"mngr528751" , "YjAgupU"} ,
                        {"mngr519980" , "negUd" } ,
                        {"mngr5199" , "negUdur" } ,
                        {"mngr51" , "negUd"} ,
                };
          }

    @Test (dataProvider = "test data")
    public void inValidData(String name , String password ) throws IOException {
        login = new Login(driver);
        login.enterLoginData(name);
        login.enterPassword(password);
        login.clickLoginButton();
        if (name == "mngr528751"&& password == "YjAgupU"){
            String expected = "Welcome To Manager's Page of Guru99 Bank";
            String actaul = driver.findElement(By.xpath("//marquee[@class = 'heading3']")).getText();
            Assert.assertTrue(actaul.contains(expected));
            TakesScreenshot screenshot = (TakesScreenshot)driver;
            File src= screenshot.getScreenshotAs(OutputType.FILE);
            File dest = new File("Screenshots//0.jpg");
            FileHandler.copy(src ,dest);
            login.clickLogoutButton();

        }

        if (name != "mngr528751"&& password != "YjAgupU"){
            String expected = "User or Password is not valid";
            String actaul = driver.switchTo().alert().getText();
            Assert.assertEquals(actaul,expected);
        }
        driver.switchTo().alert().accept();


    }

}
