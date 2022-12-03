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

        sergeevB.start();
        System.out.println(sergeevB.getDriverLicense());
        sergeevB.getDriverAuto(ladaVesta);

        DrB ivanovB=new DrB("Иванов Иван Иванович",4,ladaVesta);
        ivanovB.setDriverLicense(Dr.DL_B);
        System.out.println(ivanovB.getDriverLicense());
        System.out.println(ivanovB.getNameDriver());
        DrB fedorovD=new DrB("Федоров Федор Федорович",6, ladaVesta,Dr.DL_D);
        System.out.println(fedorovD.getDriverLicense());
        fedorovD.refill(ladaVesta,20);
        fedorovD.getDriverAuto(ladaVesta);


//        driverC.getDriverAuto(kamaz);
//        paz.pitStop();
//        paz.bestTime();
//        paz.maxSpeed();
//        bmw5.bestTime();
//


    }
}