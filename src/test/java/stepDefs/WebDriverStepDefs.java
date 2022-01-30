package stepDefs;


import io.cucumber.java.en.Given;
import org.apache.log4j.Logger;

public class WebDriverStepDefs {

    private final static Logger logger = Logger.getLogger(WebDriverStepDefs.class);

    @Given("I am an anonymous customer with clear cookies")
    public void clearCookies() {
        clearCookies();
        logger.info("Cookies were cleared");
    }

}
