import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultPage extends BasePage{


    @FindBy(xpath = "//div[@id = 'results_list_wrapper']/a")
    private List<WebElement> searchResult;
}
