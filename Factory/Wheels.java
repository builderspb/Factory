package PractikaTryCatchFinally.Factory;

import PractikaTryCatchFinally.Factory.Enam.Kolesa;

public class Wheels {
    protected static final Wheels SPORTS = new Wheels(Kolesa.sports);
    protected static final Wheels HIGHWAY = new Wheels(Kolesa.highway);
    protected static final Wheels OFFROAD = new Wheels(Kolesa.offRoad);
    private final Kolesa kolesa;

    public Wheels(Kolesa kolesa) {
        this.kolesa = kolesa;
    }

    @Override
    public String toString() {
        return kolesa.toString();
    }
}







