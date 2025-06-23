package assignemnt_AbstractClass.Product;

public abstract class Product 
{
	protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract String getDescription();
    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
