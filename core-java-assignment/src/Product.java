public class Product {
    private int productId;
    private String productName;
    private double price;

    public Product() {
        this.productId = 0;
        this.productName = "Unknown";
        this.price = 0.0;
    }

    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Error: Price cannot be negative.");
        }
    }
}
/*
Explanation:
This file defines the Product class to strictly demonstrate Encapsulation and Data Hiding.
All data fields are marked as private to prevent direct external modification of sensitive values, particularly the price.

Methods:
- Default Constructor and Overloaded Constructor: Used to create product instances with or without initial values.
- Getters (getProductId, getProductName, getPrice): Provide read-only access to the private fields.
- Setters (setProductId, setProductName, setPrice): Allow controlled modifications to the fields. The price setter specifically includes logic to prevent negative values, showcasing the protective nature of encapsulation.
*/
