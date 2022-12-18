package Practice2_8;

import java.sql.SQLOutput;

public class test {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "c", "d", "e", "f"};
        stringArray array = new stringArray(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(array.getA()[i] + " ");
        System.out.println();
        array.reverse();
        for (int i = 0; i < arr.length; i++)
            System.out.print(array.getA()[i] + " ");
    }
}
