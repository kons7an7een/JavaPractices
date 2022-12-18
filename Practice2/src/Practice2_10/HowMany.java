package Practice2_10;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String smth = input.nextLine();
        smth = smth.trim();
        int q = 0;
        if (!smth.isEmpty()) {
            q++;
            for (int i = 1; i < smth.length(); i++) {
                if (smth.charAt(i-1) != ' ' && smth.charAt(i) == ' ')
                    q++;
            }
        }
        System.out.println("Количество слов в набранной строке: " + q);
    }
}
