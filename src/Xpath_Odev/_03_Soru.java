package Xpath_Odev;

import Untility.BaseDriver;
import Untility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
/*
3-
        1) Bu siteye gidin. -> https://www.snapdeal.com/

        2) "teddy bear" aratın ve Search butonuna tıklayın.

        3) Bu yazının göründüğünü doğrulayınız. -> (We've got 297 results for 'teddy bear')
        Not: Bu yazıdaki sayı değişiklik gösterebilir. Önemli olan cümle kalıbı.

 */

public class _03_Soru extends BaseDriver {

    @Test
    public void Test() {
        driver.get("https://www.snapdeal.com/");

        WebElement text = driver.findElement(By.xpath("//input[@id='inputValEnter']"));
        text.sendKeys("teddy bear");

        WebElement search = driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
        search.click();

        WebElement teddyBear = driver.findElement(By.xpath("//div[@id='searchMessageContainer']//span[@class='nnn']"));
        MyFunc.Bekle(2);

        Assert.assertTrue(teddyBear.getText().contains("results for teddy bear"));


        BekleKapat();
    }
}
