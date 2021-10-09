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

    @FindBy(xpath = "//*[@class=\"user-menu__item user-menu__item--account\"]")
    private  WebElement HESABIM_TITLE;

    @FindBy(xpath= "//*[@class=\"subheader-close js-subheader-close is-hidden\"]")
    private  WebElement ClosePopUp;

    @FindBy(xpath = "//*[@class=\"modal-icon icon-close-line\"]")
    private  WebElement ErrorMessageItem;

    public void enter_Username_Password(String email, String password){
        sendKeys(emailField, email);
        sendKeys(passwordField, password);
        click(loginButton);
    }
    public void login(){
        click(loginButton);
        Assert.assertTrue("-> Giris Yapilamadi!", isExist(HESABIM_TITLE));
        click(ClosePopUp);
    }

    public void CloseErrorMessage(){
        click(ErrorMessageItem);
    }
}

