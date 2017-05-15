package Question8;

/**
 * Created by crc07 on 5/12/17.
 * 8.	Create a method (no need for a main or class) that replaces all vowels inside an array with a character (10 points)
 *  a.	Requirements: String and character need to be passed to the method as arguments
 *  b.	Requirements: method should print the new string and return the number of characters that got replaced
 */
public class MainReplace {

    public static String str0 = "This is the Final Assessment for Java Basics";
    public static char toRep = 'Z';



    public static void main(String[] args) {

        CharReplace rChar = new CharReplace();

        System.out.println("\n"+ rChar.replaceCharString(str0, toRep)+" vowels replaced with a "+toRep+".");
    }

}
