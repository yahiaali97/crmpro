package steps;

import com.qacart.base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ContactsSteps extends Base {

    @And("Clicks on contacts button")
    public void clicksOnContactsButton() {
        driver.switchTo().frame("mainpanel");
        driver.findElement(By.xpath("//a[@title='Contacts']")).click();
    }

    @Then("Email Text field should be visible")
    public void emailTextFieldShouldBeVisible() {
        Assert.assertTrue(driver.findElement(By.name("cs_email")).isDisplayed());
    }

    @And("Clicks on add new contact button")
    public void clicksOnAddNewContactButton() {
        driver.findElement(By.cssSelector("[value=\"New Contact\"]")).click();
    }

    @And("Fill the first name and password")
    public void fillTheFirstNameAndPassword() {
        driver.findElement(By.name("first_name")).sendKeys("Yehia");
        driver.findElement(By.name("surname")).sendKeys("Ali");
        driver.findElement(By.cssSelector("[value=\"Save\"]")).click();
    }

    @Then("A new Contact should be added")
    public void aNewContactShouldBeAdded() {
        Assert.assertTrue(driver.findElement(By.cssSelector("[value=\"Previous\"]")).isDisplayed());
    }
}
