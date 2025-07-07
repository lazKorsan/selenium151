package hafta1.Ders3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.TestBase;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class BaslikKontrolTesti {

    public static WebDriver driver;

    @BeforeEach
    public void setUp0() {
        driver = TestBase.createDriver();
    }

    @AfterEach
    public void tearDown() {
        ReusableMethods.bekle(3);
        driver.quit();
    }

    @Test
    public void cokluBaslikKontrolu() {
        // Siteye git
        driver.get("http://zero.webappsecurity.com");

        // Online Banking menüsüne tıkla
        WebElement onlineBankingButton = driver.findElement(By.id("onlineBankingMenu"));
        onlineBankingButton.click();

        // Menü başlıklarını bul
        List<WebElement> baslikElementleri = driver.findElements(By.className("headers"));

        // Başlık metinlerini listeye aktar
        List<String> baslikMetinleri = new ArrayList<>();
        for (WebElement element : baslikElementleri) {
            baslikMetinleri.add(element.getText());
        }

        // Kontrol edilecek başlıklar
        List<String> beklenenBasliklar = List.of(
                "Account Summary",
                "Account Activity",
                "Transfer Funds",
                "Pay Bills",
                "My Money Map",
                "Online Statements"
        );

        // Her başlık için kontrol yap ve sonucu yazdır
        for (String beklenen : beklenenBasliklar) {
            boolean baslikVarMi = baslikMetinleri.contains(beklenen);
            Assertions.assertTrue(baslikVarMi, "'" + beklenen + "' başlığı menüde bulunamadı!");
            System.out.println("✅ '" + beklenen + "' başlığı menüde bulundu.");
        }
    }
}
