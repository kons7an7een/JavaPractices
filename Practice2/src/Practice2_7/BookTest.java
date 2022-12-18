package Practice2_7;

public class BookTest {

    public static void main(String[] args) {
        Book[] books = new Book[20];
        int bookQ = 4;
        Book book1 = new Book("Author1", "Book1", 2020, 2022);
        Book book2 = new Book("Author2", "Book2", 1999, 2000);
        Book book3 = new Book("Author3", "Book3", 1678, 1678);
        Book book4 = new Book("Author4", "Book4", 1898, 1900);
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        BookShelf shelf = new BookShelf(books, bookQ);
        System.out.println(shelf.toString());
        System.out.println("Книга с ранним сроком издания:" + shelf.findEarliestBook(shelf.getBooks()).toString());
        System.out.println("Книга с поздним сроком издания:" + shelf.findLatestBook(shelf.getBooks()).toString());
        shelf.sortBooks(shelf.getBooks());
        System.out.println("*После сортировки*\n" + shelf.toString());
    }

}
