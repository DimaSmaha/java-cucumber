package pageObjects;

import org.openqa.selenium.By;

public class loginPageObjects extends  commonPageObjects{
    public By loginBtn = By.className("login");
    public By usernameInput = By.id("username");
    public By passInput = By.id("password");
    public By submitBtn = By.name("login");
    public By loggedAs = By.id("loggedas");

    public void fillLoginFields(String username, String password){
        fillElement(usernameInput,username);
        fillElement(passInput,password);
    }

}
