package tablica;

import java.util.Random;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {

            //Przykład 5
            double[] power = {23.45, -2.22, 45.90, 67.45, -56, 234.11,-34.8, 90.4, -77};
            double min = power[0];
            double max = power[0];
            int min2 = 0;
            int max2 = 0;
            for(int i = 0; i < 9; i++)
            {
                    if(max < power[i])
                    {
                            max = power[i];
                            max2 = i;
                    }
                    if(min > power[i])
                    {
                            min = power[i];
                            min2 = i;
                    }
                    System.out.println("element [" + i + "] = " + power[i]);
            }
            power[max2] = min;
            power[min2] = max;
            System.out.println();
            System.out.println("Po zamianie liczb najwieksza z najmniejsza miejscami");
            System.out.println();
            for( int j = 0; j < 9; j++)
            {
                    System.out.println("element [" + j + "] = " + power[j]);
            }
            System.out.println();

            //Przykład 6
            //(Odwrócenie Tablicy z PRZYKŁAD 5 )

            System.out.println("Odwrócenie tablicy\n");
            double numA;
            double numB;
            for(int k = 0; k < power.length/2;k++){
                    numA = power[k];
                    numB = power[power.length - 1 - k];
                    power[k] = numB;
                    power[power.length - 1 - k] = numA;
            }
            for(int k = 0; k < power.length; k++){
                    System.out.println("El [" + k + "] = " + power[k]);
            }

        //Przykład 7
        //(Losowanie 2-óch liczb z tablicy PRZYKŁAD 5 i porównanie ich na koniec(>,==,<))
            System.out.println();
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


