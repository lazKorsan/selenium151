package hafta1.Ders2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class class1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver() ;
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.testotomasyonu.com");
        WebElement Box_search = driver.findElement(By.id("global-search"));
        System.out.println(Box_search.getAttribute("JHJ"));
        System.out.println(Box_search.getCssValue("HVJH"));
        Box_search.sendKeys("PHONE"+ Keys.ENTER);
    }
}
