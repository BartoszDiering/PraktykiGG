package tablica;

import java.util.Random;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {

            //Przykład 5
            double[] power = {23.45, -2.22, 45.90, 67.45, -56, 234.11, -34.8, 90.4, -77};
            System.out.println("Element [0] = " + power[0]);
            System.out.println("Element [1] = " + power[1]);
            System.out.println("Element [2] = " + power[2]);
            System.out.println("Element [3] = " + power[3]);
            System.out.println("Element [4] = " + power[4]);
            System.out.println("Element [5] = " + power[5]);
            System.out.println("Element [6] = " + power[6]);
            System.out.println("Element [7] = " + power[7]);
            System.out.println("Element [8] = " + power[8]);
            System.out.println();
            System.out.println("Po zamianie liczb najwiewksza z najmniejsza miejscami: ");
            System.out.println();
            System.out.println("Element [0] = " + power[0]);
            System.out.println("Element [1] = " + power[1]);
            System.out.println("Element [2] = " + power[2]);
            System.out.println("Element [3] = " + power[3]);
            System.out.println("Element [4] = " + power[4]);
            System.out.println("Element [5] = " + power[8]);
            System.out.println("Element [6] = " + power[6]);
            System.out.println("Element [7] = " + power[7]);
            System.out.println("Element [8] = " + power[5]);

            //Przykład 6
            //(Odwrócenie Tablicy z PRZYKŁAD 5 )
            System.out.println("Przykład 6");
            System.out.println("Element [0] = " + power[0]);
            System.out.println("Element [1] = " + power[1]);
            System.out.println("Element [2] = " + power[2]);
            System.out.println("Element [3] = " + power[3]);
            System.out.println("Element [4] = " + power[4]);
            System.out.println("Element [5] = " + power[8]);
            System.out.println("Element [6] = " + power[6]);
            System.out.println("Element [7] = " + power[7]);
            System.out.println("Element [8] = " + power[5]);
            System.out.println();
            System.out.println("PO ODWROCENIU: ");
            System.out.println();
            System.out.println("Element [0] = " + power[5]);
            System.out.println("Element [1] = " + power[7]);
            System.out.println("Element [2] = " + power[6]);
            System.out.println("Element [3] = " + power[8]);
            System.out.println("Element [4] = " + power[4]);
            System.out.println("Element [5] = " + power[3]);
            System.out.println("Element [6] = " + power[2]);
            System.out.println("Element [7] = " + power[1]);
            System.out.println("Element [8] = " + power[0]);
        //Przykład 7
        //(Losowanie 2-óch liczb z tablicy PRZYKŁAD 5 i porównanie ich na koniec(>,==,<))
            System.out.println();
            System.out.println("Przykład 7 \n");
            Random random = new Random();
            int wylosowanaliczba;
            wylosowanaliczba= random.nextInt(power.length);
            double pierwsza=power[wylosowanaliczba];
            wylosowanaliczba= random.nextInt(power.length);
            double druga=power[wylosowanaliczba];

            if(druga==pierwsza){
                System.out.println("Liczba "+pierwsza+" jest równa "+druga);
            }
            if(druga>pierwsza){
                System.out.println("Liczba "+druga+" jest większa od "+pierwsza);
            }
            if(druga<pierwsza){
                System.out.println("Liczba" +pierwsza+" jest mniejsza od "+druga);
            }

            //Przykład 8
            //(Użyj Skanera i stwórz budowę postaci, gdzie dane zostają wpisane do tablicy, a
            //następnie wypisane do konsoli )
            System.out.println();
            Scanner scanner = new Scanner(System.in);
            String[] person = new String[4];// 0 - 3

            System.out.println("Podaj Imię:");
            person[0] = scanner.next();
            System.out.println("Podaj Rasa:");
            person[1] = scanner.next();
            System.out.println("Podaj Klasa:");
            person[2] = scanner.next();
            System.out.println("Podaj Broń:");
            person[3] = scanner.next();
            System.out.println(person[0]);
            System.out.println(person[1]);
            System.out.println(person[2]);
            System.out.println(person[3]);


        }
    }


