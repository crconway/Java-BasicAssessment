package Question9;

/**
 * Created by crc07 on 5/12/17.
 * 9.	Create me a class called ClassA that contains 2 private double fields and a default constructor.
 * The constructor should default the values to zero. Use encapsulation for both private fields. (10 points)
 */
public class ClassA {

    private double field1 = 0;
    private double field2 = 0;

    public double methodToDoSomethng(double a, double b){
        this.field1 = a;
        this.field2 = b;

        return field1*field2;
    }
}
