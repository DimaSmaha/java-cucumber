package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class logIntoAccountSteps extends pageObjects.loginPageObjects{

    @Given("Website is opened")
    public void startAndOpenWebsite() {
        start();
        openWebsite();
    }

    @When("User clicks on login button")
    public void clickRegisterBtn() {
        clickElement(loginBtn);
        isElementVisible(usernameInput);
    }

    @And("User fills up login form {string} and {string}")
    public void fillLogin(String username, String password) {
        fillElement(usernameInput,username);
        fillElement(passInput,password);
    }

    @Then("Logged as shown")
    public void successNotificationShown() {
        isElementVisible(loggedAs);
    }
}
