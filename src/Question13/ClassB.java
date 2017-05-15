package Question13;

import java.util.concurrent.TimeUnit;

/**
 * Created by crc07 on 5/14/17.
 */
public class ClassB {

    public void timeUtil() {

        for (int i = 0; i < 8; i++) {
            try {
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Seconds: " + i);
            } catch (InterruptedException ie) {
                System.out.println("Waiting ...... ");
            }
        }

    }

    public void timeCounter() throws Exception {
        for (int i = 0; i < 5; i++) {
            TimeUnit.SECONDS.sleep(1);
            System.out.println("Seconds: " + i);
        }
    }
}
