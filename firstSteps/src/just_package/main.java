package just_package;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = new int[10];
        int sum = 0;
        float av = 0f;
        System.out.print("Введите 10 целых чисел (через пробел): ");
        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextInt();
            sum += a[i];
        }
        av = sum / a.length;
        System.out.println("Сумма элементов массива: " + sum + "\nСреднее арифметическое элементов массива: " + av);
    }
}
