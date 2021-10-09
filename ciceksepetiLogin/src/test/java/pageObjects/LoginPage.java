package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver){
        super(driver);
    }

    @FindBy(id = "EmailLogin")
    private WebElement emailField;

    @FindBy(id = "Password")
    private  WebElement passwordField;

    @FindBy(xpath = "//*[@class=\"btn btn-primary btn-lg pull-right login__btn js-login-button\"]")
    private  WebElement loginButton;

    @FindBy(xpath = "//*[@class=\"modal-icon icon-close-line\"]")
    private  WebElement ErrorMessageItem;

    @FindBy(xpath = "//*[@class=\"modal-body\"]")
    private WebElement PopUpExist;

    @FindBy(id="EmailLogin-error")
    private WebElement EmailErrorMessage;

    @FindBy(id="Password-error")
    private WebElement PasswordErrorMessage;

    public void enter_Username_Password(String email, String password){
        sendKeys(emailField, email);
        sendKeys(passwordField, password);
    }
    public void login(){
        click(loginButton);
    }
    public void CloseErrorMessage(){
        Assert.assertTrue("Hata ekranı gelmedi",isExist(PopUpExist));
        click(ErrorMessageItem);
    }
   public void CheckEmailErrorMessage(){
       Assert.assertTrue("Uyarı mesajı geldi",isExist(EmailErrorMessage));
    }

    public void CheckPasswordErrorMessage(){
        Assert.assertTrue("Uyarı mesajı geldi",isExist(PasswordErrorMessage));
    }
}

