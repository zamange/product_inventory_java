public class Product {
    private int productId;
    private String productName;
    private double price;
    private int quantity;



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
        this.price = newPrice;
    }

    public void updateQuantity(int newQuantity){
        this.quantity = newQuantity;
    }

}
