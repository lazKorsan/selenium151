package hafta1.Ders3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.List;

public class productSizeProductList03 {
    public static WebDriver driver ;

    @BeforeEach
    public void setUp0(){
        driver = TestBase.createDriver();
    }
    @AfterEach
    public void tearDown(){
        ReusableMethods.bekle(3);
        driver.quit();
    }

    @Test
    public void testOnlineBankingMenu() {
        // Web sitesine git
        driver.get("http://zero.webappsecurity.com");

        // "Online Banking" menü butonunu bul ve tıkla
        WebElement onlineBankingButton = driver.findElement(By.id("onlineBankingMenu"));
        System.out.println("Online Banking Butonu Metni: " + onlineBankingButton.getText());
        onlineBankingButton.click();

        // Menü başlıklarını içeren tüm WebElement'leri bul
        List<WebElement> menuBasliklariElementleri = driver.findElements(By.className("headers"));

        // Menüdeki başlık sayısını yazdır
        int actualMenuBaslikSayisi = menuBasliklariElementleri.size();
        int expectedMenuBaslikSayisi = 6;
        System.out.println("Menüdeki Başlık Sayısı: " + actualMenuBaslikSayisi);

        // Menü başlık sayısı beklenenle eşleşiyor mu kontrol et
        if (actualMenuBaslikSayisi == expectedMenuBaslikSayisi) {
            System.out.println("Menü başlık sayısı testi PASSED. Beklenen: " + expectedMenuBaslikSayisi);
        } else {
            System.out.println("Menü başlık sayısı testi FAILED. Beklenen: " + expectedMenuBaslikSayisi +
                    ", Gerçek: " + actualMenuBaslikSayisi);
        }

        // Menü başlıklarını ekrana yazdır
        for (WebElement baslikElementi : menuBasliklariElementleri) {
            System.out.println("Menü Başlığı: " + baslikElementi.getText());
        }

        // Menü başlıklarını String listesine aktar
        List<String> menuBaslikMetinleri = new ArrayList<>();
        for (WebElement baslikElementi : menuBasliklariElementleri) {
            menuBaslikMetinleri.add(baslikElementi.getText());
        }

        // Menü başlıklarının tamamını yazdır
        System.out.println("Tüm Menü Başlıkları: " + menuBaslikMetinleri);

        // "Pay Bills" başlığı menüde var mı kontrol et
        if (menuBaslikMetinleri.contains("Pay Bills")) {
            System.out.println("'Pay Bills' başlığı testi PASSED.");
        } else {
            System.out.println("'Pay Bills' başlığı testi FAILED.");
        }
    }

}


















