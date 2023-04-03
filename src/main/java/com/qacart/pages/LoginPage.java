package com.qacart.pages;

import com.qacart.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Base {

    public LoginPage() {

        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "username")
    WebElement username;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(css = "[value=\"Login\"]")
    WebElement login;

    public HomePage performLogin(String name, String pass) throws InterruptedException {

        Thread.sleep(3000);
        username.sendKeys(name);
        password.sendKeys(pass);
        login.click();
        return new HomePage();
    }
}