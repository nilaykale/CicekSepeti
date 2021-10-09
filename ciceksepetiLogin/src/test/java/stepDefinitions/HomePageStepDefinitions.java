package stepDefinitions;

import io.cucumber.java.en.Then;
import pageObjects.HomePage;

public class HomePageStepDefinitions extends BaseStepDefinitions{
    private final HomePage homePage = new HomePage(driver);

    @Then("^User navigates to home page$")
    public void myAccount(){

        homePage.ClosePopUp();
        homePage.ClickMyAccount();
    }
}
