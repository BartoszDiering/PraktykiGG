package Dziedziczenie;

public abstract class Figura {

    private double bokA;
    public Figura(double bokA)
    {
        this.bokA = bokA;
    }
    public double getBokA()
    {
        return bokA;
    }
    public void setBokA(double bokA)
    {
        this.bokA = bokA;
    }

    public abstract double obliczPole();
}




