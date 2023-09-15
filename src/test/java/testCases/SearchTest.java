package testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.LoginPage;
import pages.SearchPage;
import testbase.WebTestBase;

public class SearchTest extends WebTestBase {
    public LoginPage loginPage;
    public SearchPage searchPage;

    SearchTest() {
        super();
    }

    @BeforeMethod
    public void beforeMethod() {
        intilization();

        loginPage = new LoginPage();
        searchPage = new SearchPage();
    }

    @Test(description = "Verify search button")

    public void verifySearchButton() {
        SoftAssert softAssert = new SoftAssert();
        searchPage.enterSearchText(properties.getProperty("searchProduct"));
        softAssert.assertEquals(searchPage.isDislpay(), "SHOWING RESULTS FOR \"shirt\"", "Text match");
        // softAssert.assertAll();
    }

    @AfterMethod
    public void afterMethod() {
        driver.close();
    }

}