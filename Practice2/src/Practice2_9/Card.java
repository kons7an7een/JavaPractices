package Practice2_9;

import java.util.*;

public class Card {

    private String type;
    private String color;

    Card() {
        this.type = "";
        this.color = "";
    }

    Card(String type, String color) {
        this.type = type;
        this.color = color;
    }

    public String getParameters() {
        return color + " " + type;
    }
}