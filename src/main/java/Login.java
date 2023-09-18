import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login extends BaseData{

    public Login(WebDriver driver) {
        super(driver);
    }
    By loginField = By.xpath("//input[@name = 'uid']");
        WebElement loginElement ;
    By passwordField = By.xpath("//input[@name = 'password']");
        WebElement passwordElement ;
    By loginButton = By.xpath("//input[@name = 'btnLogin']");
        WebElement loginButtonElement;
    By logoutButton = By.linkText("Log out");
        WebElement logoutButtonElement;


    public void enterLoginData(String value){
        loginElement = driver.findElement(loginField);
        sentText(loginElement , value);
    }

    public void enterPassword(String value){
        passwordElement = driver.findElement(passwordField);
        sentText(passwordElement , value);
    }

    public void clickLoginButton(){
        loginButtonElement = driver.findElement(loginButton);
        clicker(loginButtonElement);
    }

    public void clickLogoutButton(){
        logoutButtonElement = driver.findElement(logoutButton);
        clicker(logoutButtonElement);
    }

}
