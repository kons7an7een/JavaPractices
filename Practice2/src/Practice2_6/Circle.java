package Practice2_6;

public class Circle {
    private double radius;
    public Circle(double r) {
        radius = r;
    }
    public void setRadius(double r) {
        radius = r;
    }
    public double getRadius() {
        return radius;
    }
    public double square() {
        return 3.14 * radius * radius;
    }
    public double perimeter() {
        return 2 * 3.14 * radius;
    }
    public double compare(double r1, double r2) {
        if (r1 > r2) return r1; else
            if (r1 < r2) return r2; else return 0;
    }
}
