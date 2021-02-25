import java.util.Scanner;

public class Petle
{
    public static void main (String[] args) {
        //Zadanie 1
        //Napisz pętle, która wypisze znaki(A-Z) z tabeli ASCII.
        //Wynikiem mają być wypisane znaki (!! CO DRUGI !!) .

        char Litera = 'A';

        for (int i = 0; i < 26; i++) {
            if (i % 2 == 0)
                System.out.print(Litera + "\t");
            Litera++;
        }
        System.out.println(" ");



        //Zadanie 2
        //Napisz pętle, która wypisze ciąg fibonacciego o długości X
        //(gdzie x jest zdefinowana zmienną)

        int a, b, c;
        a=b=1;
        int numberOfCalculations = 10;
        System.out.print(a + "\t" + b + "\t");
        for (int i = 0; i<numberOfCalculations; i++){
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + "\t");

        }
        System.out.println("");
    }

}
