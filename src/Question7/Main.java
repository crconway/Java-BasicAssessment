package Question7;

/**
 * Created by crc07 on 5/10/17.
 * 7.	Create a main method that loops through a double array of integers. The loop should output the value of the greatest number. (10 points)
 *  a.	Requirements: Row > 5 and Col > 5
 *  b.	Define your double array

 */
public class Main {

    public static void main(String[] args) {

       int [][] num = {{53,98,24,20,7,2},{37,293,9,21,26,46},
                {57,23,14,723,552,34},{39,434,9,291,73,93},
                {334,292,59,31,84,92},{97,84,4,18,172,17}};
        int largeNum = 0;

        for (int i = 0; i <  num.length; i++) {
            for (int j = 0; j < num[i].length ; j++) {
                if(num[i][j]> largeNum){
                    largeNum = num[i][j];
                }

            }

        }
        System.out.println("Largest Number = "+largeNum);
    }
}
