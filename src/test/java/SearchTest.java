import com.oracle.tools.packager.Log;
import org.apache.log4j.Logger;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import components.SearchPage;
import utils.Logs;
import utils.TestDataReader;

import static com.codeborne.selenide.Selenide.screenshot;


public class SearchTest extends BaseTest {

    private SearchPage searchPage;



    @Parameters("searchQuery")
    @Test
    public void searchTest(String searchQuery) {
        Logs.info("Test start");
        searchPage = new SearchPage();
        searchPage.searchPageOpen();
        screenshot("test");
        searchPage.search(TestDataReader.getProperyData("testData/search.properties", "search"));
       // log.info("Test finish");
       // log.debug("Test fin");
    }
}
