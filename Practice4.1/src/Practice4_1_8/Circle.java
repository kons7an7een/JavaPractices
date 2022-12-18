package Practice4_1_8;

import java.util.*;

public class Circle extends Shape {


    protected double radius;

    Circle() {}
    Circle(double radius) {
        this.radius = radius;
    }
    Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String getType() {
        return "Circle";
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    @Override
    public String toString() {
        return "Shape type - " + getType() + "\nColor - " + getColor()
                + "\nIs filled? - " + isFilled() +
                "\nRadius = " + getRadius() + "\nArea = " + getArea() +
                "\nPerimeter = " + getPerimeter();
    }

}
