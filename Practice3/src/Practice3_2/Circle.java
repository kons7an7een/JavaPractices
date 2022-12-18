package Practice3_2;

public class Circle {

    private Point center;
    private int radius;
    private double length;

    Circle(Point center, int radius) {
        this.center = new Point(center.getX(), center.getY());
        this.radius = radius;
        length = 2 * Math.PI * radius;
    }

    public long getLength(int radius) {
        return Math.round(length);
    }

    public int getRadius() {
        return radius;
    }


}
