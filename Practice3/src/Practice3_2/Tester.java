package Practice3_2;

import java.util.*;

public class Tester {

    Random rand = new Random();
    private int n = rand.nextInt(50);
    private Circle[] circles = new Circle[n];
    private Circle minCircle;
    private Circle maxCircle;

    public static void main(String[] args) {
        Tester test = new Tester();
    }

    Tester() {
        setArrayOfCircles();
        System.out.println("Длины окружностей:");
        for (int i = 0; i < n; i++) {
            System.out.println("\t" + circles[i].getLength(circles[i].getRadius()));
        }
        System.out.println("Длина самой большой окружности: " + findMax().getLength(findMax().getRadius()));
        System.out.println("Длина самой маленькой окружности: " + findMin().getLength(findMin().getRadius()));
        sortCircles();
        System.out.println("Длины окружностей (после сортировки):");
        for (int i = 0; i < n; i++) {
            System.out.println("\t" + circles[i].getLength(circles[i].getRadius()));
        }
    }

    private Circle findMax() {
        maxCircle = circles[0];
        for (int i = 0; i < n; i++) {
            if(maxCircle.getLength(maxCircle.getRadius()) < circles[i].getLength(circles[i].getRadius()))
                maxCircle = circles[i];
        }
        return maxCircle;
    }

    private Circle findMin() {
        minCircle = circles[0];
        for (int i = 0; i < n; i++) {
            if(minCircle.getLength(minCircle.getRadius()) > circles[i].getLength(circles[i].getRadius()))
                minCircle = circles[i];
        }
        return minCircle;
    }

    private void setArrayOfCircles() {
        for (int i = 0; i < n; i++) {
            Point center = new Point(rand.nextInt(), rand.nextInt());
            circles[i] = new Circle(center, rand.nextInt(0, 1000));
        }
    }

    private void sortCircles() {
        Circle k;
        for (int i = 0; i < n-1; i++)
            for (int j = i+1; j < n; j++)
                if (circles[i].getLength(circles[i].getRadius()) > circles[j].getLength(circles[j].getRadius())) {
                    k = circles[i];
                    circles[i] = circles[j];
                    circles[j] = k;
                }
    }

}
