package Question10;

/**
 * Created by crc07 on 5/14/17.
 */
public interface AInterface {

    //abstract methpd
    void returnMessage();

    //default method
    default void identifyInterface(){
        System.out.println("This is the interface ... ");
        returnStaticMessage();
    }

    //static method
    static void returnStaticMessage(){
        System.out.println("This is static method from the interface ...");
    }


}
