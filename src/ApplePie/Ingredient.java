package ApplePie;

import java.text.DecimalFormat;

public class Ingredient {
    private double amount;
    private String unit;
    private String name;

    public Ingredient() {
    }

    public Ingredient(double amount, String unit, String name) {
        this.amount = amount;
        this.unit = unit;
        this.name = name;
    }

//    @Override
//    public String toString() {
//        DecimalFormat noDotZero = new DecimalFormat("#.#");
//        return noDotZero.format(amount) + " " + unit + " " + name;
//    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
