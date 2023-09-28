package PractikaTryCatchFinally.Factory;

import static PractikaTryCatchFinally.Factory.AutomobileFactory.getComponentsFromTheWareHouse;
import static PractikaTryCatchFinally.Factory.Kyzov.*;
import static PractikaTryCatchFinally.Factory.Engine.*;
import static PractikaTryCatchFinally.Factory.CarSuspension.*;
import static PractikaTryCatchFinally.Factory.Transmission.*;
import static PractikaTryCatchFinally.Factory.Wheels.*;


public class AutomobileFactory {

    private static final String ZP = "Завод получил комплектующие для сборки автомобиля.";
    private static final String KP = "Комплектующие поступили на конвейер.";
    private static final String AC = "Автомобиль собран и готов к передаче в дилерский центр.";
    private static final String KY = "Кузов: ";
    private static final String COL = "Цвет: ";
    private static final String DV = "Двигатель: ";
    private static final String MD = "Модификация подвески: ";
    private static final String KST = "Количество скоростей трансмиссии: ";
    private static final String MH = "Модификация шин: ";


    public static WareHouse getComponentsFromTheWareHouse(Kyzov kyzov, Engine engine, CarSuspension carSuspension, Transmission transmission, Wheels wheels) {
        return WareHouse.getDetails(kyzov, engine, carSuspension, transmission, wheels);
    }

    public static void printToDisplay(Car car) {
        System.out.println(KP + "\n" + AC + "\n" + "   " + KY + car.kyzov + "   " + "\n" + "   " + DV + car.engine + "\n" + "   "
                + MD + car.carSuspension + "\n" + "   " + KST + car.transmission + "\n" + "   " + MH + car.wheels + "\n\n");
    }

    public Car carAssembly(WareHouse details) {
        if (details.kyzov == Kyzov.SEDAN) {
            Sedan sedan = new Sedan(details.kyzov, details.engine, details.carSuspension, details.transmission, details.wheels);
            System.out.println(ZP);
            AutomobileFactory.printToDisplay(sedan);
            return sedan;
        } else if (details.kyzov == PICKUP) {
            Pickup pickup = new Pickup(details.kyzov, details.engine, details.transmission, details.carSuspension, details.wheels);
            System.out.println(ZP);
            AutomobileFactory.printToDisplay(pickup);
            return pickup;
        } else if (details.kyzov == BUS) {
            Bus bus = new Bus(details.kyzov, details.engine, details.carSuspension, details.transmission, details.wheels);
            System.out.println(ZP);
            AutomobileFactory.printToDisplay(bus);
            return bus;
        } else if (details.kyzov == TRACTOR) {
            Tractor tractor = new Tractor(details.kyzov, details.engine, details.carSuspension, details.transmission, details.wheels);
            System.out.println(ZP);
            AutomobileFactory.printToDisplay(tractor);
            return tractor;
        }
        throw new IllegalArgumentException("Кузов " + details.kyzov + " отсутствует на складе");
    }
}

class Test {
    public static void main(String[] args) {
        AutomobileFactory automobileFactory = new AutomobileFactory();

        Car car1 = automobileFactory.carAssembly(getComponentsFromTheWareHouse(TRACTOR, v8, GRUZOVAYA, MANUAL9, OFFROAD));
        Car car2 = automobileFactory.carAssembly(getComponentsFromTheWareHouse(SEDAN, w12, SPORT, Dsg8, SPORTS));
        Car car3 = automobileFactory.carAssembly(getComponentsFromTheWareHouse(BUS, v10, CLASSIC, Dsg7, HIGHWAY));
        Car car4 = automobileFactory.carAssembly(getComponentsFromTheWareHouse(PICKUP, v8, GRUZOVAYA, Dsg8, OFFROAD));

        String result1 = Car.inspectCar(car1);
        String result2 = Car.inspectCar(car2);
        String result3 = Car.inspectCar(car3);
        String result4 = Car.inspectCar(car4);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

    }
}

