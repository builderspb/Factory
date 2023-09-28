package PractikaTryCatchFinally.Factory;

public class Pickup extends Car {

    private static String color;
    private final int bodyVolume = 2500;
    private final int groundClearance = 255;


    public Pickup(Kyzov body, Engine engine, Transmission transmission, CarSuspension carSuspension, Wheels wheels) {
        super(body, engine, transmission, carSuspension, wheels);
    }

    public static void setColor(String color) {
        Pickup.color = color;
    }

    public static String getColor() {
        return color;
    }
}







