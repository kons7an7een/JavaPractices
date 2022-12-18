package Practice4_1;

public enum Seasons {

    Winter(-7.6),
    Spring(10.2),
    Summer(25.1){
        @Override
        public String getDescription() {
            return "Тёплое время года";
        }
    },
    Autumn(9);

    public void ILoveSeason(Seasons season) {
        switch (season) {
            case Winter:
                System.out.println("Я люблю зиму");
                break;
            case Spring:
                System.out.println("Я люблю весну");
                break;
            case Summer:
                System.out.println("Я люблю лето");
                break;
            case Autumn:
                System.out.println("Я люблю осень");
                break;
        }
    }

    private double t;

    private Seasons(double t) {
        this.t = t;
    }

    public double getT() {
        return t;
    }

    public String getDescription() {
        return "Холодное время года";
    }

}
