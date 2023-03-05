package ActionClass;

import Untility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

/*
Ödev 1 : http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html
         buradaki ülke ve şehirleri findElements ile topluca bularak bir döngü ile bütün şehirleri doğru ülkere dağıtınız.
 */

public class _01_Soru extends BaseDriver {
    @Test
    public void Test(){
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");

        Actions aksiyonlar = new Actions(driver);

        List<WebElement> ulkeler = driver.findElements(By.className("dragDropSmallBox]"));
        List<WebElement> sehirler = driver.findElements(By. className("dragDropSmallBox"));
        aksiyonlar.dragAndDrop((WebElement) sehirler, (WebElement) ulkeler).build().perform();


        for (WebElement s:sehirler) {
            System.out.println("s.getText() = " + s.getText());

        }



      BekleKapat();
    }
}
