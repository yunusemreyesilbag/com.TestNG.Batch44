package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C06_MouseActions4 extends TestBase {

    //Yeni bir class olusturalim: D15_MouseActions4

    @Test
    public void test(){
        //1- https://www.facebook.com adresine gidelim
        driver.get("https://www.facebook.com");
        //2- Yeni hesap olustur butonuna basalim
        driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
        //3- Ad, soyad, mail ve sifre kutularina deger yazalim ve kaydol tusuna basalim
        WebElement ad=driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-']"));
        Actions actions=new Actions(driver);
        actions.click(ad).
                sendKeys("username").sendKeys(Keys.TAB).
                sendKeys("password").sendKeys(Keys.TAB).
                sendKeys("username@password").sendKeys(Keys.TAB).
                sendKeys("Valence").sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys("10").sendKeys(Keys.TAB).
                sendKeys("sep").sendKeys(Keys.TAB).
                sendKeys("2020").sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(Keys.SPACE).sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).perform();



        //4- Kaydol tusuna basalim
    }
}
