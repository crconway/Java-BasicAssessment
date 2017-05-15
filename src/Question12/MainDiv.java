package Question12;

/**
 * Created by crc07 on 5/12/17.
 * 1.	Create a method that returns the division of two numbers. Implements try/catch for the ArithmeticException. (5 points)
 *  a.	Requirements: both numbers have to be passed as arguments
 */
public class MainDiv extends Util{
    public static void main(String[] args) {
        int num1;
        int num2;

        for (int i = 1; i < 10; i++) {
            num1 = i+12;
            num2 = i -3;
            System.out.println(num1+ " divided by "+ num2 + " = "+ divNumber(num1, num2));
        }
    }
}
