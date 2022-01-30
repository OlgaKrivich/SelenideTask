package desktop.pages;

import abstractClasses.pages.AbstractPage;
import desktop.fragments.MiniBasketFragment;
import desktop.fragments.NewCustomerFragment;

public class PaymentPage extends AbstractPage {

    public static final String PAGE_URL = BASE_URL + "/payment/guest";

    MiniBasketFragment miniBasketFragment = new MiniBasketFragment();
    NewCustomerFragment newCustomerFragment = new NewCustomerFragment();

    public PaymentPage() {
    }

    public MiniBasketFragment getMiniBasketFragment() {
        return miniBasketFragment;
    }

    public NewCustomerFragment getNewCustomerFragment() {
        return newCustomerFragment;
    }

}
