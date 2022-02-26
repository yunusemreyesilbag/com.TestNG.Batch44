package day15;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;
import java.io.File;
import java.io.IOException;
public class C02_ScreenshotWebelement extends TestBase {
    @Test
    public void nutellaTesti() throws InterruptedException, IOException {
        // amazon anasayfaya gidelim
        driver.get("https://www.amazon.com");
        // nutella icin arama yapalim
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
        // sonuclarin nutella icerdigini test edelim
        WebElement sonucYazisiElementi=driver.findElement(By.xpath("//div[@class='sg-col-inner']"));
        String sonucSayisiStr=sonucYazisiElementi.getText();
        Assert.assertTrue(sonucSayisiStr.contains("Nutella"));
        // testin calistiginin ispati icin tum sayfanin screenshot'ini alalim

        // sonuc yazısı web elementinin screenshot icin 4 adim gerekli
        // 1- adim TakeScreenShot objesi olusturma
         // 2- kaydedecegimiz dosyayi olusturalim
        File webelementSS=new File("target/screenshot/webele.jpg");
        // 3- bir dosya daha olusturup screenshot objesi ile screenshot'i alalim

        File geciciResim  = sonucYazisiElementi.getScreenshotAs(OutputType.FILE);

        // 4- gecici resmi kaydetmek istedigimiz asil dosyaya copy yapalim
        FileUtils.copyFile(geciciResim,webelementSS);







        Thread.sleep(5000);
    }
}


