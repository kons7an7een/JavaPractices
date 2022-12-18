package Practice3_3;

import java.util.Random;

public class FourRands {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] four = new int[4];
        System.out.print("Последовательность из 4 случайных чисел:");
        for (int i = 0; i < 4; i++) {
            four[i] = rand.nextInt(89) + 10;
            System.out.print(" " + four[i]);
        }
        int count = 0;
        for (int i = 1; i < 4; i++) {
            if (four[i-1] < four[i]) count++;
        }
        if (count == four.length - 1)
            System.out.println("\nПоследовательность строго возрастающая.");
        else
            System.out.println("\nПоследовательность не является строго возрастающей.");
    }
}
