import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSpyurAm extends BaseTest{

    private HomePage homePage;
    private SearchResultPage searchResultPage;

    @BeforeMethod
    public void initPages(){
        homePage = new HomePage();
        searchResultPage = new SearchResultPage();
    }

    @Test
    public void testHomePage(){
        homePage.get();
        homePage.doASearch("Ծրագրավորում","Գյումրի");
//        System.out.println(homePage.getDriverCurrentUrl());
        Assert.assertTrue(homePage.getDriverCurrentUrl().contains("am/home/search/?"));
    }
}
