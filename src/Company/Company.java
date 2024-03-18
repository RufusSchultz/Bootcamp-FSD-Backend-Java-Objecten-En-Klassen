package Company;

public class Company {
    String name;
    Manager manager;

    public Company(String name, Manager manager) {
        this.name = name;
        this.manager = manager;
    }

    public void showInfo(){
        System.out.println("The company is called " + this.name + " and its manager is "
        + manager.name + ", at the age of " + manager.age + ".");
    }
}
