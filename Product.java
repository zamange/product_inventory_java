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

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    //methods
    public void updatePrice(double newPrice){
        newPrice = price;
    }

    public void updateQuantity(int newQuantity){
        newQuantity = quantity;
    }

}
