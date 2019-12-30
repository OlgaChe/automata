package driver;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import utils.TestDataReader;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.matchesText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.url;

public class MainMethods {

    /**
     * Useful methods for test scenarios
     */

    /**
     * Get status 200
     */
    public void getStatus200() {

    }

    /**
     * Verify page is loaded
     */
    public void verifyPageLoaded() {

    }


    /**
     * Get and verify page title
     */
    public void checkPageTitle(String titleText) {
        $("title").shouldHave(attribute("text", titleText));
    }

    /**
     * Get data from url
     **/
    public String splitText(String splitWord, int id) {
        String[] split = url().split(splitWord);
        return split[id];
    }


    /**
     * Useful methods with element interaction
     */

    /**
     * Collect drop-down list of elements, verify list size and verify actual list elements data with expected list data
     */
    public void getDropdownList(SelenideElement dropdown, ElementsCollection dropdownList, int size, String fileName, String key) {
        //open drop-down
        dropdown.click();

        //verify drop-down list size
        int listSize = dropdownList.texts().size();
        dropdownList.shouldHaveSize(size);

        //get each list element and verify it from expected list element
        for (int i = 0; i < listSize; i++) {
            dropdownList.get(i).shouldHave(matchesText(TestDataReader.getProperyData(fileName, key + i)));
        }
    }

    /**
     * Collect drop-down list of elements
     **/
    public void getListItemsText(ElementsCollection itemsList) {
        int listSize = itemsList.texts().size();

        for (int i = 0; i < listSize; i++) {
            System.out.println(itemsList.get(i).getText());
        }
    }

    /**
     * Collect last element from list of elements
     **/
    public String getLastListElementText(ElementsCollection itemsList) {
        int listSize = itemsList.texts().size();
        return itemsList.get(listSize - 1).getText();
    }
}
