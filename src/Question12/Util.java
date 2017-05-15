package Question12;

import java.util.Random;

/**
 * Created by crc07 on 5/12/17.
 */
public class Util {
    static int i;
    static int y;
    static double answer;

    public static double divNumber(int a, int b) {
        i = a;
        y = b;
        try {
           answer = (double) i/y;
        } catch (ArithmeticException ae) {
            ae.printStackTrace();
        }
        return answer;
    }
}
