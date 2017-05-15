package Question6;

import java.util.Random;

/**
 * Created by crc07 on 5/10/17.
 * 6.	Create a method that receives an integer argument from 0-100 and returns your test grade in a String format. (10 points)
 *   a.	Example: Input = 79	Output = “Your score of 79 got you a C.”
 */
public class Main {

    public static void main(String[] args) {

        int gradeNum = randomNumber();
        char gradeLetter = gradeValues(gradeNum);

        if (gradeLetter == '0'){
            System.out.println("Invalid Grade of "+ gradeNum);
        }else {
            System.out.println("Your score of " + gradeNum + " got you a " + gradeLetter + ".");
        }

    }

    private static char gradeValues(int grade) {
        int a = grade;

        if (a >= 90) {
            return 'A';
        } else if (a <= 89 && a >= 80) {
            return 'B';
        } else if (a <= 79 && a >= 70) {
            return 'C';
        } else if (a <= 69 && a >= 60) {
            return 'D';
        } else {
            if (a < 0) {
                return '0';
            } else
                return 'F';
        }
    }

    public static int randomNumber() {

        Random rand = new Random();
        int n = rand.nextInt(100) - 3;  // did - 3 to get an invalid grade below 0;
        return n;


    }
}


