package testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.LoginPage;
import testbase.WebTestBase;

public class LoginTest extends WebTestBase {


    public LoginPage loginPage;

    LoginTest() {
        super();
    }

    @BeforeMethod
    public void beforeMethod() {
        intilization();

        loginPage = new LoginPage();
    }

    @Test(description = "Verify login with valid username and valid password")
    public void verifyLoginWithValidEmailAndValidPassword() {
        //SoftAssert softAssert = new SoftAssert();
        loginPage.ClcikOnSinginBtn();
        loginPage.login(properties.getProperty("username"), properties.getProperty("password"));
        // softAssert.assertEquals(loginPage.clickOnSignIn(),"My account","Text should be match");
        // softAssert.assertAll();
    }

    @AfterMethod
    public void afterMethod() {
        driver.close();
    }
}