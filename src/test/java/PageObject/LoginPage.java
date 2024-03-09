package PageObject;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    Webdriver driver;

    public LoginPage(Webdriver rdriver) {
        ldriver = rdriver;

        PageFactory.initElements(rdriver, this);
    }

}
