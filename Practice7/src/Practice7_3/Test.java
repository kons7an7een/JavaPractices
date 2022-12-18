package Practice7_3;

public class Test {

    public static void main(String[] args) {
        MovablePoint point1 = new MovablePoint(0, 8),
                point2 = new MovablePoint(14, 0);
        MovableRectangle rect = new MovableRectangle(point1, point2);
        System.out.println(rect.toString());
        rect.setxSpeed(3);
        rect.setySpeed(1);
        System.out.printf("Скорость перемещения по X - %d; по Y - %d\n\n", rect.getxSpeed(), rect.getySpeed());
        rect.moveUp();
        System.out.printf("Прямоугольник переместился на %d вверх.\n", rect.getySpeed());
        System.out.println(rect.toString());
        rect.moveRight();
        System.out.printf("Прямоугольник переместился на %d вправо.\n", rect.getxSpeed());
        System.out.println(rect.toString());
        rect.moveDown();
        System.out.printf("Прямоугольник переместился на %d вниз.\n", rect.getySpeed());
        System.out.println(rect.toString());
        rect.moveLeft();
        System.out.printf("Прямоугольник переместился на %d влево.\n", rect.getxSpeed());
        System.out.println(rect.toString());
    }

}
