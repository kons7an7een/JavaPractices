package Practice4_1_10;

public class Ship extends Transport {

    Ship(double speed, double path, int q) {
        this.speed = speed;
        this.path = path;
        this.q = q;
    }
    @Override
    public double getPriceForPassengers() {
        return q * 5.2;
    }
    @Override
    public double getPriceForBaggage() {
        return 3;
    }

}
