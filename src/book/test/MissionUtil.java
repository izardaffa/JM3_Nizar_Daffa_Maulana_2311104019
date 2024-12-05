package book.test;


import java.text.NumberFormat;
import java.util.Scanner;

public class MissionUtil {
    public static int getIntegerInput() {
        Scanner scanner =  new Scanner(System.in);

        return scanner.nextInt();
    }

    public static String getStringInput() {
        Scanner scanner =  new Scanner(System.in);

        return scanner.nextLine();
    }

    public static String moneyFormat(int price) {
        NumberFormat numberFormat = NumberFormat.getNumberInstance();

        return numberFormat.format(price);
    }
}
