package NasiGoreng;

import ApplePie.Ingredient;

import java.text.DecimalFormat;

public class NasiGorengRecipe {
    public void printIngredients() {
        Ingredient rice = new Ingredient(1, "grote pan", "jasmijnrijst");
        Ingredient cornedBeef = new Ingredient(1, "blik", "corned beef");
        Ingredient leak = new Ingredient(1, "stuk(s)", "grote prei");
        Ingredient onion = new Ingredient(1, "stuk(s)", "grote ui");
        Ingredient bellPepper = new Ingredient(1, "stuk(s)", "rode paprika");
        Ingredient eggs = new Ingredient(2, "stuk(s)", "eieren");
        Ingredient garlic = new Ingredient(1, "flinke snuf", "knoflookpoeder");
        Ingredient pepper = new Ingredient(1, "snuf", "zwarte peper");
        Ingredient parsley = new Ingredient(2, "takjes", "verse peterselie");
        Ingredient oliveOil = new Ingredient(2, "eetlepels", "olijfolie");

        DecimalFormat noDotZero = new DecimalFormat("#.#");

        System.out.println(noDotZero.format(rice.getAmount()) + " " + rice.getUnit() + " " + rice.getName());
        System.out.println(noDotZero.format(cornedBeef.getAmount()) + " " + cornedBeef.getUnit() + " " + cornedBeef.getName());
        System.out.println(noDotZero.format(leak.getAmount()) + " " + leak.getUnit() + " " + leak.getName());
        System.out.println(noDotZero.format(onion.getAmount()) + " " + onion.getUnit() + " " + onion.getName());
        System.out.println(noDotZero.format(bellPepper.getAmount()) + " " + bellPepper.getUnit() + " " + bellPepper.getName());
        System.out.println(noDotZero.format(eggs.getAmount()) + " " + eggs.getUnit() + " " + eggs.getName());
        System.out.println(noDotZero.format(garlic.getAmount()) + " " + garlic.getUnit() + " " + garlic.getName());
        System.out.println(noDotZero.format(pepper.getAmount()) + " " + pepper.getUnit() + " " + pepper.getName());
        System.out.println(noDotZero.format(parsley.getAmount()) + " " + parsley.getUnit() + " " + parsley.getName());
        System.out.println(noDotZero.format(oliveOil.getAmount()) + " " + oliveOil.getUnit() + " " + oliveOil.getName());
    }

    public void printInstructions() {
        System.out.println("Doe de rijst in een rijststomer en was het goed. Zet het apparaat aan. Dit kan al veel eerder op de dag gedaan worden. Sterker nog, rijst dat over is van gisteren kan ook gebruikt worden.");
        System.out.println("Snij de ui, prei en paprika in kleine stukjes. Snij de peterselie fijn.");
        System.out.println("Breek de eieren in een kom kluts het. Voeg de peper en peterselie toe en kluts even door");
        System.out.println("Bak een omelet van de geklutste eieren. Snij of prak de omelet in kleine stukjes en leg opzij.");
        System.out.println("Verwarm de olijfolie in een wok en bak de uien kort. Bestrooi met het knoflookpoeder. Voeg daarna de prei en paprika toe en bak kort mee.");
        System.out.println("Haal de corned beef uit het blik en snij het in kleinere stukken. Doe het bij de rest in de wok en schep alles goed om.");
        System.out.println("Voeg tenslotte de stukjes omelet en rijst toe en schep het weer goed om. Selamat makan!");
    }
}
