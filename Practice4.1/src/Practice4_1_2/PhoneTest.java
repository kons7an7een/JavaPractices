package Practice4_1_2;

public class PhoneTest {
    public static void main(String[] args) {
        Phone Phone1 = new Phone(425265734, "iPhone 12", 163);
        Phone Phone2 = new Phone(864345710, "iPhone X", 174);
        Phone Phone3 = new Phone(198848377, "iPhone SE 3", 144);
        System.out.printf("Телефон 1:\n\t%d\n\t%s\n\t%d\n", Phone1.getNumber(), Phone1.getModel(), Phone1.getWeight());
        System.out.printf("Телефон 2:\n\t%d\n\t%s\n\t%d\n", Phone2.getNumber(), Phone2.getModel(), Phone2.getWeight());
        System.out.printf("Телефон 3:\n\t%d\n\t%s\n\t%d\n", Phone3.getNumber(), Phone3.getModel(), Phone3.getWeight());
        Phone1.receiveCall("директор");
        Phone2.receiveCall("друг", 12345678);
        int[] numbers = {12345678, 87654321, 80908098};
        Phone3.sendMessage(numbers.length, numbers);
    }
}
