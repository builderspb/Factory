package PractikaTryCatchFinally.Factory;

public class WareHouse {
    protected Kyzov kyzov;
    protected Engine engine;
    protected CarSuspension carSuspension;
    protected Transmission transmission;
    protected Wheels wheels;
    protected String seats;
    protected String steering;

    public WareHouse(Kyzov kyzov, Engine engine, CarSuspension carSuspension, Transmission transmission, Wheels wheels) {
        this.kyzov = kyzov;
        this.engine = engine;
        this.carSuspension = carSuspension;
        this.transmission = transmission;
        this.wheels = wheels;
    }

    public static WareHouse getDetails(Kyzov kyzov, Engine engine, CarSuspension carSuspension, Transmission transmission, Wheels wheels) {
        return new WareHouse(kyzov, engine, carSuspension, transmission, wheels);
    }
}

//TODO В этом классе можно добавить отслеживание остатка деталей на складе.
//TODO Заказ деталей по мере необходимости
//TODO При поступившем заказе деталей из метода getComponentsFromTheWareHouse, и отсутствия этих деталей на складе WareHouse
// метод getDetails должен выбрасывать исключение с текстом какой конкретно детали нет, и автоматически делать ее заказ.

