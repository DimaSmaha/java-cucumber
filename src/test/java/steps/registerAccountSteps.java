package steps;

import io.cucumber.java.After;
import io.cucumber.java.en.*;
import pageObjects.registerPageObjects;

public class registerAccountSteps extends registerPageObjects {

    @Given("Website is opened")
    public void startAndOpenWebsite() {
        start();
        openWebsite();
    }

    @When("User clicks on register button")
    public void clickRegisterBtn() {
       clickElement(registerBtn);
    }

    String username = getRandomString();
    String password = "qwerty";
    String name = "Dan";
    String surname = "Dam";
    String email = getRandomString()+"@gmail.com";

    @And("User fills up the form")
    public void fillUpTheForm() {
        fillRegisterForm(username,password,name,surname,email);
    }

    @And("User clicks submit button")
    public void clickSubmitBtn() {
        clickElement(confirmBtn);
    }

    @Then("Success register notification shown")
    public void successNotificationShown() {
        isElementVisible(successRegisterNotification);
    }

    @After("Close browser")
    public void close() {
        finish();
    }
}
