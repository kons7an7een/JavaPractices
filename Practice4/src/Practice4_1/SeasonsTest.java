package Practice4_1;

public class SeasonsTest {
    public static void main(String[] args) {
        Seasons favorite = Seasons.Summer;
        System.out.println(favorite);
        favorite.ILoveSeason(favorite);
        for (Seasons seasons : Seasons.values()) {
            System.out.println("Наименование времени года: " + seasons +
                    "\nСредняя температура: " + seasons.getT() + "\n" + seasons.getDescription());
        }
    }
}
