package driver;


import static abstractClasses.pages.AbstractPage.BASE_URL;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;


public class SetUpDriver {

    private final static Logger logger = Logger.getLogger(SetUpDriver.class);

    private SetUpDriver() {
    }

    public void setUpDriver() {
        Configuration.browser = "chrome";
        Configuration.driverManagerEnabled = true;
        Configuration.browserSize = "1920x1080";
        Selenide.open(BASE_URL);
        logger.debug("Browser was opened");
        Configuration.reportsFolder = "./screenshots";
    }

    @Before
    public void init() {
        setUpDriver();
    }

    @After
    public void tearDown() {
        Selenide.closeWebDriver();
        logger.info("Browser was closed");
    }

    public static String getTitle() {
        return Selenide.title();
    }


}
