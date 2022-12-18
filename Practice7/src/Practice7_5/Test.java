package Practice7_5;

public class Test {
    public static void main(String[] args) {
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringEditor str = new StringEditor(s);
        System.out.println("Строка - " + s);
        System.out.println("Длина строки - " + str.getLength());
        System.out.println("Вывод нечётных по позиции символов строки - " + str.getOnlyOddChars());
        System.out.println("Результат инвертирования строки - " + str.invert());
    }
}
