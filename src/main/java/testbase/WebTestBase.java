package testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import utility.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class WebTestBase {
    public static WebDriver driver;
    public Properties properties;

    public WebTestBase() {
        properties = new Properties();
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/properties/congfig.properties");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            properties.load(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void intilization(){
        String browseName = properties.getProperty("browser");
        if (browseName.equalsIgnoreCase("chrome")) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            options.setBinary("C:/Program Files (x86)/Google/Chrome/Application/chrome.exe");

            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/drivers/chromedriver.exe");
            driver = new ChromeDriver(options);
            // driver.get("https://camposcoffee.com/");
            // driver.manage().window().fullscreen();
        } else if (browseName.equalsIgnoreCase("edge")) {
            EdgeOptions options = new EdgeOptions();
            //set the path of Edge Browser
            options.setBinary("C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe");
            options.addArguments("--remote-allow-origins=*");
            //set the path of Edge Driver
            System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "/src/main/resources/drivers/msedgedriver.exe");
            driver = new EdgeDriver(options);
            // driver.get("https://camposcoffee.com/");
        } else if (browseName.equalsIgnoreCase("firfox")) {
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            firefoxOptions.setBinary("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
            System.setProperty("webdriver.firefox.driver", System.getProperty("user.dir") + "/src/main/resources/drivers/firefox.exe");
            driver = new FirefoxDriver(firefoxOptions);
            // driver.get("https://camposcoffee.com/");

        } else {
            throw new RuntimeException("Please Select Correct Browser option");
        }
        driver.navigate().to(properties.getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds((Utility.PAGE_LOAD)));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utility.IMPLICIT_WAIT));
        driver.manage().deleteAllCookies();
    }

}
