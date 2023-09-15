package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utility.Utility;

public class SearchPage extends WebTestBase {
    @FindBy(xpath = "(//input[@class='psxM XAI6'])[3]")
    WebElement searchTextBox;

    @FindBy(xpath = "(//button[@class='CGae mYRh __5DXf dYW2 k4Km'])[3]")
    WebElement clickOnSearch;

    @FindBy(xpath = "(//span[@class='x_nB'])[3]")
    WebElement searchedProduct;

    @FindBy(xpath = "//h1[@class='heading']")
    WebElement heading;

    public SearchPage() {
        PageFactory.initElements(driver, this);
    }

    public void enterSearchText(String searchProduct) {
        searchTextBox.click();
        searchTextBox.sendKeys(searchProduct);
        clickOnSearch.click();
    }

    public boolean isDislpay() {
        return Utility.isDisplayedElement(heading);
    }


    public String searchShirt() {
        return Utility.getTextOfElement(searchedProduct);
    }
}
