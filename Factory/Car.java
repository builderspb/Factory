package PractikaTryCatchFinally.Factory;

import java.util.function.Supplier;

public class Car {

    protected Kyzov kyzov;
    protected Engine engine;
    protected Transmission transmission;
    protected CarSuspension carSuspension;
    protected Wheels wheels;
    private StringBuilder damagedDetails = new StringBuilder();
    private int damageCounter = 0;
    private static final String RED = "\u001B[31m";
    private static final String RESETRED = "\u001B[0m";
    private static final String BLUE = "\033[0;33m";
    private static final String RESETBLUE = "\033[0m";
    private static final String YELLOW = "\033[34m";
    private static final String RESETYELLOW = "\033[0m";

    public Car(Kyzov kyzov, Engine engine, Transmission transmission, CarSuspension carSuspension, Wheels wheels) {
        this.kyzov = kyzov;
        this.engine = engine;
        this.transmission = transmission;
        this.carSuspension = carSuspension;
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return kyzov.toString();
    }

    public String getDamagedDetails() {
        return damagedDetails.toString();
    }

    public void addDamageDetail(String detail) {
        damagedDetails.append("\n")
                .append(++damageCounter)
                .append(". ")
                .append(detail);
    }

    public static String inspectCar(Car car) {
        inspectDetail(() -> car.kyzov.active, "Кузова", car);
        inspectDetail(() -> car.engine.active, "Двигателя", car);
        inspectDetail(() -> car.carSuspension.active, "Подвески", car);
        inspectDetail(() -> car.transmission.active, "Трансмиссии", car);

        if (car.getDamagedDetails().length() > 0) {
            return String.format("%sОбнаружены повреждения у автомобиля: %s%s%s", RED, car.kyzov, RESETRED, car.getDamagedDetails());
        } else {
            return String.format("%sУ автомобиля все детали в порядке.%s%s", BLUE, car.kyzov, RESETBLUE);
        }
    }

    private static void inspectDetail(Supplier<Boolean> isActiveSupplier, String errorMessage, Car car) {
        try {
            if (!isActiveSupplier.get()) {
                Malfunction.stend(errorMessage);
            }
        } catch (Malfunction malfunction) {
            car.addDamageDetail(YELLOW + malfunction.getMessage() + RESETYELLOW);
        }
    }
}




