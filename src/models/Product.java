package models;

public class Product {
    private int productId;
    private String productName;
    private String description;
    private double price;
    private int categoryId;

    public Product(int productId, String productName, String description, double price, int categoryId) {
        this.productId = productId;
        this.productName = productName;
        this.description = description;
        this.price = price;
        this.categoryId = categoryId;
    }

    // Getters
    public int getProductId() { return productId; }
    public String getProductName() { return productName; }
    public String getDescription() { return description; }
    public double getPrice() { return price; }
    public int getCategoryId() { return categoryId; }
}
