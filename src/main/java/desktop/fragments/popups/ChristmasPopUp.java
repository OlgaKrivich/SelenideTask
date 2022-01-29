package desktop.fragments.popups;

import static com.codeborne.selenide.Selenide.$x;

import abstractClasses.fragments.AbstractFragment;
import com.codeborne.selenide.SelenideElement;

public class ChristmasPopUp extends AbstractFragment {

    private final SelenideElement closeIcon = $x(
            "//div[@class='corner-content']//i[@class='icon-close']");

    public ChristmasPopUp() {
    }

    public void clickCloseIcon() {
        closeIcon.click();
    }
}
