package Xpath_Odev;

import Untility.BaseDriver;
import Untility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


/*

  1) Bu siteye gidin. -> http://demoqa.com/text-box

  2) Full Name kısmına "Automation" girin.

  3) Email kısmına "Testing@gmail.com" girin.

  4) Current Address kısmına "Testing Current Address" girin.

  5) Permanent Address kısmına "Testing Permanent Address" girin.

  6) Submit butonuna tıklayınız.

  7) Full Name'in, "Automation"ı içinde bulundurduğunu doğrulayın.

  8) Email'in, "Testing"ı içinde bulundurduğunu doğrulayın.

*/

public class _01_Soru extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("http://demoqa.com/text-box");

        WebElement fullName=driver.findElement(By.xpath("//input[@id='userName'][@type='text']"));
        fullName.sendKeys("Automation");


        MyFunc.Bekle(2);
        WebElement email=driver.findElement(By.xpath("//input[@id='userEmail'][@type='email']"));
        email.sendKeys("Testing@gmail.com");


        MyFunc.Bekle(2);
        WebElement currentAdress=driver.findElement(By.xpath("//textarea[@placeholder='Current Address']"));
        currentAdress.sendKeys("Testing Current Address");

        MyFunc.Bekle(2);
        WebElement parmanentAdress=driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        parmanentAdress.sendKeys("Testing Permanent Address");

        MyFunc.Bekle(10);
        WebElement submit= driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        submit.sendKeys(Keys.ENTER);




        BekleKapat();
    }
}
