package Practice4_1_10;

public class Train extends Transport {

    Train(double speed, double path, int q) {
        this.speed = speed;
        this.path = path;
        this.q = q;
    }
    @Override
    public double getPriceForPassengers() {
        return q * 2.5;
    }
    @Override
    public double getPriceForBaggage() {
        return 2;
    }

}
