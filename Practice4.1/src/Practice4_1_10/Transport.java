package Practice4_1_10;

import java.util.*;
import java.text.NumberFormat;

public abstract class Transport {

    protected double speed;
    protected double path;
    protected int q;

    public double getSpeed() {
        return speed;
    }
    public double getPath() {
        return path;
    }
    public int getQ() {
        return q;
    }

    public double getTime() {
        return path / speed;
    }

    public abstract double getPriceForPassengers();
    public abstract double getPriceForBaggage();

    public double getFullPrice() {
        return getPriceForPassengers() + getPriceForBaggage();
    }

    @Override
    public String toString() {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.US);
        return  "Скорость: " + getSpeed() + " км/ч\nРасстояние, которое надо проехать: " +
                getPath() + " км" + "\nВремя на путь: " + getTime() +
                " ч\nКоличество пассажиров: " + getQ() + "\nСтоимость пути: " +
                numberFormat.format(getPriceForPassengers()) + "\nСтоимость багажа: " +
                numberFormat.format(getPriceForBaggage()) + "\nПолная стоимость поездки: " +
                numberFormat.format(getFullPrice());
    }
}
