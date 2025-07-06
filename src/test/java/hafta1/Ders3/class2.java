package hafta1.Ders3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;
import utilities.ScreenShotUtil;
import utilities.TestBase;

public class class2 {
    protected WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = TestBase.createDriver(); // Her test için yeni driver oluşturur
    }

    @AfterEach
    public void tearDown() {
        TestBase.tearDown(); // Driver'ı güvenle kapat
    }

    @Test
    public void productList() {
        driver.get("https://www.testotomasyonu.com/");
        System.out.println("Test 1: " + driver.getTitle());
        WebElement zzzButtonElectonics = driver.findElement(By.className("//*[@id=\"header_sticky\"]/header/div[4]/div/div/div[1]/div/div/nav/ul/li[2]"));
        zzzButtonElectonics.click();
    }

    @Test
    public void test02() {
        driver.get("https://www.testotomasyonu.com");
        System.out.println("Test 2: " + driver.getTitle());
        WebElement zzzButtonElectonics = driver.findElement(By.xpath("(//li[@class='has-sub'])[1]"));
        // dosya yolu "C:\\Users\\Hp\\OneDrive\\Desktop\\sdlc\\ekrangoruntusu.png"

        // yukarıdaki  webelementin görüntüsünü alan screeShoot ,
        ScreenShotUtil.ekranGoruntusuAl(driver,"C:\\Users\\Hp\\OneDrive\\Desktop\\sdlc\\element_goruntusu.png");
        ScreenShotUtil.ekranGoruntusuAl((WebDriver) zzzButtonElectonics, "C:\\Users\\Hp\\OneDrive\\Desktop\\sdlc\\element_goruntusu.png");

        // aynı sayfanın tam ekran görüntüsünü alan iki kod gönderiirmsini
        ScreenShotUtil.ekranGoruntusuAl(driver, "C:\\Users\\Hp\\OneDrive\\Desktop\\sdlc\\tam_sayfa_goruntusu.png");
        // var import edilmiş import utilities.ScreenShotUtil;



        ScreenShotUtil.ekranGoruntusuAl(driver, "C:\\Users\\Hp\\OneDrive\\Desktop\\sdlc\\ekrangoruntusu.png");
        zzzButtonElectonics.click();

    }

    @Test
    public void test03() {
        driver.get("https://www.youtube.com");
        System.out.println("Test 3: " + driver.getTitle());
    }

}