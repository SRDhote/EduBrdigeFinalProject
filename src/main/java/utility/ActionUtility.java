package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.lang.model.element.Element;
import java.time.Duration;


import static testbase.WebTestBase.driver;

public class ActionUtility {
    public static final long IMPLICIT_WAIT = 20;
    public static final long PAGE_LOAD = 20;
    public static final long EXPLICIT_WAIT = 80;
    public static WebDriverWait wait;

    public static boolean explicitWaitForElement(WebElement element) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
        return false;
    }

    public static void mouseOverAction(WebElement Element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(Element).perform();
    }

}
