public class Trucks extends Transport implements Competing {

    public Trucks(String brand, String model, String fuel) {
        super(brand, model,fuel);
    }

    public Trucks(String brand, String model,String fuel, double engineCapacity) {
        super(brand, model,fuel, engineCapacity);
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
