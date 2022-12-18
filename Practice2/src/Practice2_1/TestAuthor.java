package Practice2_1;

public class TestAuthor {
    public static void main(String[] args) {
        String name = "Konstantin", email = "salamatin2003@gmail.com";
        char gender = 'M';
        Author Someone = new Author(name, email, gender);
        printAuthor(Someone);
        System.out.println("----------");
        email = "raveairlines.music@gmail.com";
        Someone.setEmail(email);
        printAuthor(Someone);
    }
    public static void printAuthor(Author Someone) {
        System.out.println("Автор:\n\tИмя - " + Someone.getName() + "\n\tЭл. почта - " + Someone.getEmail()
        + "\n\tПол - " + Someone.getGender());
    }
}
