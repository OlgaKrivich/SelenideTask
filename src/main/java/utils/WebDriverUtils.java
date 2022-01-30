package utils;

import static com.codeborne.selenide.WebDriverRunner.driver;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.junit5.ScreenShooterExtension;
import org.junit.jupiter.api.extension.RegisterExtension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class WebDriverUtils {

    public static final JavascriptExecutor js = (JavascriptExecutor) driver().getWebDriver();
    public static final Actions action = new Actions(driver().getWebDriver());

    private WebDriverUtils() {
    }

    public static void switchToIframe(SelenideElement frameId) {
        driver().getWebDriver().switchTo().frame(frameId);
    }

    public static void switchToDefaultContent() {
        driver().getWebDriver().switchTo().defaultContent();
    }

    public static void scrollDown() {
        action.sendKeys(Keys.PAGE_DOWN).build().perform();
    }

    public static void clickElementWithJavascript(SelenideElement webElement) {
        WebDriverUtils.js.executeScript("arguments[0].click();", webElement);
    }

    @RegisterExtension
    static ScreenShooterExtension screenshotEmAll = new ScreenShooterExtension(true)
            .to("./screenshots");

}
