Product Class

Description:
The Product class represents a product with properties like product ID, name, price, and quantity. It provides methods to update the price and quantity of the product.

Usage:
1. Create a Product object with a product ID, name, price, and quantity.
2. Retrieve product information using getter methods like getProductId(), getProductName(), getPrice(), and getQuantity().
3. Update the price and quantity of the product using updatePrice(double newPrice) and updateQuantity(int newQuantity) methods.
4. Test the functionality of the Product class using the main method.

Example:
Product product = new Product(101, "Laptop", 999.99, 10);
product.updatePrice(1099.99);
product.updateQuantity(8);
