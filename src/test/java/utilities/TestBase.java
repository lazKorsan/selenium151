package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class TestBase {
    public class Driver {
        public static WebDriver driver ;
    }

    public static WebDriver createDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("force-device-scale-factor=1.0");
        options.addArguments("high-dpi-support=1.0");
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver;
    }


    public static void tearDown() {
        if (Driver.driver != null) {
            Driver.driver.quit();
            Driver.driver = null;
        }
    }
}