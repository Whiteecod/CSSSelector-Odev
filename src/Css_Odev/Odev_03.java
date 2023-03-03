package Css_Odev;

import Untility.BaseDriver;
import Untility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/*
        1) Bu siteye gidin. -> https://www.snapdeal.com/

        2) "teddy bear" aratın ve Search butonuna tıklayın.

        3) Bu yazının göründüğünü doğrulayınız. -> (We've got 297 results for 'teddy bear')
        Not: Bu yazıdaki sayı değişiklik gösterebilir. Önemli olan cümle kalıbı.

 */

public class Odev_03 extends BaseDriver {

    @Test
    public void Test() {
        driver.get("https://www.snapdeal.com/");

        WebElement text = driver.findElement(By.cssSelector("div[class='col-xs-14 search-box-wrapper'] > [type='text']"));
        text.sendKeys("teddy bear");

        WebElement search = driver.findElement(By.cssSelector("span[class='searchTextSpan']"));
        search.click();

        WebElement teddyBear = driver.findElement(By.cssSelector("div[id='searchMessageContainer'] [class='nnn']"));
        MyFunc.Bekle(2);

        Assert.assertTrue(teddyBear.getText().contains("We've got 329 results for teddy bear"));


        BekleKapat();
    }
}
