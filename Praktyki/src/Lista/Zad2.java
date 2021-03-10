package Lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        //Zadanie 2 i 4
            try {
                List<String> lista = new ArrayList<>(10);
                lista.add(0,"a");
                lista.add(1,"b");
                lista.add(2,"c");
                lista.add(3,"d");
                lista.add(4,"e");
                lista.add(5,"f");
                lista.add(6,"g");
                lista.add(7,"h");
                lista.add(8,"i");
                lista.add(9,"j");

                Scanner sc = new Scanner(System.in);

                for(int i=0;i<5;i++)
                {
                    System.out.print("Element do usuniecia: ");
                    lista.remove(sc.nextInt());
                }
                System.out.println(lista);
            }catch (Exception exception){
                System.out.println("Błąd");
            }

        }
    }
