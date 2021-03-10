package Lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> array = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String x = scanner.nextLine();
            boolean a = false;
            for (String s : array) {
                if (s.equals(x)) {
                    a = true;
                    break;
                }
            }
            if (!a) {
                array.add(x);
            } else {
                System.out.println("Liczba już się powtórzyła!");
            }
            System.out.println("Dla elementu [" + i + "] przypisałeś wartość " + array.get(i));
        }
    }
}