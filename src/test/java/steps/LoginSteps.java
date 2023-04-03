package steps;

import com.qacart.base.Base;
import com.qacart.pages.HomePage;
import com.qacart.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginSteps extends Base {

    LoginPage loginPage;
    HomePage homePage;

    @Given("User opens the website and goes to the login page")
    public void user_opens_the_website_and_goes_to_the_login_page() {
        launchBrowser();
    }

    @When("User fills email as {string} and {string} and clicks on login")
    public void user_fills_in_valid_email_and_password_and_clicks_on_login(String username, String password) throws InterruptedException {

        loginPage = new LoginPage();
//        driver.findElement(By.name("username")).sendKeys(username);
//        driver.findElement(By.name("password")).sendKeys(password);
//        driver.findElement(By.cssSelector("[value=\"Login\"]")).click();
        homePage =loginPage.performLogin(username, password);
    }

    @Then("User should be logged in successfully")
    public void user_should_be_logged_in_successfully() {

    }

    @Then("Error Message should appear")
    public void error_message_should_appear() {

        Assert.assertTrue(driver.findElement(By.name("username")).isDisplayed());
        driver.quit();

    }

//    @When("User fills email <username> and <password> and clicks on")
//    public void user_fills_email_and_password_and_click_on() {
//
//    }

}
