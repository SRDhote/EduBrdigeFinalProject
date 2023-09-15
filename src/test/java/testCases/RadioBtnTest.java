package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.LoginPage;
import pages.MouseOverPage;
import pages.RadioBtnPage;
import testbase.WebTestBase;

public class RadioBtnTest extends WebTestBase{
    public RadioBtnPage radioBtnPage;


    RadioBtnTest() {
        super();
    }

    @BeforeMethod
    public void beforeMethod() {
        intilization();

        radioBtnPage = new RadioBtnPage();
    }

    @Test
    public void SelectRadioBtn() {
        radioBtnPage.SelectcookiesAcceptBtn();
       radioBtnPage.SelectMenBtn();
       radioBtnPage.SelectClothesBtn();
       radioBtnPage.ClickonSortByBtn();
       radioBtnPage.ClickonRdioBtnBtn();
    }

}