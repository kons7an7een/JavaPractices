package Practice3_4;

import java.util.*;

public class Array {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int[] a1 = new int[100];
        int[] a2 = new int[100];
        System.out.print("Введите количество элементов массива: ");
        int n = input.nextInt();
        while(n > 100) {
            System.out.format("Повторно введите количество элементов массива (оно должно быть не больше %s): ", 100);
            n = input.nextInt();
        }
        System.out.print("\nИсходный массив: ");
        for (int i = 0; i < n; i++) {
            a1[i] = rand.nextInt(n);
            System.out.print(" " + a1[i]);
        }
        int j = 0;
        System.out.print("\nМассив с чётными числами: ");
        for (int i = 0; i < n; i++) {
            if (a1[i] % 2 == 0) {
                a2[j] = a1[i];
                System.out.print(" " + a2[j]);
                j++;
            }
        }
    }
}
