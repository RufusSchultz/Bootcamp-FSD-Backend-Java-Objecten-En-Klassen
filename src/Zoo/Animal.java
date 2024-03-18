package Zoo;

public class Animal {
    String name;
    String bioClass;
    String diet;
    String enclosure;

    public Animal(String name, String bioClass, String diet, String enclosure) {
        this.name = name;
        this.bioClass = bioClass;
        this.diet = diet;
        this.enclosure = enclosure;
    }

    @Override
    public String toString() {
        return "\nThe " + this.name + " belongs to the class of " + this.bioClass + ". Its main diet is "
                + diet + " and its enclosure is " + enclosure;
    }
}
