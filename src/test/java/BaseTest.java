import driver.MainMethods;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import com.codeborne.selenide.testng.ScreenShooter;
import static utils.TestDataReader.getProperty;


@Listeners({ ScreenShooter.class})

public class BaseTest extends MainMethods {


    @Parameters("baseUrl")
    @BeforeClass
    public static void setup(String baseUrl) {

        Configuration.startMaximized = true;
        Configuration.timeout = 15000;

        /*Configuration.fileDownload = PROXY;
        Configuration.proxyEnabled = true;*/

        Configuration.baseUrl = getProperty(baseUrl);
        //Configuration.browser = "firefox";

        ScreenShooter.captureSuccessfulTests = true;

    }

}
