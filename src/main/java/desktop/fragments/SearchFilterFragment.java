package desktop.fragments;

import static com.codeborne.selenide.Selenide.$x;

import abstractClasses.fragments.AbstractFragment;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.datatable.DataTable;
import java.util.Map;

public class SearchFilterFragment extends AbstractFragment {

    private final SelenideElement fragmentRootElement = $x("//form[@class='filter-menu']");
    private final SelenideElement submitButton = $x(
            "//form[@class='filter-menu']//button[@type='submit']");

    public SearchFilterFragment() {
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public void selectOption(DataTable table) {
        Map<String, String> list = table.asMap(String.class, String.class);
        for (String key : list.keySet()) {
            $x("//option[@label='" + list.get(key) + "']").click();
        }
    }

}
