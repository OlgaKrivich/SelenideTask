package utils;


import static com.codeborne.selenide.WebDriverRunner.driver;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaiter {

    static WebDriverWait wait = new WebDriverWait(driver().getWebDriver(), 5);

    public WebDriverWaiter() {
    }

    public static void waitUntilElementToBeClickable(SelenideElement webElement) {
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

}
