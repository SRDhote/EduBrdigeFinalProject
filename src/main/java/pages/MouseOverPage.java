package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utility.ActionUtility;
import utility.Utility;

public class MouseOverPage extends WebTestBase {
    @FindBy(id = "onetrust-accept-btn-handler")
    WebElement cookiesAccept;
    @FindBy(xpath = "(//a[text()='Men'])[1]")
    WebElement mouseOverElement;
    @FindBy(xpath = "(//a[text()='Shirts'])[1]") //wrong x path
    WebElement selecttshirt;

    @FindBy(xpath = "(//dt[@class='Heading-module--general__1cV9K DefinitionList-module--listGroupTitle__2dxBG Heading-module--small__6VQbz'])[1]")
    WebElement NewArrivals;

    public MouseOverPage() {
        PageFactory.initElements(driver, this);
    }

    public void mouseOverAction1() {
        ActionUtility.mouseOverAction(mouseOverElement);
        mouseOverElement.click();
    }

    public void selectTshirt1() {
        Utility.explicitWaitForElement(selecttshirt);
        selecttshirt.click();
    }

    public String selectNewArrivals() {
        return Utility.getTextOfElement(NewArrivals);
    }

    public void SelectcookiesAcceptBtn() {
        Utility.explicitWaitForElement(cookiesAccept);
    }

}
