package just_package;

import java.util.Scanner;

public class fourth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = new int[10];
        int i = 0, sum = 0;
        System.out.print("Введите 10 целых чисел: ");
        do {
            a[i] = input.nextInt();
            sum += a[i];
            i++;
        } while (i < a.length);
        i = 0;
        int max = a[0], min = a[0];
        while (i < a.length) {
            if (max < a[i]) max = a[i];
            if (min > a[i]) min = a[i];
            i++;
        }
        System.out.print("Сумма элементов массива: " + sum + "\nМаксимальный элемент массива: " + max + "\nМинимальный элемент массива: " + min);
    }
}
