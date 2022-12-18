package Practice2_9;

import java.util.*;

public class PokerTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Сколько человек играет в покер?");
        int n = input.nextInt();
        while (n > 10) {
            System.out.println("Карт на больше 10 человек не хватит! Введите количество человек поменьше.");
            n = input.nextInt();
        }
        Poker poker = new Poker(n);
    }
}
