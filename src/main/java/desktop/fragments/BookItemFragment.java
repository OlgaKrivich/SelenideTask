package desktop.fragments;

import static com.codeborne.selenide.Selenide.$$x;

import abstractClasses.fragments.AbstractFragment;
import com.codeborne.selenide.SelenideElement;
import java.util.List;
import java.util.NoSuchElementException;

public class BookItemFragment extends AbstractFragment {

    List<SelenideElement> booksList = $$x("//div[@class='book-item']");

    public BookItemFragment() {
    }

    public void clickAddToBasketButton(String productTitle) {
        booksList.stream()
                .filter(book -> book.$x(".//h3[@class='title']/a").getText()
                        .equals(productTitle)).findFirst()
                .orElseThrow(() -> new NoSuchElementException("No book found"))
                .$x(".//div[@class='item-actions']//a").click();
    }

}
