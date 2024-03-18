package Store;

public class Store {
    Stock bassGuitar = new Stock("bass guitar", 2);
    Stock ukelele = new Stock("ukelele", 10);
    Stock guitar = new Stock("guitar", 5);

    public void printTotalStock(){
        System.out.println("Total stock is "
                + bassGuitar.getProductAmount() + "x " + bassGuitar.getProduct() + ", "
                + ukelele.getProductAmount() + "x " + ukelele.getProduct() + " and "
                + guitar.getProductAmount() + "x " + guitar.getProduct() + ".");
    }


    public void addBassGuitar(int amount) {
        bassGuitar.setProductAmount(bassGuitar.getProductAmount() + amount);
    }

    public void sellBassGuitar(int amount) {
        bassGuitar.setProductAmount(bassGuitar.getProductAmount() - amount);
    }

    public void addUkelele(int amount) {
        ukelele.setProductAmount(ukelele.getProductAmount() + amount);
    }

    public void sellUkelele(int amount) {
        ukelele.setProductAmount(ukelele.getProductAmount() - amount);
    }

    public void addGuitar(int amount) {
        guitar.setProductAmount(guitar.getProductAmount() + amount);
    }

    public void sellGuitar(int amount) {
        guitar.setProductAmount(guitar.getProductAmount() - amount);
    }



}
