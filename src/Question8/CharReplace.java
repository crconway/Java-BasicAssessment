package Question8;

/**
 * Created by crc07 on 5/12/17.
 */
public class CharReplace{

    private String strPhrase;
    public int counter = 0;


    public int replaceCharString(String str1, char repChar) {
        strPhrase = str1;


        char[] arryChar = strPhrase.toCharArray();
        for (int i = 0; i < arryChar.length; i++) {
            if (arryChar[i] == 'a' ||
                    arryChar[i] == 'e' ||
                    arryChar[i] == 'i' ||
                    arryChar[i] == 'u' ||
                    arryChar[i] == 'o' ||
                    arryChar[i] == 'A' ||
                    arryChar[i] == 'E' ||
                    arryChar[i] == 'I' ||
                    arryChar[i] == 'U' ||
                    arryChar[i] == 'O') {
                arryChar[i] = repChar;
                counter++;
            }
            System.out.print(arryChar[i]);

        }
        return counter;
    }
}