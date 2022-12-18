package Practice4_1_8;

import java.sql.SQLOutput;

public class ShapeTest {

    public static void main(String[] args) {
        Circle circle = new Circle(3, "Red", true);
        Rectangle rectangle = new Rectangle(4, 5, "Green", true);
        Square square = new Square(2, "Blue", false);
        System.out.println(circle.toString() + "\n");
        System.out.println(rectangle.toString() + "\n");
        System.out.println(square.toString());
    }

}
