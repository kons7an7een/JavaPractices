package Practice3_1;

import java.util.*;

public class Randomizer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Напечатайте 1, если хотите сгенерировать числа методом" +
                " random класса Math или другой символ, если методами класса Random.");
        String wish = input.nextLine();
        double[] arr = new double[10];
        if (wish.equals("1")) {
            for (int i = 0; i < 10; i++)
                arr[i] = Math.random();
        } else {
            for (int i = 0; i < 10; i++)
                arr[i] = rand.nextDouble();
        }
        System.out.println("Исходный массив:");
        output(arr);
        System.out.println("\nНапечатайте 1, если хотите отсортировать массив" +
                " по возрастанию, другой символ, если по убыванию.");
        wish = input.nextLine();
        if (wish.equals("1")) sort_up(arr); else sort_down(arr);
        System.out.println("Отсортированный массив:");
        output(arr);
    }

    public static void output(double[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.println(a[i]);
    }

    public static void sort_up(double[] a) {
        double k;
        for (int i = 0; i < a.length-1; i++)
            for (int j = i+1; j < a.length; j++)
                if (a[i] > a[j]) {
                    k = a[i];
                    a[i] = a[j];
                    a[j] = k;
                }

    }

    public static void sort_down(double[] a) {
        double k;
        for (int i = 0; i < a.length-1; i++)
            for (int j = i+1; j < a.length; j++)
                if (a[i] < a[j]) {
                    k = a[i];
                    a[i] = a[j];
                    a[j] = k;
                }

    }

}
