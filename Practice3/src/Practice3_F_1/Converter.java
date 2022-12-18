package Practice3_F_1;

import java.util.*;
import java.text.*;

public class Converter {
    NumberFormat RU = NumberFormat.getCurrencyInstance();
    NumberFormat EU = NumberFormat.getCurrencyInstance(Locale.FRANCE);
    NumberFormat US = NumberFormat.getCurrencyInstance(Locale.US);
    NumberFormat CH = NumberFormat.getCurrencyInstance(Locale.CHINA);
    NumberFormat JP = NumberFormat.getCurrencyInstance(Locale.JAPAN);
    NumberFormat KR = NumberFormat.getCurrencyInstance(Locale.KOREA);
    Converter() {
        Scanner input = new Scanner(System.in);
        int cur1, cur2;
        double value;

        int wish = 1;
        while (wish == 1) {
            System.out.println("Валюты, конвертация которых возможна:\n1. Российский рубль" +
                    "\n2. Евро\n3. Доллар США\n4. Китайский юань" +
                    "\n5. Японская иена\n6. Южнокорейская вона");
            System.out.print("Введите номер валюты, которую хотите конвертировать: ");
            cur1 = input.nextInt();
            System.out.print("Введите номер валюты, курс которой Вы хотите узнать: ");
            cur2 = input.nextInt();
            System.out.print("Введите сумму денег: ");
            value = input.nextDouble();
            convert(cur1, cur2, value);
            System.out.println("Хотите повторить процедуру? (Введите 1, если да.)");
            wish = input.nextInt();
        }
    }

    private void convert(int cur1, int cur2, double value) {
        switch (cur1) {
            case 1:
                switch (cur2) {
                    case 1:
                        System.out.println(RU.format(value) + " = " + RU.format(value));
                        break;
                    case 2:
                        System.out.println(RU.format(value) + " = " + EU.format(value / 60.8));
                        break;
                    case 3:
                        System.out.println(RU.format(value) + " = " + US.format(value / 61.65));
                        break;
                    case 4:
                        System.out.println(RU.format(value) + " = " + CH.format(value / 8.46));
                        break;
                    case 5:
                        System.out.println(RU.format(value) + " = " + JP.format(value * 2.4));
                        break;
                    case 6:
                        System.out.println(RU.format(value) + " = " + KR.format(value * 23.18));
                        break;
                    default:
                        System.out.println("Конвертация невозможна!");
                        break;
                }
                break;
            case 2:
                switch (cur2) {
                    case 1:
                        System.out.println(EU.format(value) + " = " + RU.format(value * 60.8));
                        break;
                    case 2:
                        System.out.println(EU.format(value) + " = " + EU.format(value));
                        break;
                    case 3:
                        System.out.println(EU.format(value) + " = " + US.format(value / 1.01));
                        break;
                    case 4:
                        System.out.println(EU.format(value) + " = " + CH.format(value * 7.14));
                        break;
                    case 5:
                        System.out.println(EU.format(value) + " = " + JP.format(value * 145.62));
                        break;
                    case 6:
                        System.out.println(EU.format(value) + " = " + KR.format(value * 1409.32));
                        break;
                    default:
                        System.out.println("Конвертация невозможна!");
                        break;
                }
                break;
            case 3:
                switch (cur2) {
                    case 1:
                        System.out.println(US.format(value) + " = " + RU.format(value * 61.65));
                        break;
                    case 2:
                        System.out.println(US.format(value) + " = " + EU.format(value * 1.01));
                        break;
                    case 3:
                        System.out.println(US.format(value) + " = " + US.format(value));
                        break;
                    case 4:
                        System.out.println(US.format(value) + " = " + CH.format(value * 7.24));
                        break;
                    case 5:
                        System.out.println(US.format(value) + " = " + JP.format(value * 147.68));
                        break;
                    case 6:
                        System.out.println(US.format(value) + " = " + KR.format(value * 1429.13));
                        break;
                    default:
                        System.out.println("Конвертация невозможна!");
                        break;
                }
                break;
            case 4:
                switch (cur2) {
                    case 1:
                        System.out.println(CH.format(value) + " = " + RU.format(value * 8.46));
                        break;
                    case 2:
                        System.out.println(CH.format(value) + " = " + EU.format(value / 7.14));
                        break;
                    case 3:
                        System.out.println(CH.format(value) + " = " + US.format(value / 7.24));
                        break;
                    case 4:
                        System.out.println(CH.format(value) + " = " + CH.format(value));
                        break;
                    case 5:
                        System.out.println(CH.format(value) + " = " + JP.format(value * 20.39));
                        break;
                    case 6:
                        System.out.println(CH.format(value) + " = " + KR.format(value * 197.29));
                        break;
                    default:
                        System.out.println("Конвертация невозможна!");
                        break;
                }
                break;
            case 5:
                switch (cur2) {
                    case 1:
                        System.out.println(JP.format(value) + " = " + RU.format(value / 2.4));
                        break;
                    case 2:
                        System.out.println(JP.format(value) + " = " + EU.format(value / 145.62));
                        break;
                    case 3:
                        System.out.println(JP.format(value) + " = " + US.format(value / 147.68));
                        break;
                    case 4:
                        System.out.println(JP.format(value) + " = " + CH.format(value / 20.39));
                        break;
                    case 5:
                        System.out.println(JP.format(value) + " = " + JP.format(value));
                        break;
                    case 6:
                        System.out.println(JP.format(value) + " = " + KR.format(value * 9.68));
                        break;
                    default:
                        System.out.println("Конвертация невозможна!");
                        break;
                }
                break;
            case 6:
                switch (cur2) {
                    case 1:
                        System.out.println(KR.format(value) + " = " + RU.format(value / 23.18));
                        break;
                    case 2:
                        System.out.println(KR.format(value) + " = " + EU.format(value / 1409.32));
                        break;
                    case 3:
                        System.out.println(KR.format(value) + " = " + US.format(value / 1429.13));
                        break;
                    case 4:
                        System.out.println(KR.format(value) + " = " + CH.format(value / 197.29));
                        break;
                    case 5:
                        System.out.println(KR.format(value) + " = " + JP.format(value / 9.68));
                        break;
                    case 6:
                        System.out.println(KR.format(value) + " = " + KR.format(value));
                        break;
                    default:
                        System.out.println("Конвертация невозможна!");
                        break;
                }
                break;
            default:
                System.out.println("Конвертация невозможна!");
                break;
        }
    }

}
