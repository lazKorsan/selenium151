package hafta1.Ders3;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.List;

public class assertIleControl {
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

        // "Online Banking" menüsüne tıkla
        WebElement onlineBankingButton = driver.findElement(By.id("onlineBankingMenu"));
        onlineBankingButton.click();

        // Menü başlıklarını bul
        List<WebElement> menuBasliklariElementleri = driver.findElements(By.className("headers"));

        // Menü başlık sayısını kontrol et
        int expectedMenuBaslikSayisi = 6;
        int actualMenuBaslikSayisi = menuBasliklariElementleri.size();
        Assert.assertEquals("Menü başlık sayısı beklenenden farklı!", expectedMenuBaslikSayisi, actualMenuBaslikSayisi);

        // Menü başlıklarını metin olarak listeye aktar
        List<String> menuBaslikMetinleri = new ArrayList<>();
        for (WebElement baslikElementi : menuBasliklariElementleri) {
            menuBaslikMetinleri.add(baslikElementi.getText());
        }

        // "Pay Bills" başlığı menüde var mı kontrol et
        boolean payBillsVarMi = menuBaslikMetinleri.contains("Pay Bills");

// Test çerçevesi için doğrulama
        Assert.assertTrue("'Pay Bills' başlığı menüde bulunamadı!", payBillsVarMi);

// Kullanıcıya sonucu bildir
        System.out.println(payBillsVarMi
                ? "✅ 'Pay Bills' başlığı menüde bulundu. Test başarıyla geçti."
                : "❌ 'Pay Bills' başlığı menüde bulunamadı. Test başarısız.");

    }
}
