package desktop.pages;

import static desktop.pages.HomePage.BASE_URL;

import abstractClasses.pages.AbstractPage;
import desktop.fragments.MiniBasketFragment;
import desktop.fragments.NewCustomerFragment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage extends AbstractPage {

    public static final String PAGE_URL = BASE_URL + "/payment/guest";
    public static final String TITLE = "Your basket";


    MiniBasketFragment miniBasketFragment = new MiniBasketFragment();
    NewCustomerFragment newCustomerFragment = new NewCustomerFragment();

    public MiniBasketFragment getMiniBasketFragment() {
        return miniBasketFragment;
    }

    public NewCustomerFragment getNewCustomerFragment() {
        return newCustomerFragment;
    }

}
