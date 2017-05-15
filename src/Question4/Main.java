package Question4;

/**
 * Created by crc07 on 5/10/17.
 * 4.	Create a method that returns back the largest number in an array of integers (5 points)
 *   a.	The method should receive an array of integers
 */
public class Main {

    public static void main(String[] args) {
        int [] num = {7,2,56,9,1};
        System.out.println("Largest number: "+largestNumber(num));

    }

    public static int largestNumber(int[] arr) {
        int lar = 0; //largest value
        for (int i = 0; i < arr.length; i++) {
            if (lar < arr[i]){
                lar = arr[i];
            }
        }
        return lar;

    }
}


