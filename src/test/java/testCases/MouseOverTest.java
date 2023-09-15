package testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.LoginPage;
import pages.MouseOverPage;
import testbase.WebTestBase;

public class MouseOverTest extends WebTestBase {
    public MouseOverPage mouseOverPage;
    public LoginPage loginPage;

    MouseOverTest() {
        super();
    }

    @BeforeMethod
    public void beforeMethod() {
        intilization();
        loginPage = new LoginPage();

        mouseOverPage = new MouseOverPage();
    }

    @Test(priority = 1, description = "Verify Mouse Over Action")
    public void verifyMouseOverAction() {
       // SoftAssert softAssert = new SoftAssert();

        mouseOverPage.mouseOverAction1();

        mouseOverPage.selectTshirt1();

       // softAssert.assertEquals(mouseOverPage.selectNewArrivals(), "New Arrivals","text match");
        //softAssert.assertAll();
    }

    /*@Test(priority = 2)
    public void ClickOnRadioBtn() {

        SoftAssert softAssert = new SoftAssert();
        mouseOverPage.mouseOverAction1();
        mouseOverPage.selectTshirt();
        mouseOverPage.ClickonSortBY();
        mouseOverPage.radioBtnSelection();

        softAssert.assertEquals(mouseOverPage.radioBtnSelection(), "isSeleced");
        softAssert.assertAll();
    }*/

    @AfterMethod
    public void afterMethod() {
        //driver.close();
    }
}