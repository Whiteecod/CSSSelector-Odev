package Css_Odev;

import Untility.BaseDriver;
import Untility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/*
Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]

        Calculate'e tıklayınız.

        İlk input'a herhangi bir sayı giriniz.

        İkinci input'a herhangi bir sayı giriniz.

        Calculate button'una tıklayınız.

        Sonucu alınız.

        Sonucu yazdırınız.

 */

public class Odev_04 extends BaseDriver {

    @Test
    public void Test1() {

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement calculate=driver.findElement(By.cssSelector("a[id='calculatetest'][href='calculator']"));
        calculate.click();

        MyFunc.Bekle(2);
        WebElement inputSayi1=driver.findElement(By.cssSelector("input[id='number1'][name='number1']"));
        inputSayi1.sendKeys("25");

        MyFunc.Bekle(2);
        WebElement inputSayi2=driver.findElement(By.cssSelector("input[id='number2'][name='number2']"));
        inputSayi2.sendKeys("35");

        MyFunc.Bekle(2);
        WebElement clickCalculate= driver.findElement(By.cssSelector("input[id='calculate'][value='Calculate']"));
        clickCalculate.click();

        WebElement result=driver.findElement(By.cssSelector("span[id='answer']"));

        System.out.println("result = " + result.getText());

        Assert.assertTrue(result.getText().equals("60"));



BekleKapat();
    }
}
