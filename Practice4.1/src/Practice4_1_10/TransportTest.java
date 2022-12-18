package Practice4_1_10;

public class TransportTest {

    public static void main(String[] args) {
        Car car = new Car(40, 250, 4);
        Airplane plane = new Airplane(800, 250, 4);
        Train train = new Train(110, 250, 4);
        Ship ship = new Ship(37.05, 250, 4);
        System.out.println("АВТОМОБИЛЬ\n" + car.toString() + "\n");
        System.out.println("САМОЛЁТ\n" + plane.toString() + "\n");
        System.out.println("ПОЕЗД\n" + train.toString() + "\n");
        System.out.println("КОРАБЛЬ\n" + ship.toString() + "\n");
    }

}
