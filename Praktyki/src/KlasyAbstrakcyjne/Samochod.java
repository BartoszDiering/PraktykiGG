package KlasyAbstrakcyjne;

public class Samochod implements Pojazd{
    @Override
    public void skrecwlewo() {
        System.out.println("skręca w lewo");
    }

    @Override
    public void jedzprosto() {
        System.out.println("jedzie prosto");
    }
}

