import java.util.Arrays;

public class Car extends Transport implements Competing {
//    private Driver[] drivers;
//
//    public Driver[] getDrivers() {
//        return drivers;
//    }
//
//    public void setDrivers(Driver[] drivers) {
//        this.drivers = drivers;
//    }
//
//    @Override
//    public void addDriver(Driver driver) {
//        drivers = Arrays.copyOf(getDrivers(), getDrivers().length + 1);
//        drivers[getDrivers().length - 1] = driver;
//
//    }

    public Car(String brand, String model, String fuel) {
        super(brand, model, fuel);
    }

    public Car(String brand, String model, String fuel, double engineCapacity) {
        super(brand, model, fuel, engineCapacity);
    }

    @Override
    public void pitStop() {
        System.out.println("Провести pit-stop \n" + "pit-stop - проведен!");
    }

    @Override
    public void bestTime() {
        System.out.println(getBrand() + " " + getModel() + " - показал лучшее время на этом круге!!!");
    }

    @Override
    public void maxSpeed() {
        System.out.println("достиг максимальной скорости 150 км/ч");
    }


}
