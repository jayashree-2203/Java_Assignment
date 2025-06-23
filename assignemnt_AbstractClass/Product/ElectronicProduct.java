package assignemnt_AbstractClass.Product;

public class ElectronicProduct extends Product{
	private String brand;
    private int warrantyInMonths;

    public ElectronicProduct(String name, double price, String brand, int warrantyInMonths) {
        super(name, price);
        this.brand = brand;
        this.warrantyInMonths = warrantyInMonths;
    }

    @Override
    public String getDescription() {
        return name + " (Electronics) - Brand: " + brand + ", Warranty: " + warrantyInMonths + " months";
    }
}
