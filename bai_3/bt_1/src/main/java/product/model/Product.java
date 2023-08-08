package product.model;

public class Product {
    private int id;
    private String name;
    private Branch branch;
    private double price;
    private int quality;

    public Product() {
    }

    public Product(int id, String name, Branch branch, double price, int quality) {
        this.id = id;
        this.name = name;
        this.branch = branch;
        this.price = price;
        this.quality = quality;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }
}
