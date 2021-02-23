public class Main {
    public static void main(String[] args) {

        //Zadanie 1. Wypisz text, który zawiera wszystkie dzisiaj pozanne zmienne (bez boolean).
        int A = 2003;
        double B = 16.3;
        char C = 'D';
        String D = "Bartek";
        System.out.println(A+ " " +B+ " " +C+ " " +D) ;

        //Zadanie 2. Napisz program, który oblicza sume: a^2 + b^2. Wypisz sam wynik(a i b są dowolne liczby typu int).
        int myIntA = 3;
        int myIntB = 6;
        int myIntC = myIntA * myIntA + myIntB * myIntB;
        System.out.println("Wynik = " +myIntC);

        //Zadanie 3. Oblicz pole trojkata rownobocznego. Bok ma dlugosc 7.
        int T = 7;
        double sqrt = Math.sqrt(3);
        System.out.println((T*T*sqrt)/4);

        //Zadanie 4. Wypisz imie i nazwisko za pomocą String-ów.
        String I = "Bartosz";
        String N = "Diering";
        System.out.println(I+ " " +N);
     }
}
