package Practice4_1_4;

import java.util.*;

public class Matrix {
    Random random = new Random();
    private int a, b;
    private double[][] m;

    Matrix(int a, int b) {
        this.a = a;
        this.b = b;
        m = new double[a][b];
        for (int i = 0; i < a; i++)
            for (int j = 0; j < b; j++)
                m[i][j] = random.nextDouble();
    }

    public double[][] getMatrix() {
        return m;
    }

    public double[][] add(double[][] m1, double[][] m2) {
        double[][] res = new double[a][b];
        for (int i = 0; i < a; i++)
            for (int j = 0; j < b; j++) {
                res[i][j] = m1[i][j] + m2[i][j];
            }
        return res;
    }

    public double[][] multiplyByN(double[][] m, int n) {
        double[][] res = new double[a][b];
        for (int i = 0; i < a; i++)
            for (int j = 0; j < b; j++) {
                res[i][j] = m[i][j] * n;
            }
        return res;
    }

    public void output(double[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++)
                System.out.print(m[i][j] + "     ");
            System.out.println();
        }
    }

    public double[][] multiply(double[][] m1, double[][] m2) {
        double[][] res = new double[m1.length][m2[0].length];
        for (int i = 0; i < m1.length; i++)
            for (int j = 0; j < m2[0].length; j++)
                for (int k = 0; k < m1[0].length; k++)
                    res[i][j] += m1[i][k] * m2[k][j];
        return res;
    }
}
