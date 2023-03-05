package Xpath_Odev;

import Untility.BaseDriver;
import Untility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/*

        2-
        1) Bu siteye gidin. -> https://demo.applitools.com/

        2) Username kısmına "ttechno@gmail.com" girin.

        3) Password kısmına "techno123." girin.

        4) "Sign in" buttonunan tıklayınız.

        5) "Your nearest branch closes in: 30m 5s" yazısının göründüğünü doğrulayınız.

 */

public class _02_Soru extends BaseDriver {

    @Test
    public void Test1() {

        driver.get("https://demo.applitools.com/");

        WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
        username.sendKeys("ttechno@gmail.com");

        MyFunc.Bekle(2);
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("techno123.");

        MyFunc.Bekle(2);
        WebElement singİn = driver.findElement(By.xpath("//a[@id='log-in']"));
        singİn.click();

        MyFunc.Bekle(2);
        WebElement text = driver.findElement(By.xpath("//h6[@id='time']"));


        Assert.assertTrue(text.getText().equals("Your nearest branch closes in: 30m 5s"));


        BekleKapat();
    }
}
