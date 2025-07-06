package hafta1.Ders3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;
import utilities.TestBase;

import java.util.List;

public class productSizeProductList01 {
    public static WebDriver driver ;
    @BeforeEach
    public void setUp(){
        driver = TestBase.createDriver();
    }
    @AfterEach
    public void tearDown(){
        ReusableMethods.bekle(3);
        driver.quit();
    }
    @Test
    public void productSizeProductList(){
        driver.get("https://www.testotomasyonu.com");

        WebElement searchBox = driver.findElement(By.id("global-search"));
        searchBox.sendKeys("phone"+ Keys.ENTER);

        List<WebElement> catogoriElementleriList =
                driver.findElements(By.className("panel-list"));

        int expectedCatogoriElementSayisi = 8 ;
        int actualElementCatogoriSayisi = catogoriElementleriList.size() ;
        System.out.println(actualElementCatogoriSayisi);

        if (actualElementCatogoriSayisi == expectedCatogoriElementSayisi){
            System.out.println("catogori testi sayısı testi"+" PASSED");
        }else System.out.println("catagori testi sayisi testi FAİLED");

        for (int i = 0; i < catogoriElementleriList.size(); i++) {
            System.out.println(catogoriElementleriList.get(i).getText());

        }


    }
}
