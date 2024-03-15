import ApplePie.ApplePieRecipe;
import NasiGoreng.NasiGorengRecipe;

public class Main {
    public static void main(String[] args) {

//        showApplePieRecipe();
        showNasiGorengRecipe();

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

}


