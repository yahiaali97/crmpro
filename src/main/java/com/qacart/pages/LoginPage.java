package com.qacart.pages;

import com.qacart.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Base {

    @FindBy(name = "username")
    WebElement username;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(css = "[value=\"Login\"]")
    WebElement login;


}
