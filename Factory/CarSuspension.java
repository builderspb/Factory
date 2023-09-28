package PractikaTryCatchFinally.Factory;

import PractikaTryCatchFinally.Factory.Enam.Hodovaya;

import java.util.Random;

public class CarSuspension {
    protected static final CarSuspension CLASSIC = new CarSuspension(Hodovaya.Classic);
    protected static final CarSuspension SPORT = new CarSuspension(Hodovaya.Sport);
    protected static final CarSuspension GRUZOVAYA = new CarSuspension(Hodovaya.Gruzovaya);
    protected boolean active;
    private final Hodovaya hodovaya;

    public CarSuspension(Hodovaya hodovaya) {
        Random random = new Random();
        this.active = random.nextBoolean();
        this.hodovaya = hodovaya;
    }

    @Override
    public String toString() {
        return hodovaya.toString();
    }
}



