import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewCustomer extends BaseData{

    public NewCustomer(WebDriver driver) {
        super(driver);
    }


    By clickNewCustomerPage = By.linkText("New Customer");
        WebElement clickNewCustomerPageElement;
    By customerName   = By.xpath("//input[@name = 'name']");
        WebElement customerNameElement;
    By genderMale = By.xpath("//input[@value='m']");
        WebElement genderMaleElement;
    By birth = By.xpath("//input[@name='dob']");
        WebElement birthElement;
    By address = By.xpath("//textarea[@name='addr']");
        WebElement addressElement;
    By city = By.xpath("//input[@name='city']");
        WebElement cityEelement;
    By state = By.xpath("//input[@name='state']");
        WebElement stateEelement;
    By pin = By.xpath("//input[@name='pinno']");
        WebElement pinEelement;
    By phone = By.xpath("//input[@name='telephoneno']");
        WebElement phoneEelement;
    By email = By.xpath("//input[@name='emailid']");
        WebElement emailEelement;
    By password = By.xpath("//input[@name='password']");
        WebElement passwordEelement;
    By submitButton = By.xpath("//input[@name='sub']");
        WebElement submitButtonElement;


    public void clickNewCustomerPage(){
        clickNewCustomerPageElement=driver.findElement(clickNewCustomerPage);
        clicker(clickNewCustomerPageElement);
    }

    public void enterCustomerName(String value){
        customerNameElement = driver.findElement(customerName);
        sentText(customerNameElement , value);
    }

    public void claickGender(){
        genderMaleElement = driver.findElement(genderMale);
        clicker(genderMaleElement);
    }

    public void enterBirth(String value){
        birthElement = driver.findElement(birth);
        sentText(birthElement , value);
    }

    public void enterAddress(String value){
        addressElement = driver.findElement(address);
        sentText(addressElement , value);
    }

    public void enterCity(String value){
        cityEelement = driver.findElement(city);
        sentText(cityEelement , value);
    }


    public void enterState(String value){
        stateEelement = driver.findElement(state);
        sentText(stateEelement , value);
    }


    public void enterPIN(String value){
        pinEelement = driver.findElement(pin);
        sentText(pinEelement , value);
    }

    public void enterPhoneNumber(String value){
        phoneEelement = driver.findElement(phone);
        sentText(phoneEelement , value);
    }

    public void enterEmail(String value){
        emailEelement = driver.findElement(email);
        sentText(emailEelement , value);
    }

    public void enterPassword(String value){
        passwordEelement = driver.findElement(password);
        sentText(passwordEelement , value);
    }

    public void clickSubmitButton(){
        submitButtonElement = driver.findElement(submitButton);
        clicker(submitButtonElement);
    }

}
