package VehicleManagementSystem;

public class Car extends Vehicle{
    private int numberOfDoors;

    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }
    public int getNumberOfDoors() {
        return numberOfDoors;
    }
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void displayInfo() {
        System.out.println("make: " +getMake() + "\nmodel: " +getModel() + "\nyear: " +getYear()+ "\nNumber of Doors: " + getNumberOfDoors());

    }
}
