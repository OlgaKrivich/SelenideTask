package stepDefs;

import desktop.pages.HomePage;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;

public class HomePageStepDefs {

    HomePage homePage = new HomePage();
    private final static Logger logger = Logger.getLogger(HomePageStepDefs.class);

    @When("I open the Initial home page")
    public void openWebSite() {
        homePage.openWebSite();
        logger.info("Home page was opened");
    }

    @When("^I search for ([^\"]*)$")
    public void searchRequest(String request) {
        homePage.searchRequest(request);
    }

}
