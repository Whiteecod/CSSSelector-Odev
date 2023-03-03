package Untility;

import javafx.application.Application;
import javafx.stage.Stage;

public class MyFunc  {

    public static void Bekle(int saniye) {

        try {
            Thread.sleep(1000 * saniye);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
