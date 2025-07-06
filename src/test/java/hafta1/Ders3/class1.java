package hafta1.Ders3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class class1 {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.testotomasyonu.com");

        WebElement Box_search = driver.findElement(By.name("search"));
        Box_search.sendKeys("phone"+ Keys.ENTER);

        WebElement aramaSonucuElementi= driver.findElement(By.className("product-count-text"));
        System.out.println(aramaSonucuElementi.getText());

       String aramaSonucuStr = aramaSonucuElementi.getText().replaceAll("\\D","");

        System.out.println(aramaSonucuStr);

       int    aramaSonucuSayisiInt  =   Integer.parseInt(aramaSonucuStr);

        System.out.println(aramaSonucuSayisiInt);

        if(aramaSonucuSayisiInt>0){
            System.out.println("aranan urun sayısı"+ aramaSonucuSayisiInt);
        }else System.out.println("arama sonucu urun bulunamadı");


    }
}
