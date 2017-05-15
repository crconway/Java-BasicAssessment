package Question11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by crc07 on 5/14/17.
 */
public class ClassB implements InterfaceA{

    public void listMonths (){
        String[] months = {"January", "February","March","April","May","June","July","August","September","October", "November", "December"};
        List<String> monthList = Arrays.asList( months );
        for (String temp:monthList) {
            System.out.println(temp);
        }


    }
}
