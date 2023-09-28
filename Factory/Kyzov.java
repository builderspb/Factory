package PractikaTryCatchFinally.Factory;

import PractikaTryCatchFinally.Factory.Enam.Body;

import java.util.Random;

public class Kyzov {

    protected static final Kyzov SEDAN = new Kyzov(Body.Sedan);
    protected static final Kyzov PICKUP = new Kyzov(Body.Pickup);
    protected static final Kyzov BUS = new Kyzov(Body.Bus);
    protected static final Kyzov TRACTOR = new Kyzov(Body.Tractor);
    protected boolean active;
    private final Body body;


    public Kyzov(Body body) {
        Random random = new Random();
        this.active = random.nextBoolean();
        this.body = body;
    }

    @Override
    public String toString() {
        return body.toString();
    }
}
