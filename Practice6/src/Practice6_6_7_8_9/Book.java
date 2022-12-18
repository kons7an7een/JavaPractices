package Practice6_6_7_8_9;

public class Book implements Printable {

    private String name;
    Book(String name) {
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    @Override
    public void print() {
        System.out.println(getName());
    }

}
