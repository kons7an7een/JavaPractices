package Practice2_2;

public class TestBall {
    public static void main(String[] args) {
        Ball Sphere = new Ball(0, 0);
        Sphere.setX(1);
        Sphere.setY(1);
        Sphere.setXY(2, 4);
        printCurCoords(Sphere);
        Sphere.move(1, 5);
        printCurCoords(Sphere);
    }
    public static void printCurCoords(Ball Sphere) {
        System.out.println("Текущие координаты: (" + Sphere.getX() + "; " + Sphere.getY() + ")");
    }
}
