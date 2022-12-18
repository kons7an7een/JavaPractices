package Practice2_7;

public class BookShelf {

    private Book[] books = new Book[100];
    private int bookQ;

    public BookShelf (Book[] books, int bookQ) {
        this.bookQ = bookQ;
        for (int i = 0; i < this.bookQ; i++) {
            this.books[i] = books[i];
        }
    }

    public Book[] getBooks() {
        return books;
    }

    public Book findEarliestBook (Book[] books) {
        Book earliest = books[0];
        for (int i = 1; i < bookQ; i++)
            if (earliest.getReleaseYear() > books[i].getReleaseYear()) earliest = books[i];
        return earliest;
    }

    public Book findLatestBook (Book[] books) {
        Book latest = books[0];
        for (int i = 1; i < bookQ; i++)
            if (latest.getReleaseYear() < books[i].getReleaseYear()) latest = books[i];
        return latest;
    }

    public void sortBooks (Book[] books) {
        Book k;
        for (int i = 0; i < bookQ - 1; i++)
            for (int j = i + 1; j < bookQ; j++)
                if (books[i].getReleaseYear() > books[j].getReleaseYear()) {
                    k = books[i];
                    books[i] = books[j];
                    books[j] = k;
                }
    }

    @Override
    public String toString() {
        String fullInfo = "Книжная полка:\n\n";
        for (int i = 0; i < bookQ; i++) {
            fullInfo += (i + 1) + "-я книга:" + books[i].toString();
        }
        return fullInfo;
    }

}
