package ApplePie;

import java.text.DecimalFormat;

public class ApplePieRecipe {

    public void printIngredients() {

        Ingredient dairyButter = new Ingredient(200, "gram", "ongezouten roomboter");
        Ingredient whiteCasterSugar = new Ingredient(200, "gram", "witte bastard suiker");
        Ingredient bakingFlour = new Ingredient(400, "gram", "zelfrijzend bakmeel");
        Ingredient egg = new Ingredient(1, "stuk(s)", "ei");
        Ingredient vanillaSugar = new Ingredient(8, "gram", "vanillesuiker");
        Ingredient salt = new Ingredient(1, "snuf", "zout");
        Ingredient apples = new Ingredient(1.5, "kilo", "zoetzure appels");
        Ingredient granulatedSugar = new Ingredient(75, "gram", "kristalsuiker");
        Ingredient cinnamon = new Ingredient(3, "theelepels", "kaneel");
        Ingredient breadCrumbs = new Ingredient(15, "gram", "paneermeel");

        DecimalFormat noDotZero = new DecimalFormat("#.#");

        System.out.println(noDotZero.format(dairyButter.getAmount()) + " " + dairyButter.getUnit() + " " + dairyButter.getName());
        System.out.println(noDotZero.format(whiteCasterSugar.getAmount()) + " " + whiteCasterSugar.getUnit() + " " + whiteCasterSugar.getName());
        System.out.println(noDotZero.format(bakingFlour.getAmount()) + " " + bakingFlour.getUnit() + " " + bakingFlour.getName());
        System.out.println(noDotZero.format(egg.getAmount()) + " " + egg.getUnit() + " " + egg.getName());
        System.out.println(noDotZero.format(vanillaSugar.getAmount()) + " " + vanillaSugar.getUnit() + " " + vanillaSugar.getName());
        System.out.println(noDotZero.format(salt.getAmount()) + " " + salt.getUnit() + " " + salt.getName());
        System.out.println(noDotZero.format(apples.getAmount()) + " " + apples.getUnit() + " " + apples.getName());
        System.out.println(noDotZero.format(granulatedSugar.getAmount()) + " " + granulatedSugar.getUnit() + " " + granulatedSugar.getName());
        System.out.println(noDotZero.format(cinnamon.getAmount()) + " " + cinnamon.getUnit() + " " + cinnamon.getName());
        System.out.println(noDotZero.format(breadCrumbs.getAmount()) + " " + breadCrumbs.getUnit() + " " + breadCrumbs.getName());

    }

    public void printInstructions() {

        System.out.println("Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)");
        System.out.println("Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.");
        System.out.println("Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.");
        System.out.println("Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.");
        System.out.println("Vet de springvorm in en bestrooi deze met bloem");
        System.out.println("Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.");
        System.out.println("Doe de heft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.");
        System.out.println("Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.");
        System.out.println("Leg de stroken kruislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken");
        System.out.println("Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.");

    }

}
