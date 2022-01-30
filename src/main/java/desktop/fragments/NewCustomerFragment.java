package desktop.fragments;


import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;
import static utils.WebDriverUtils.scrollDown;
import static utils.WebDriverUtils.switchToDefaultContent;
import static utils.WebDriverUtils.switchToIframe;

import abstractClasses.fragments.AbstractFragment;
import com.codeborne.selenide.SelenideElement;
import java.util.List;


public class NewCustomerFragment extends AbstractFragment {

    private final SelenideElement fragmentRootElement = $x(
            "//div[@class='block-wrap delivery-address']");
    private final SelenideElement emailInput = $x(
            "//div[@class='block-wrap delivery-address']//input[@name='emailAddress']");
    private final SelenideElement enterAddressManuallyButton = $x(
            "//button[@id='manualEntryDeliveryAddress']");

    private final SelenideElement fullNameField = $x(".//input[@name='delivery-fullName']");

    private final SelenideElement countryDropDown = $x(".//select[@id='delivery-CountryDropdown']");

    private final SelenideElement addressLine1Field = $x(".//input[@name='delivery-addressLine1']");

    private final SelenideElement addressLine2Field = $x(".//input[@name='delivery-addressLine2']");
    private final SelenideElement townOrCityField = $x(".//input[@name='delivery-city']");
    private final SelenideElement countryOrStateField = $x("//input[@name='delivery-county']");
    private final SelenideElement postcodeOrZipField = $x(".//input[@name='delivery-postCode']");
    private final SelenideElement cardNumberField = $x(".//input[@id='credit-card-number']");

    private final SelenideElement expiryDateField = $x(".//input[@id='expiration']");
    private final SelenideElement cvvField = $x(".//input[@id='cvv']");

    private final SelenideElement cardNumberIFrame = $x(
            "//iframe[@id='braintree-hosted-field-number']");

    private final SelenideElement expiryDateIFrame = $x(
            "//iframe[@id='braintree-hosted-field-expirationDate']");

    private final SelenideElement cvvIFrame = $x("//iframe[@id='braintree-hosted-field-cvv']");

    public NewCustomerFragment() {
    }

    public boolean checkValidationErrorIsDisplayed() {
        List<SelenideElement> errorsList = $$x("//div[@class='error-block']");
        return errorsList.stream().noneMatch(error -> Boolean.parseBoolean(error.getText()));
    }

    public void enterEmailCustomer(String email) {
        emailInput.setValue(email);
    }

    public void setFullName(String name) {
        fullNameField.setValue(name);
    }

    public void setDeliveryCountry(String country) {
        countryDropDown.selectOption(country);
    }

    public void setAddressLine1(String addressLine1) {
        addressLine1Field.setValue(addressLine1);
    }

    public void setAddressLine2(String addressLine2) {
        addressLine2Field.setValue(addressLine2);
    }

    public void setCityOrTown(String cityOrTown) {
        townOrCityField.setValue(cityOrTown);
    }

    public void setCountryOrState(String countryOrState) {
        countryOrStateField.setValue(countryOrState);
    }

    public void setPostcodeOrZip(String postcodeOrZip) {
        postcodeOrZipField.setValue(postcodeOrZip);
    }

    public void clickManualButton() {
        enterAddressManuallyButton.click();
    }

    public void setCardNumber(String cardNumber) {
        scrollDown();
        switchToIframe(cardNumberIFrame);
        cardNumberField.setValue(cardNumber);
        switchToDefaultContent();
    }

    public void setExpiryMonth(String expiryMonth, String expiryYear) {
        switchToIframe(expiryDateIFrame);
        expiryDateField.clear();
        expiryDateField.setValue(expiryMonth);
        expiryDateField.setValue(expiryYear);
        switchToDefaultContent();
    }

    public void setCvv(String cvv) {
        switchToIframe(cvvIFrame);
        cvvField.setValue(cvv);
        switchToDefaultContent();
    }


}
