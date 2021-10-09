package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@class=\"icon-close user-menu__log-out-icon\"]")
    private WebElement myAccount;
    @FindBy(xpath = "//*[@class=\"subheader-close js-subheader-close is-hidden\"]")
    private WebElement ClosePopUp;

    @FindBy(xpath = "//*[@class=\"user-menu__item user-menu__item--account\"]")
    private WebElement HESABIM_TITLE;

    public void ClickMyAccount() {
        Assert.assertTrue("-> Giris Yapilamadi!", isExist(HESABIM_TITLE));
        click(myAccount);
    }

    public void ClosePopUp() {
        tryClick(ClosePopUp);

    }

}
