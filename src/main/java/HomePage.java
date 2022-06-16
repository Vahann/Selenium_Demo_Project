import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//input[@name = 'company_name']")
    private WebElement whatToLookFor;

    @FindBy(xpath = "//input[@name = 'addres']")
    private WebElement locator;

    @FindBy(xpath = "//button[@type = 'submit']")
    private WebElement submitButton;

    @Override
    protected String pageUrl() {
        return "https://www.spyur.am/am/home";
    }

    public void doASearch(final String whatToLookFor, final String whereToFind) {
        this.locator.sendKeys(whereToFind);
        doASearchInternal(whatToLookFor);
    }

    public void doASearch(final String whatToLookFor) {
        this.doASearchInternal(whatToLookFor);
    }

    private void doASearchInternal(final String whatToLookFor) {
        this.whatToLookFor.sendKeys(whatToLookFor);
        this.submitButton.click();
    }
}
