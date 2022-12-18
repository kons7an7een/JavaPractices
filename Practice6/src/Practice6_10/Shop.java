package Practice6_10;

import java.util.*;

public class Shop {

    private Computer[] computers;
    private int q;
    Scanner input = new Scanner(System.in);

    Shop() {
        System.out.print("Введите количество компьютеров в магазине: ");
        q = input.nextInt();
        computers = new Computer[q];
        input.nextLine();
        for (int i = 0; i < q; i++) {
            System.out.printf("Введите название %s-го компьютера: ", (i+1));
            Computer newPC = new Computer(input.nextLine());
            newPC.read();
            addPC(newPC, i);
        }
        int q1 = q;
        System.out.println("Хотите приобрести компьютер? Напишите 1, если да.");
        String wish = input.nextLine();
        while (wish.equals("1")) {
            if (q1 > 0) {
                System.out.print("Напишите название желаемого компьютера: ");
                String wishPCName = input.nextLine();
                if (findPC(wishPCName) != null) {
                    System.out.println("Компьютер куплен! Ниже представлены его характеристики:\n" +
                            findPC(wishPCName).toString());
                    deletePC(findPC(wishPCName));
                    q1--;
                } else {
                    System.out.println("Желаемый компьютер не найден!");
                }
                if (q1 > 0) {
                    System.out.println("Хотите приобрести ещё компьютер? Напишите 1, если да.");
                    wish = input.nextLine();
                }
            } else {
                System.out.println("Все компьютеры распроданы!");
                break;
            }
        }
    }

    private void addPC(Computer newPC, int num) {
        computers[num] = newPC;
    }

    private Computer findPC(String name) {
        for (int i = 0; i < q; i++) {
            if (computers[i] != null && computers[i].getName().equals(name)) return computers[i];
        }
        return null;
    }

    private void deletePC(Computer anyPC) {
        for (int i = 0; i < q; i++) {
            if (computers[i] != null && computers[i].getName().equals(anyPC.getName())) {
                computers[i] = null;
                break;
            }
        }
    }

}
