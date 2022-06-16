import core.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @BeforeMethod
    public void setupMethod(){
        Driver.getDriver();
    }
    @AfterMethod
    public void turnDown() throws InterruptedException {
        Thread.sleep(5000);
        Driver.quitDriver();
    }
}
