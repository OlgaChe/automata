package components;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import driver.MainMethods;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class LoginPage extends MainMethods {

    /** Declare page elements */
    private SelenideElement usernameInput = $(By.name(""));
    private SelenideElement passwordInput = $(By.name(""));
    private SelenideElement logInButton = $x("");

    /**
     * Login as full method
     */
    public void signIn(String username, String password) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        logInButton.click();
    }

    /**
     * Login as separate step method
     */
    public void inputUsername(String username) {
        usernameInput.sendKeys(username);
    }

    public void inputPassword(String password) {
        passwordInput.sendKeys(password);
    }

    public void clickLogInButton() {
        logInButton.click();
    }
}
