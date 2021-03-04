package Dziedziczenie;

public class Main
{
    public static void main(String[] args) {
        Kwadrat kwadrat=new Kwadrat(4);
        System.out.println(kwadrat.policzpole());
        System.out.println();
        Prostokat prostokat=new Prostokat(4,2);
        System.out.println(prostokat.policzpole());

    }
}