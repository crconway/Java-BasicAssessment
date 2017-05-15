package Question3a;

/**
 * Created by crc07 on 5/9/17.
 * 3.	Create two classes: ClassA and ClassB. ClassA will contain the main method while ClassB has a method called identifyClass. (identifyClass returns no value)
 *   a.	Use instantiation to reach out to the identifyClass method (4 points)
 *   b.	Use inheritance to reach out to the identifyClass method (3 points)
 */
public class ClassA {
    public static void main(String[] args) {
        //instantiation of ClassB
        ClassB classB = new ClassB();
        classB.identifyClass();

    }
}
