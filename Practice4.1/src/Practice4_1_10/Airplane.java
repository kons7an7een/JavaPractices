package Practice4_1_10;

public class Airplane extends Transport {

    Airplane(double speed, double path, int q) {
        this.speed = speed;
        this.path = path;
        this.q = q;
    }
    @Override
    public double getPriceForPassengers() {
        return q * 8.99;
    }
    @Override
    public double getPriceForBaggage() {
        return 3;
    }

}
