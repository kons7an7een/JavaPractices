package Practice2_3;

public class Tester {
    private Circle[] Cycles = new Circle[100];
    private int N;
    public Tester() {
        int n = 5;
        double newX = 1, newY = 1;
        for (int i = 0; i < n; i++) {
            Point Center = new Point(newX, newY);
            Circle Cycle = new Circle(Center);
            Cycles[i] = Cycle;
            System.out.println("Координаты " + (i+1) + "-ой окружности: (" + Cycles[i].getX() + "; " + Cycles[i].getY() + ")");
            newX += 1;
            newY = newX * newX;
        }
    }
    public static void main(String[] args) {
        Tester Test = new Tester();
    }
}