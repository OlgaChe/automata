package components;

import driver.MainMethods;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SearchPage extends MainMethods {

    private SelenideElement searchInput = $(By.name("q"));

    public void searchPageOpen() {
        Selenide.open("/");
    }

    public void search(String searchQuerry) {
        searchInput.sendKeys(searchQuerry);
        searchInput.pressEnter();
    }
}
