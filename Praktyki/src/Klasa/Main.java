package Klasa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Zadanie 1
        Trojkat Trojkat = new Trojkat(4, 4, 15);
        Trojkat.obliczPole();
        Trojkat.obwodT();

        System.out.println("\t");

        // Zadanie 2
        Prostokat Prostokat = new Prostokat(12, 12);
        System.out.println(Prostokat.getPole());
        System.out.println(Prostokat.getPrzekatne());
        Prostokat.setBokA(7);
        Prostokat.setBokB(6);
        System.out.println(Prostokat.getPole());
        System.out.println(Prostokat.getPrzekatne());

        System.out.println("\t");

        //Zadanie 3
        Prostokat prostokat = new Prostokat(2, 2);
        Trojkat trojkat = new Trojkat(4, 4, 15);
        if (trojkat.getBokA() == prostokat.getBokA()) System.out.println("boki są równe");
        else if (trojkat.getBokA() > prostokat.getBokA()) System.out.println("bok trójkąta jest dłuźszy");
        else System.out.println("bok prostkąta jest dłuźszy");
        System.out.println("bok prostokąta " + prostokat.getBokA());
        System.out.println("bok trójkąta " + trojkat.getBokA());

        System.out.println("\t");

        //Zadanie 4
        ProstyKalkulator prostykalkulator = new ProstyKalkulator(6, 2);
        Scanner sc = new Scanner(System.in);
        boolean dzialaprogram = true;
        while (dzialaprogram) {
            System.out.println("dodawanie[1]");
            System.out.println("odejmowanie[2]");
            System.out.println("mnożenie[3]");
            System.out.println("dzielenie[4]");
            System.out.println("wyłącz[5]");

            String userInput = sc.next();

            System.out.println("podaj pierwszą liczbę ");
            double licz1 = sc.nextDouble();

            System.out.println("podaj drugą liczbę ");
            double licz2 = sc.nextDouble();

            prostykalkulator.setA(licz1);
            prostykalkulator.setB(licz2);

            switch (userInput) {
                case "1": {
                    prostykalkulator.dodawanie();
                    break;
                }
                case "2": {
                    prostykalkulator.odejmowanie();
                    break;
                }
                case "3": {
                    prostykalkulator.mnozenie();
                    break;
                }
                case "4": {
                    prostykalkulator.dzielenie();
                    break;
                }
                case "5": {
                    dzialaprogram = false;
                    break;
                }
                default: {
                    System.out.println("Wybrałeś złą liczbę1!");
                }
            }
        }
        System.out.println("\t");
        //Zadanie 5
       Okrag okrag = new Okrag(8);
        okrag.setSrednica();
        okrag.setPole();
        okrag.obwodkola();
    }
}




