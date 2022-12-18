package Practice6_6_7_8_9;

import java.util.*;

public class Shop implements Printable {

    Scanner input = new Scanner(System.in);
    private Book[] books;

    Shop() {
        System.out.print("Введите количество книг в магазине: ");
        int N = input.nextInt();
        input.nextLine();
        books = new Book[N];
        for (int i = 0; i < N; i++) {
            System.out.printf("Введите название %d-й книги: ", i+1);
            books[i] = new Book(input.nextLine());
        }
        System.out.println("Список книг, которые есть в наличии:");
        print();
    }

    @Override
    public void print() {
        for (int i = 0; i < books.length; i++)
            books[i].print();
    }
}
