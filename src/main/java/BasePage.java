import core.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    protected WebDriver driver;

    public BasePage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    protected String pageUrl() {
        return "";
    }
    protected void get(){
        driver.get(pageUrl());
    }
    public String getDriverCurrentUrl(){
        return driver.getCurrentUrl();
    }
}
