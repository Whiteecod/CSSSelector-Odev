package Css_Odev;

import Untility.BaseDriver;
import Untility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/*
Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]

        Fake Alerts' tıklayınız.

        Show Alert Box'a tıklayınız.

        Ok'a tıklayınız.

        Alert kapanmalıdır.

 */

public class Odev_05 extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement fakeAlerts = driver.findElement(By.cssSelector("a[id='fakealerttest']"));
        fakeAlerts.click();

        MyFunc.Bekle(2);
        WebElement showAlertBox = driver.findElement(By.cssSelector("input[id='fakealert'][type='button']"));
        showAlertBox.click();

        MyFunc.Bekle(2);
        WebElement alertToClick = driver.findElement(By.cssSelector("button[id='dialog-ok'][class='dialog-button']"));
        alertToClick.click();

        BekleKapat();
    }
}
