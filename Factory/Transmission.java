package PractikaTryCatchFinally.Factory;

import PractikaTryCatchFinally.Factory.Enam.Korobka;

import java.util.Random;

public class Transmission {
    protected static final Transmission Dsg8 = new Transmission(Korobka.Dsg8);
    protected static final Transmission Dsg7 = new Transmission(Korobka.Dsg7);
    protected static final Transmission MANUAL9 = new Transmission(Korobka.Manual9);
    protected boolean active;
    private final Korobka korobka;

    public Transmission(Korobka korobka) {
        Random random = new Random();
        this.active = random.nextBoolean();
        this.korobka = korobka;
    }

    public String toString() {
        return korobka.toString();
    }
}

