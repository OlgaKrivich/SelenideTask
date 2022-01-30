package desktop.pages;

import static com.codeborne.selenide.Selenide.$x;
import static utils.WebDriverWaiter.waitUntilElementToBeClickable;

import abstractClasses.pages.AbstractPage;
import com.codeborne.selenide.SelenideElement;
import desktop.fragments.popups.AddToBasketPopUp;

public class BasketPage extends AbstractPage {

    public static final String PAGE_URL = BASE_URL + "/basket";
    public static final String TITLE = "Your basket";


    private final SelenideElement checkoutButton = $x(
            "//div[@class='checkout-btns-wrap']/a[@href='/payment/guest']");

    private final SelenideElement deliveryCost = $x("//dl[@class='delivery-text']/dt");

    private final SelenideElement totalCost = $x("//dl[@class='total']/dt");

    AddToBasketPopUp addToBasketPopUp = new AddToBasketPopUp();

    public BasketPage() {
    }

    public AddToBasketPopUp getAddToBasketPopUp() {
        return addToBasketPopUp;
    }


    public void clickCheckoutButton() {
        waitUntilElementToBeClickable(checkoutButton);
        checkoutButton.click();
    }

    public String verifyBasketOrder(String fieldName) {
        return $x(".//dt[contains(text(),'" + fieldName + "')]/following-sibling::dd")
                .getText();
    }
}
