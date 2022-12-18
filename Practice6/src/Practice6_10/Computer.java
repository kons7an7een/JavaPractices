package Practice6_10;

import java.util.*;

public class Computer implements Readable {

    Brands brand;
    private String name;
    private Processor CPU;
    private Memory memory;
    private Monitor monitor;

    @Override
    public void read() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите название процессора: ");
        CPU = new Processor(input.nextLine());
        System.out.print("Введите название памяти: ");
        memory = new Memory(input.nextLine());
        System.out.print("Введите название монитора: ");
        monitor = new Monitor(input.nextLine());
    }

    Computer(String name) {
        this.name = name;
        brand = Brands.Huawei;
    }

    public String getName() {
        return name;
    }

    public Brands getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Название компьютера - " + getName() +
                "\n\tПроцессор - " + CPU.getName() +
                "\n\tПамять - " + memory.getName() +
                "\n\tМонитор - " + monitor.getName();
    }

}
