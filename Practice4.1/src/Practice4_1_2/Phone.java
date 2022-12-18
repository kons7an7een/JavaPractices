package Practice4_1_2;

public class Phone {

    private int number;
    private String model;
    private int weight;

    Phone(int number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }
    Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }
    Phone() {}

    public int getNumber() {
        return number;
    }
    public String getModel() {
        return model;
    }
    public int getWeight() {
        return weight;
    }

    public void receiveCall(String name) {
        System.out.printf("Звонит %s.\n", name);
    }
    public void receiveCall(String name, int number) {
        System.out.printf("Звонит %s по номеру %d.\n", name, number);
    }

    public void sendMessage(int quantity, int[] phoneNumbers) {
        System.out.print("Сообщение будет отпралено следующим номерам:");
        for (int i = 0; i < quantity; i++) {
            System.out.print("\n\t" + phoneNumbers[i]);
        }
    }
}
