package VehicleManagementSystem;

public class Truck extends Vehicle{
    private double payloadCapacity;

    public Truck(String make, String model, int year, double payloadCapacity) {
        super(make, model, year);
        this.payloadCapacity = payloadCapacity;
    }
    public double getPayloadCapacity() {
        return payloadCapacity;
    }
    public void setPayloadCapacity(double payloadCapacity) {
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("make: " +getMake()+ "\nmodel: " +getModel()+ "\nyear: " +getYear()+ "\npayload capacity: " +getPayloadCapacity());
    }
}
