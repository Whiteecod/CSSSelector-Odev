package Css_Odev;

import Untility.BaseDriver;
import Untility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Odev_02 extends BaseDriver {

    @Test
    public void Test1() {

        driver.get("https://demo.applitools.com/");

        WebElement username = driver.findElement(By.cssSelector("div[class='form-group'] > [id='username']"));
        username.sendKeys("ttechno@gmail.com");

        MyFunc.Bekle(2);
        WebElement password = driver.findElement(By.cssSelector("div[class='form-group'] > [id='password']"));
        password.sendKeys("techno123.");

        MyFunc.Bekle(2);
        WebElement singİn = driver.findElement(By.cssSelector("div[class='buttons-w'] > [id='log-in']"));
        singİn.click();

        MyFunc.Bekle(2);
        WebElement text = driver.findElement(By.cssSelector("div[class='element-actions'] + [id='time']"));


        Assert.assertTrue(text.getText().equals("Your nearest branch closes in: 30m 5s"));


        BekleKapat();
    }
}
