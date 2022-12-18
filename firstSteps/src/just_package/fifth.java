package just_package;

public class fifth {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
            if (args[i].equals("-r")) System.out.println("REBOOT!");
        }
    }
}
