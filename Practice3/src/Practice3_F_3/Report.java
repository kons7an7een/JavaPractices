package Practice3_F_3;
import java.text.NumberFormat;
import java.util.*;

public class Report {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Сколько сотрудников в компании?");
        int N = input.nextInt();
        Employee[] workers = new Employee[N];
        for (int i = 0; i < N; i++) {
            input.nextLine();
            System.out.printf("Введите полное имя %d-го сотрудника: ", (i+1));
            String fullName = input.nextLine();
            System.out.print("Заработная плата сотрудника: ");
            double salary = input.nextDouble();
            Employee worker = new Employee(fullName, salary);
            workers[i] = worker;
        }
        generateReport(workers);
    }
    public static void generateReport(Employee[] workers) {
        for (int i = 0; i < workers.length; i++) {
            System.out.printf("Сотрудник №%d%n", (i + 1));
            System.out.printf("\tПолное имя: %s%n", workers[i].getFullname());
            System.out.printf("\tЗаработная плата: |%10.2f|%n", workers[i].getSalary());
        }
    }
}
