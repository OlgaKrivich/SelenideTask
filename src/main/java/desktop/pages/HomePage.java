package desktop.pages;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;
import static utils.WebDriverUtils.clickElementWithJavascript;

import abstractClasses.pages.AbstractPage;
import com.codeborne.selenide.SelenideElement;

public class HomePage extends AbstractPage {

    private final SelenideElement searchInput = $x("//input[@class='text-input']");

    private final SelenideElement searchButton = $x("//button[@class='header-search-btn']");

    public HomePage() {
    }

    public void openWebSite() {
        open(BASE_URL);
    }

    public void searchRequest(String request) {
        searchInput.setValue(request);
        clickElementWithJavascript(searchButton);
    }

}
