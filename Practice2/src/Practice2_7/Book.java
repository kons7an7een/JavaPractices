package Practice2_7;

public class Book {

    private String author, name;
    private int writingYear, releaseYear;

    public Book(String author, String name, int writingYear, int releaseYear) {
        this.author = author;
        this.name = name;
        this.writingYear = writingYear;
        this.releaseYear = releaseYear;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWritingYear(int writingYear) {
        this.writingYear = writingYear;
    }

    public int getWritingYear() {
        return writingYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getReleaseYear() {
        return releaseYear;
    }



    @Override
    public String toString() {
        return "\nАвтор: " + getAuthor() + "\nНазвание: " + getName() +
        "\nГод написания: " + getWritingYear() + "\nГод выпуска: " + getReleaseYear() + "\n\n";
    }

}
