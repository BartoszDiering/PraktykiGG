package Dziedziczenie;

public class Kwadrat extends Figura
{
public Kwadrat(double bokA)
{
super(bokA);
}
public double obliczPole()
{
return getBokA() * getBokA();
}
}
