import driver.MainMethods;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import com.codeborne.selenide.testng.ScreenShooter;

import static com.codeborne.selenide.FileDownloadMode.PROXY;
import static utils.TestDataReader.getProperty;


@Listeners({ ScreenShooter.class})

public class BaseTest extends MainMethods {


    @Parameters("baseUrl")
    @BeforeClass
    public static void setup(String baseUrl) {

        /**
         * Start with maximized browser window adjusted to users screen resolution
         */
        Configuration.startMaximized = true;

        /**
         * Set basic timeout to wait for element
         */
        Configuration.timeout = 15000;

        /**
         *
         */
        Configuration.browser = "chrome";

        /**
         * Enable ability to download files without direct URL
         */
        Configuration.fileDownload = PROXY;
        Configuration.proxyEnabled = true;

        /**
         * Enable screenshots of successful tests (call on step where it's needed
         */
        ScreenShooter.captureSuccessfulTests = true;

        /**
         * Set base URL
         */
        Configuration.baseUrl = getProperty(baseUrl);
    }

}
