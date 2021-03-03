package Dziedziczenie;

public class Main
{
public static void main(String[] args)
{
    Kwadrat kwadrat  = new Kwadrat ( 4);
   System.out.println(kwadrat.obliczPole());
    Prostokat prostokat = new Prostokat (2,4);
    System.out.println(prostokat.obliczPole());
}
}
