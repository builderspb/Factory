package PractikaTryCatchFinally.Factory;

public class Sedan extends Car {

    private String color;
    private static final String redColor = "Red";

    public Sedan(Kyzov kyzov, Engine engine, CarSuspension carSuspension, Transmission transmission, Wheels wheels) {
        super(kyzov, engine, transmission, carSuspension, wheels);
        this.color = redColor;
    }

    public static String getRedColor() {
        return redColor;
    }

    @Override
    public String toString() {
        return redColor;
    }
}



