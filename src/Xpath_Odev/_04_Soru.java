package Xpath_Odev;

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

public class _04_Soru extends BaseDriver {

    @Test
    public void Test() {
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement calculet=driver.findElement(By.xpath("//a[@id='calculatetest']"));
        calculet.click();

        MyFunc.Bekle(2);
        WebElement number1=driver.findElement(By.xpath("//input[@id='number1']"));
        number1.sendKeys("25");

        MyFunc.Bekle(2);
        WebElement number2=driver.findElement(By.xpath("//input[@id='number2']"));
        number2.sendKeys("55");

        MyFunc.Bekle(2);
        WebElement calculetButton=driver.findElement(By.xpath("//input[@id='calculate']"));
        calculetButton.click();

        MyFunc.Bekle(2);
        WebElement answer=driver.findElement(By.xpath("//span[@id='answer']"));

        Assert.assertEquals(answer.getText(),"80");
        Assert.assertTrue("Bulunamadı", answer.getText().contains("80"));
        System.out.println("answer.getText() = " + answer.getText());

        BekleKapat();
    }

}
