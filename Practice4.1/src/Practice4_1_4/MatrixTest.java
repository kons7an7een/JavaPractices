package Practice4_1_4;

import java.util.*;

public class MatrixTest {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(4) + 1;
        int b = random.nextInt(4) + 1;
        int c = random.nextInt(4) + 1;
        Matrix m1 = new Matrix(a, b);
        Matrix m2 = new Matrix(a, b);
        Matrix m3 = new Matrix(b, c);
        int n = random.nextInt(10);
        System.out.println("Матрица 1:");
        m1.output(m1.getMatrix());
        System.out.println("Матрица 2:");
        m2.output(m2.getMatrix());
        System.out.println("Матрица 3:");
        m3.output(m3.getMatrix());
        System.out.println("Сложим матрицу 1 и матрицу 2. В результате получаем:");
        m1.output(m1.add(m1.getMatrix(), m2.getMatrix()));
        System.out.printf("Умножим матрицу 1 на %d. В результате получаем:\n", n);
        m1.output(m1.multiplyByN(m1.getMatrix(), n));
        System.out.println("Умножим матрицу 1 на матрицу 3. В результате получаем:");
        m1.output(m1.multiply(m1.getMatrix(), m3.getMatrix()));
    }
}
