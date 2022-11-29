public class Main {
    public static void main(String[] args) {

        Car ladaVesta = new Car("Lada", "Vesta", "бензин");
//        Car ladaKalina = new Car("Lada","Kalina",1.6);
//        Car bmw5 = new Car("BMW","X5","бензин");
////        Car kiaRio = new Car("Kia","Rio",1.6);
////
//        Trucks kamaz = new Trucks("Kamaz", "3008","дизель");
////
        Bus paz = new Bus("Паз", "2645","дизель");
////
//        paz.start();
//        paz.stop();
//        DriverB<Car> driverB = new DriverB<>("Иванов Иван Иванович", 4);
//        driverB.refill(paz,20);
//        driverB.getDriverAuto(ladaVesta);
//        DriverC driverC= new DriverC<>("Петров Петр Петрович",5);
//        driverC.getDriverAuto(kamaz);
//        System.out.println(driverC.getDriverLicense());
        DriverB<Car> sergeevB =new DriverB<>("Сергеев Сергей Сергеевич",4);
        System.out.println(sergeevB.getDriverLicense());
        sergeevB.getDriverAuto(ladaVesta);
        sergeevB.start();
        System.out.println(sergeevB.getDriverLicense());



//        driverC.getDriverAuto(kamaz);
//        paz.pitStop();
//        paz.bestTime();
//        paz.maxSpeed();
//        bmw5.bestTime();
//


    }
}