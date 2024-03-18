package Car;

public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private int topSpeed;
    private String color;
    private String fuelType;
    private WheelType wheelType;
    private Engine engine;

    public Car(String brand, String model, String color, String fuelType, WheelType wheelType, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engine.getVolume();
        this.topSpeed = wheelType.topSpeed();
        this.color = color;
        this.fuelType = fuelType;
        this.wheelType = wheelType;
        this.engine = engine;
    }

    public void carInfo() {
        System.out.println("The " + this.brand + " " + this.model + " has a " + engine.getPower() + "HP " + this.engineVolume + "L " + this.fuelType
                + " engine. Combined with a set of " + wheelType.getBrand() + " " + wheelType.getDiameter() + " inch tyres with " + wheelType.getProfile()
                + " profile and a flashy " + this.color + " color, this beast is capable of " + this.topSpeed + "Km/h.");
    }

    public void addFuel(){
        if (!fullTank) {
            pumpMoreFuel();
        } else {
            stopRefuelingAndPayTheCashier();
        }
    }

}
