package Practice4_1_8;

public abstract class Shape {

    protected String color;
    protected boolean filled;

    Shape(){}
    Shape(String color, boolean filled){}

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract String getType();

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Just a shape";
    }

}
