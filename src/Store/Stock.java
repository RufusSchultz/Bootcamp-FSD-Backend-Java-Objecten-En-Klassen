package Store;

public class Stock {
private String product;
private int productAmount;


    public Stock(String product, int productAmount) {
        this.product = product;
        this.productAmount = productAmount;

    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getProductAmount() {
        return productAmount;
    }

    public void setProductAmount(int productAmount) {
        this.productAmount = productAmount;
    }

}
