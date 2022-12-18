package Practice6_11;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Kelvin K = new Kelvin();
        Fahrenheit F = new Fahrenheit();
        System.out.print("Введите значение температуры в градусах Цельсия: ");
        double T = input.nextDouble();
        System.out.println("Температура в Кельвинах: " + K.convert(T));
        System.out.println("Температура в градусах Фаренгейта: " + F.convert(T));
    }
}
