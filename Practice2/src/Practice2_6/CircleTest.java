package Practice2_6;

public class CircleTest {
    public static void main(String[] args) {
        Circle Cycle = new Circle(0);
        Cycle.setRadius(3);
        System.out.println("Радиус окружности - " + Cycle.getRadius());
        System.out.println("Длина окружности - " + Cycle.perimeter());
        System.out.println("Площадь круга - " + Cycle.square());
        double r1 = 1, r2 = 5;
        int i = 0;
        while (i < 3) {
            System.out.println("Даны две окружности с радиусами " + r1 + " и " + r2);
            if (Cycle.compare(r1, r2) == r1) System.out.println("Первая окружность больше второй"); else
                if (Cycle.compare(r1, r2) == r2) System.out.println("Вторая окружность больше первой"); else
                    System.out.println("Обе окружности равны");
            i++;
            r1 += 4;
        }
    }
}
