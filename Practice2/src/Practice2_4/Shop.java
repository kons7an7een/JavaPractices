package Practice2_4;

import java.util.*;

public class Shop {

    private PC[] computers;
    private int q;
    Scanner input = new Scanner(System.in);

    Shop() {
        System.out.print("Введите количество компьютеров в магазине: ");
        q = input.nextInt();
        computers = new PC[q];
        input.nextLine();
        for (int i = 0; i < q; i++) {
            System.out.printf("Введите название %s-го компьютера: ", (i+1));
            PC newPC = new PC(input.nextLine());
            addPC(newPC, i);
        }
        int q1 = q;
        System.out.println("Хотите приобрести компьютер? Напишите 1, если да.");
        int wish = input.nextInt();
        while (wish == 1) {
            if (q1 > 0) {
                input.nextLine();
                System.out.print("Напишите название желаемого компьютера: ");
                String wishPCName = input.nextLine();
                if (findPC(wishPCName) != null) {
                    deletePC(findPC(wishPCName));
                    System.out.println("Компьютер куплен!");
                    q1--;
                } else {
                    System.out.println("Желаемый компьютер не найден!");
                }
                if (q1 > 0) {
                    System.out.println("Хотите приобрести ещё компьютер? Напишите 1, если да.");
                    wish = input.nextInt();
                }
            } else {
                System.out.println("Все компьютеры распроданы!");
                break;
            }
        }
    }

    private void addPC(PC newPC, int num) {
        computers[num] = newPC;
    }

    private PC findPC(String name) {
        for (int i = 0; i < q; i++) {
            if (computers[i] != null && computers[i].getName().equals(name)) return computers[i];
        }
        return null;
    }

    private void deletePC(PC anyPC) {
        for (int i = 0; i < q; i++) {
            if (computers[i] != null && computers[i].getName().equals(anyPC.getName())) {
                computers[i] = null;
                break;
            }
        }
    }

}
