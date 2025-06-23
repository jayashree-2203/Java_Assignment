package assignemnt_AbstractClass.Product;

public class ClothingProduct extends Product {
    private String size;
    private String color;

    public ClothingProduct(String name, double price, String size, String color) {
        super(name, price);
        this.size = size;
        this.color = color;
    }

    @Override
    public String getDescription() {
        return name + " (Clothing) - Size: " + size + ", Color: " + color;
    }
}