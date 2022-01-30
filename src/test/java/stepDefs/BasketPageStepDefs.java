package stepDefs;

import static desktop.pages.BasketPage.TITLE;
import static driver.SetUpDriver.getTitle;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

import desktop.pages.BasketPage;
import io.cucumber.java.Transpose;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.Map;
import org.apache.log4j.Logger;

public class BasketPageStepDefs {

    BasketPage basketPage = new BasketPage();
    private final static Logger logger = Logger.getLogger(BasketPageStepDefs.class);

    @When("I click 'Checkout' button on Basket page")
    public void iClickCheckoutButtonOnBasketPage() {
        basketPage.clickCheckoutButton();
    }


    @When("I select 'Basket Checkout' in basket pop-up")
    public void clickBasketCheckoutButton() {
        basketPage.getAddToBasketPopUp().clickBasketCheckoutButton();
    }

    @Then("I am redirected to a Basket page")
    public void verifyUserIsRedirectedToBasketPage() {
        logger.debug("Basket page was opened");
        assertThat(getTitle())
                .withFailMessage("Search page is not found")
                .isEqualTo(TITLE);
    }

    @Then("Basket order summary is as following:")
    public void verifyBasketOrderSummary(@Transpose Map<String, String> list) {
        assertSoftly(softAssertions -> list
                .forEach((k, v) -> softAssertions
                        .assertThat(basketPage.verifyBasketOrder(k))
                        .withFailMessage("Basket order error")
                        .isEqualTo(v)));
    }

}
