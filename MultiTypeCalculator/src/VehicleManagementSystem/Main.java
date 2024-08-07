package VehicleManagementSystem;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota", "Camry", 2020, 4);
        Car c2 = new Car("Mercedes", "c63", 2009, 2);

        Truck t1 = new Truck("Ford", "F150", 2019, 1.5);
        Truck t2 = new Truck("Dodge", "TRX", 2023, 2);

        c1.displayInfo();
        System.out.println("--------");
        c2.displayInfo();
        System.out.println("---------");
        t1.displayInfo();
        System.out.println("---------");
        t2.displayInfo();
        System.out.println("---------");
        c1.startEngine();
        t1.startEngine();
    }
}
