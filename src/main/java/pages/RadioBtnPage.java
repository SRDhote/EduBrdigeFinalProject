package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utility.ActionUtility;
import utility.Utility;

public class RadioBtnPage extends WebTestBase {

    @FindBy(id="onetrust-accept-btn-handler")
    WebElement cookiesAccept;
    @FindBy(xpath = "(//a[text()='Ladies'])[1]")
    WebElement SelectMen;

    @FindBy(xpath = "(//a[text()='Clothes'])[4]")
    WebElement SelectClothes;
    @FindBy(xpath = "(//button[@class='dropdown-btn js-dropdownbtn'])[1]")
    WebElement ClickonSortBy;

    @FindBy(xpath = "(//label[@class='label'])[2]")//new to chabge Xpath
    WebElement ClickonRdioBtn;

    public RadioBtnPage() {
        PageFactory.initElements(driver, this);
    }
    public void SelectMenBtn(){
        Utility.explicitWaitForElement(SelectMen);

    }
    public void SelectClothesBtn(){
        Utility.explicitWaitForElement(SelectClothes);
    }
    public void ClickonSortByBtn(){
        Utility.explicitWaitForElement(ClickonSortBy);
    }
    public void ClickonRdioBtnBtn(){
        Utility.explicitWaitForElement(ClickonRdioBtn);
    }
    public void SelectcookiesAcceptBtn(){
        Utility.explicitWaitForElement(cookiesAccept);
    }


}