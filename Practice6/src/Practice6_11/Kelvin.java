package Practice6_11;

public class Kelvin implements Convertable {

    @Override
    public String convert(double T) {
        return (T + 273.15) + " K";
    }

}
