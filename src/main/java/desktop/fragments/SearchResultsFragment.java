package desktop.fragments;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

import abstractClasses.fragments.AbstractFragment;
import com.codeborne.selenide.SelenideElement;
import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.WebElement;

public class SearchResultsFragment extends AbstractFragment {

    private final SelenideElement itemTitle = $x("//div[@class='book-item']//h3[@class='title']");
    private final SelenideElement bookItem = $x("//div[@class='book-item']");
    private final List<SelenideElement> booksItemsCollection = $$x("//div[@class='book-item']//h3");

    public SearchResultsFragment() {
    }


    public List<String> getBookItemsTitles() {
        return booksItemsCollection.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }

}
