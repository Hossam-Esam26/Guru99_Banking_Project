import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
   protected WebDriver driver;

    @BeforeTest
    public void openWebsite(){
         driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.demo.guru99.com/V4/");
    }

    @AfterTest
    public void quit(){
        driver.quit();
    }
}
