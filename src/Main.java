import ApplePie.ApplePieRecipe;
import Car.Car;
import Car.Engine;
import Car.WheelType;
import Company.Company;
import Company.Manager;
import NasiGoreng.NasiGorengRecipe;
import Film.Film;
import Store.Store;
import Zoo.Zoo;
import Zoo.Animal;


public class Main {
    public static void main(String[] args) {

        showApplePieRecipe();
//        showNasiGorengRecipe();
//        showFilmList();
//        showStore();
//        showCompany();
//        showZoo();
//        showCar();

    }

    public static void showApplePieRecipe() {
        ApplePieRecipe applePie = new ApplePieRecipe();

        System.out.println("Recept voor appeltaart");
        System.out.println("Ingrediënten:");
        applePie.printIngredients();

        System.out.println("Stappen:");
        applePie.printInstructions();

    }

    public static void showNasiGorengRecipe() {
        NasiGorengRecipe nasiGoreng = new NasiGorengRecipe();

        System.out.println("Recept voor nasi goreng");
        System.out.println("Ingrediënten:");
        nasiGoreng.printIngredients();

        System.out.println("Stappen:");
        nasiGoreng.printInstructions();

    }

    public static void showFilmList() {
        Film filmList = new Film();
        filmList.printFilmList();
    }

    public static void showStore() {
        Store store = new Store();
        store.printTotalStock();
        simulateStore(store);
        store.printTotalStock();
    }

    public static void simulateStore(Store store) {
        store.addBassGuitar(5);
        store.sellBassGuitar(6);
        store.addUkelele(1);
        store.sellUkelele(10);
        store.addGuitar(2);
        store.sellGuitar(1);
    }

    public static void showCompany() {
        Manager janJansen = new Manager("Jan Jansen", 48);
        Company janDeTimmerman = new Company("Jan de Timmerman", janJansen);
        janDeTimmerman.showInfo();
    }

    public static void showZoo() {

        Animal elephant = new Animal("elephant", "mammals", "fruits and vegetables", "mainly outside and very spacious");
        Animal penguin = new Animal("penguin", "birds", "fish", "outside with plenty of water to swim in");
        Animal mantis = new Animal("praying mantis", "insects", "any smaller animal", "a big terrarium with twigs, leaves and branches");
        Zoo burgers = new Zoo();
        burgers.addAnimal(elephant);
        burgers.addAnimal(penguin);
        burgers.addAnimal(mantis);

        System.out.println(burgers);
    }

    public static void showCar(){
        Engine maxPower = new Engine(3.1, 456);
        WheelType racePro = new WheelType("Pirelli", 20, "racing");
        Car toottoot = new Car("Maserati", "Il Duce", "Vatican White", "diesel", racePro, maxPower);
        toottoot.carInfo();
    }

}


