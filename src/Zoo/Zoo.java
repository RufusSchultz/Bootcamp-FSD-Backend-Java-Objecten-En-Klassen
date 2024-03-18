package Zoo;

import java.util.ArrayList;

public class Zoo {
    ArrayList<Animal> animals = new ArrayList<>();

    public Zoo() {
    }

    public Zoo(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public void addAnimal(Animal a){
        this.animals.add(a);

    }

    @Override
    public String toString() {
        return "This zoo contains the following animals: " + animals;
    }
}
