package Practice4_1_8;

public class Square extends Rectangle {
    protected double side;

    Square() {}
    Square(double side) {
        this.side = side;
        setLength(side);
        setWidth(side);
    }
    Square(double side, String color, boolean filled) {
        this.side = side;
        this.color = color;
        this.filled = filled;
        setLength(side);
        setWidth(side);
    }

    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String getType() {
        return "Square";
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }
    @Override
    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Shape type - " + getType() + "\nColor - " + getColor()
                + "\nIs filled? - " + isFilled() + "\nSide = " + getSide() + "\nArea = " + getArea() +
                "\nPerimeter = " + getPerimeter();
    }
}
