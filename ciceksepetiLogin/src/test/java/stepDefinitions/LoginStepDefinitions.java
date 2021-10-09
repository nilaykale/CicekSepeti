package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.LoginPage;

public class LoginStepDefinitions extends BaseStepDefinitions{
    private final LoginPage loginPage = new LoginPage(driver);

    @Given("^User navigates to login page$")
    public void launchBrowser() {super.launchBrowser();}

    @Then("^User enters (.*) and (.*)$")
    public void enter_Username_Password(String email, String password){
        loginPage.enter_Username_Password(email, password);
    }

    @Then("^Click on \"Sign In\" button$")
    public void login(){
        loginPage.login();
    }

    @Then("^User should see the error message$")
    public void ClosePopUp(){
        loginPage.CloseErrorMessage();
    }
}
