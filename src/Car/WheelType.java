package Car;

public class WheelType {
    private String brand;
    private double diameter;
    private String profile;

    public WheelType(String brand, double diameter, String profile) {
        this.brand = brand;
        this.diameter = diameter;
        this.profile = profile;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public int topSpeed(){
        return 549;
    }

}
