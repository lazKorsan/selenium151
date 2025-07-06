package hafta1.Ders3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;
import utilities.TestBase;

import java.util.List;

public class productSizeProductList02 {
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
    public void TestWebApp(){
        driver.get("http://zero.webappsecurity.com ");
        WebElement bbbuttonOnlineBanking = driver.findElement(By.id("onlineBankingMenu")) ;
        System.out.println(bbbuttonOnlineBanking.getText());
        bbbuttonOnlineBanking.click();

        List<WebElement> lllistOnLineBankingMenu = driver.findElements(By.className("headers")) ;

        System.out.println(lllistOnLineBankingMenu.size());

        int expectedOnLineBankingMenuSize = 6 ;
        int actualOnlineBankingMenuSize  = lllistOnLineBankingMenu.size() ;

        if (expectedOnLineBankingMenuSize == actualOnlineBankingMenuSize){
            System.out.println("online banking menu sayisi testi Passed "
            +"menu sayısı "+
                    expectedOnLineBankingMenuSize);
        }

        for (int i = 0; i <actualOnlineBankingMenuSize ; i++) {

            System.out.println(lllistOnLineBankingMenu.get(i).getText());

        }
        boolean payBillsVarMi= false ;

        for ( WebElement eachBaslikElementleri :lllistOnLineBankingMenu  ){
            if (eachBaslikElementleri.getText().equals("Pay Bills")){
                payBillsVarMi = true ;

            }

        }

        if (payBillsVarMi == true){
            System.out.println("payBills testi  Passed");
        }else System.out.println("payBills testi Failed");


        }








}
