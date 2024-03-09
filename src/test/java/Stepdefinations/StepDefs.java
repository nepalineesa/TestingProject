package Stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefs extends Base {
    WebDriver driver;
    @Given("User launch the chrome browser")
    public void user_launch_the_chrome_browser() {
         driver = new ChromeDriver();
         lg = new (driver);

    }

    @When("User enter the url {string}")
    public void user_enter_the_url(String string) {

    }

    @Then("User enter email as {string} and password as {string}")
    public void user_enter_email_as_and_password_as(String string, String string2) {

    }

    @Then("User click on the login button")
    public void user_click_on_the_login_button() {

    }

    @Then("User can navigate to login page")
    public void user_can_navigate_to_login_page() {
    }
}
