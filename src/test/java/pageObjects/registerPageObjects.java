package pageObjects;

import org.openqa.selenium.By;

public class registerPageObjects extends commonPageObjects {

    //register btn from home page
    public By registerBtn = By.className("register");
    public String registerPageUrl = "https://www.redmine.org/account/register";
    public By usernameInput = By.id("user_login");
    public By passwordInput = By.id("user_password");
    public By confirmPasswordInput = By.id("user_password_confirmation");
    public By firstnameInput = By.id("user_firstname");
    public By lastnameInput = By.id("user_lastname");
    public By emailInput = By.id("user_mail");
    public By confirmBtn = By.name("commit");
    public By successRegisterNotification = By.id("flash_notice");

    public void fillRegisterForm(String username, String password,
                                 String name, String surname,
                                 String email){
        fillElement(usernameInput,username);
        fillElement(passwordInput,password);
        fillElement(confirmPasswordInput,password);
        fillElement(firstnameInput,name);
        fillElement(lastnameInput,surname);
        fillElement(emailInput,email);
    }
}
