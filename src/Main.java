import ApplePie.ApplePieRecipe;

public class Main {
    public static void main(String[] args) {
        ApplePieRecipe applePie = new ApplePieRecipe();

        System.out.println("Ingrediënten:");
        applePie.dairyButter();
        applePie.whiteCasterSugar();
        applePie.bakingFlour();
        applePie.eggs();
        applePie.vanillaSugar();
        applePie.salt();
        applePie.apples();
        applePie.granulatedSugar();
        applePie.cinnamon();
        applePie.breadCrumbs();
        System.out.println("Stappen:");
        applePie.preheatOven();
        applePie.useEggs();
        applePie.combineManyIngredientsAndDivideInThreeParts();
        applePie.cutApplesAndMixSugarAndCinnamon();
        applePie.prepareBakingMold();
        applePie.useDoughAndBreadCrumbs();
        applePie.fillBakingMold();
        applePie.useRemainingDough();
        applePie.useRemainingDoughStripsAndEggs();
        applePie.bakePie();
    }
}
