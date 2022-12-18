package Practice2_5;

public class Dog {
    private String name = "";
    private int age = 0;
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public int ageDogToHuman(int age) {
        int humanAge = age * 7;
        return humanAge;
    }
    public String ToString() {
        return "Dog {\n\tName: " + getName() + "\n\tAge: " + getAge() + "\n\tAge shifted to human one: " + ageDogToHuman(age) + "\n}";
    }
}
