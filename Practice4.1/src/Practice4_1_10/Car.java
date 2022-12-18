package Practice4_1_10;

public class Car extends Transport {

    Car(double speed, double path, int q) {
        this.speed = speed;
        this.path = path;
        this.q = q;
    }

    @Override
    public double getPriceForPassengers() {
        return q * 3.14;
    }
    @Override
    public double getPriceForBaggage() {
        return 2;
    }

}
