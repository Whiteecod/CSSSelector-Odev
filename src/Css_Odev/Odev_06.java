package Css_Odev;

import Untility.BaseDriver;
import Untility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
/*
Bu siteye gidiniz. https://testpages.herokuapp.com/styled/index.html

        Fake Alerts'e tıklayınız.

        Show modal dialog buttonuna tıklayınız.

        Ok'a tıklayınız.

        Alert kapanmalıdır.

 */

public class Odev_06 extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement fakeAlerts = driver.findElement(By.cssSelector("a[id='fakealerttest']"));
        fakeAlerts.click();

        MyFunc.Bekle(2);
        WebElement showModal=driver.findElement(By.cssSelector("input[id='modaldialog'][type='button']"));
        showModal.click();

        MyFunc.Bekle(2);
        WebElement clickOk=driver.findElement(By.cssSelector("button[id='dialog-ok'][class='dialog-button']"));
        clickOk.click();

        BekleKapat();
    }
}
