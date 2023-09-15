package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utility.Utility;

public class LoginPage extends WebTestBase {
    @FindBy(id="onetrust-accept-btn-handler")
    WebElement cookiesAccept;
    @FindBy(xpath = "//span[@class='HcHv']")
    WebElement ClickonSignIn;
    @FindBy(xpath = "//input[@id='email']")
    WebElement emailTextBox;

    @FindBy(xpath = "//input[@id='password']")
    WebElement passwordTextBox;

    @FindBy(xpath = "//input[@id='rememberMe']")
    WebElement clickOnChekbox;
    @FindBy(xpath = "//button[@data-testid='submitButton']")
    WebElement signInBtn;

    @FindBy(xpath = "/html/body/hm-header/div/header/nav/div[1]/ul/li[1]/div/a/span")//span[text()='My account']
    WebElement MyAccount;


    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public void ClcikOnSinginBtn() {
        Utility.explicitWaitForElement(ClickonSignIn);
    }
    public void SelectcookiesAcceptBtn(){
        Utility.explicitWaitForElement(cookiesAccept);
    }

    public void login(String username, String password) {
        cookiesAccept.click();
        emailTextBox.sendKeys(username);
        passwordTextBox.sendKeys(password);
        clickOnChekbox.click();
        signInBtn.click();
    }

    public String clickOnSignIn() {
        return Utility.getTextOfElement(MyAccount);
    }
}
