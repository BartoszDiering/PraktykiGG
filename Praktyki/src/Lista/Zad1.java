package Lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>(100);
        Scanner sc = new Scanner(System.in);
        String a;
        for(int i=0;i< 10;i++)
        {
            System.out.print("Dla elementu "+i+" przypiszesz wartość = ");
            a=sc.next();

            if (!lista.contains(a)){
                lista.add(i,a);
            }
            else if (lista.contains(a)){
                i=i-1;
            }
        }
        System.out.println(lista);

    }
}