package Practice2_3;

public class Circle {
    private Point Center = new Point(getX(), getY());
    private double X = 1;
    private double Y = 1;
    public Circle(Point Center) {
        this.X = Center.getX();
        this.Y = Center.getY();
    }
    public void setX(double x) {
        this.X = Center.getX();
    }
    public void setY(double y) {
        this.Y = Center.getY();
    }
    public double getX() {
        return X;
    }
    public double getY() {
        return Y;
    }
}
