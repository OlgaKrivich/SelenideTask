package desktop.fragments.popups;

import static com.codeborne.selenide.Selenide.$x;

import abstractClasses.fragments.AbstractFragment;
import com.codeborne.selenide.SelenideElement;

public class AddToBasketPopUp extends AbstractFragment {

    private final SelenideElement basketCheckoutButton = $x(
            "//div[@class='basket-info']//a[@href='/basket']");

    public AddToBasketPopUp() {
    }

    public void clickBasketCheckoutButton() {
        basketCheckoutButton.click();
    }


}
