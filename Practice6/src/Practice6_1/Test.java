package Practice6_1;

public class Test {
    public static void main(String[] args) {
        MovableCircle circle = new MovableCircle(0, 0, 4, 6, 3);
        System.out.println(circle.toString());
        circle.moveUp();
        circle.moveRight();
        System.out.println("Окружность переместилась на " + circle.getxSpeed() +
                " вправо по Ох и на " + circle.getySpeed() + " вверх по Оу.");
        System.out.println("Текущая координата центра окружности - (" + circle.getX() + ", " + circle.getY() + ")");
        circle.setxSpeed(2);
        circle.setySpeed(10);
        circle.moveDown();
        circle.moveLeft();
        System.out.println("Окружность переместилась на " + circle.getxSpeed() +
                " влево по Ох и на " + circle.getySpeed() + " вниз по Оу.");
        System.out.println("Текущая координата центра окружности - (" + circle.getX() + ", " + circle.getY() + ")");
    }
}
