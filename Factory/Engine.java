package PractikaTryCatchFinally.Factory;

import PractikaTryCatchFinally.Factory.Enam.Motor;

import java.util.Random;

public class Engine {
    protected static final Engine v4 = new Engine(Motor.v4);
    protected static final Engine v6 = new Engine(Motor.v6);
    protected static final Engine v8 = new Engine(Motor.v8);
    protected static final Engine v10 = new Engine(Motor.v10);
    protected static final Engine w12 = new Engine(Motor.w12);
    protected boolean active;
    private final Motor motor;


    public Engine(Motor motor) {
        Random random = new Random();
        this.active = random.nextBoolean();
        this.motor = motor;
    }

    public String toString() {
        return motor.toString();
    }
}




