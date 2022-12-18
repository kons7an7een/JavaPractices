package Practice6_11;

public class Fahrenheit implements Convertable {

    @Override
    public String convert(double T) {
        return ((T * 9 / 5) + 32) + " °F";
    }

}
