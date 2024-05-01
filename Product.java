public class Product {

    public static void main(String[] args) {
        // Testing the Product class
        Product product = new Product(101, "Laptop", 999.99, 10);
        System.out.println("Product ID: " + product.getProductId());
        System.out.println("Product Name: " + product.getProductName());
        System.out.println("Price: R" + product.getPrice());
        System.out.println("Quantity: " + product.getQuantity());

        // Update price and quantity
        product.updatePrice(1099.99);
        product.updateQuantity(8);

        System.out.println("Updated Price: R" + product.getPrice());
        System.out.println("Updated Quantity: " + product.getQuantity());
    }

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
