public class Product {
    int productId;
    String productName;
    double price;
    int quantity;



    //constructor
    public Product ( int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }


    //getters
    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }
}
