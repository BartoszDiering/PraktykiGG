package KlasyAbstrakcyjne;

public class Pies extends Zwierze2 implements ZwierzeDomowe{
    @Override
    public void bawSie() {
        System.out.println("Bawi się");
    }

    @Override
    void badzMilutki() {
        System.out.println("Jest milutki");
    }
}
