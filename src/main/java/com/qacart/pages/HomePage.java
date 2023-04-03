package com.qacart.pages;

import com.qacart.base.Base;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Base {

    @FindBy(css = ".logo_text")
    WebElement HomePageLogo;

    @FindBy(xpath = "//a[@title='Contacts']")
    WebElement MenuContact;

    public void isLogoDisplayed() {

        driver.switchTo().frame("mainpanel");
        Assert.assertTrue(driver.findElement(By.cssSelector(".logo_text")).isDisplayed());

    }
}
