package Question5;

import java.util.Random;

/**
 * Created by crc07 on 5/10/17.
 * 5.	Create a method that returns a random number from 1-100 (3 points)
 *
 *
 */
public class Main {
    public static void main(String[] args) {

        System.out.println(randomNumber());
    }


    public static int randomNumber() {

        Random rand = new Random();
        int n = rand.nextInt(100) + 1;
        return n;

     }
}
