package Lista;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        //Zadanie 3
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
        String pierwszy;
        String drugi;

        int a=0;
        int b=0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Które litery chcesz zamienić ze sobą: ");
        a=sc.nextInt();
        b=sc.nextInt();
        pierwszy=lista.get(a);
        drugi=lista.get(b);
        lista.set(a,drugi);
        lista.set(b,pierwszy);
        System.out.println(lista);
    }
}
