package Practice7_4;

public class Test {
    public static void main(String[] args) {
        MathCalculable test = new MathFunc();
        System.out.println("2 в степени 10: " + test.pow(2, 10));
        System.out.println("Модуль комплексного числа 4 + 3i: " + test.absC(4,3));
        System.out.println("Длина окружности радиусом 7: " + test.findCircleLength(7));
    }
}
