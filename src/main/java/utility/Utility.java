package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static testbase.WebTestBase.driver;

public class Utility {

    public static final long IMPLICIT_WAIT = 20;
    public static final long PAGE_LOAD = 30;
    public static final long EXPLICIT_WAIT = 20;
    public static WebDriverWait wait;

    public static boolean explicitWaitForElement(WebElement element) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
        return false;
    }

    public static boolean isDisplayedElement(WebElement element) {
        return element.isDisplayed();
    }

    public static boolean isSelectedElement(WebElement element) {
        return element.isSelected();
    }

    public static String getTextOfElement(WebElement element) {
        return element.getText();
    }

    public static String getUrl() {
        return driver.getCurrentUrl();
    }


}
