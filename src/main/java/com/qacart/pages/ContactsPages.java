package com.qacart.pages;

import com.qacart.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactsPages extends Base {

    @FindBy(name = "cs_email")
    WebElement emailTextField;

    @FindBy(css = "[value=\"New Contact\"]")
    WebElement AddNewContact;

    @FindBy(name = "first_name")
    WebElement firstName;

    @FindBy(css = "surname")
    WebElement lastName;

    @FindBy(css = "[value=\"Save\"]")
    WebElement Save;

    @FindBy(css = "[value=\"Previous\"]")
    WebElement previous;

}