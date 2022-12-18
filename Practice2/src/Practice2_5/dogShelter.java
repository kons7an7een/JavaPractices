package Practice2_5;

import java.util.Scanner;

public class dogShelter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Dog[] Dogs = new Dog[100];
        String name = "";
        int age = 0;
        System.out.println("Сколько собак в питомнике? (Максимум их может быть 100)");
        int n = input.nextInt();
        Dog Dog = new Dog(name, age);
        for (int i = 0; i < n; i++) {
            System.out.format("Имя %s-ой собаки: ", (i+1));
            input.nextLine();
            name = input.nextLine();
            System.out.format("Возраст %s-ой собаки: ", (i+1));
            age = input.nextInt();
            Dog.setName(name);
            Dog.setAge(age);
            Dogs[i] = Dog;
            System.out.println(Dogs[i].ToString());
        }
    }
}
