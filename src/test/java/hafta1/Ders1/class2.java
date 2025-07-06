package hafta1.Ders1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver() ;
        driver.manage().window().maximize();


        driver.get("https://www.testotomasyonu.com");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        driver.manage().window().minimize();

        Thread.sleep(2000);

        driver.manage().window().fullscreen();
        Thread.sleep(2000);

        driver.manage().window().setSize(new Dimension(150,150));











    }
}
