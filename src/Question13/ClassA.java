package Question13;

/**
 * Created by crc07 on 5/14/17.
 * 13.	Create a class called ClassA with a main method. Create a second class called ClassB that contains a method called indentifyClass.
 *      ClassA calls for identifyClass. If you do not wrap ClassB’s method with a try/catch how else can you catch the exception?
 *      Hint: be the lazy developer and the pro-active developer. (15 points)
 */
public class ClassA {
    public static void main(String[] args) {

        ClassB time = new ClassB();
        //exception caught in method
        time.timeUtil();

        //throwable exception
        try {
            time.timeCounter();
        } catch (Exception e) {
            System.out.println("Waiting ... ");
            e.printStackTrace();
        }

    }
}
