package models;

public class ProductImage {
    private int imageId;
    private int productId;
    private String imageUrl;

    public ProductImage(int imageId, int productId, String imageUrl) {
        this.imageId = imageId;
        this.productId = productId;
        this.imageUrl = imageUrl;
    }

    public String getImageUrl() { return imageUrl; }
}